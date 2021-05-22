package c.a.a.a.i.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.a.j;
import c.a.a.a.a.n;
import c.a.a.a.a.o;
import c.a.a.a.a.p;
import c.a.a.a.a.q;
import c.a.a.a.p.d;
import c.a.a.a.r;

public class k extends a {

    /* renamed from: b  reason: collision with root package name */
    private final i f742b;

    /* renamed from: c  reason: collision with root package name */
    private a f743c;
    private String d;

    enum a {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public k() {
        this(new j());
    }

    public k(i iVar) {
        c.a.a.a.p.a.a(iVar, "NTLM engine");
        this.f742b = iVar;
        this.f743c = a.UNINITIATED;
        this.d = null;
    }

    @Override // c.a.a.a.a.c
    public AbstractC0121e a(n nVar, r rVar) {
        try {
            q qVar = (q) nVar;
            a aVar = this.f743c;
            if (aVar == a.FAILED) {
                throw new j("NTLM authentication failed");
            } else if (aVar == a.CHALLENGE_RECEIVED) {
                i iVar = this.f742b;
                qVar.a();
                throw null;
            } else if (aVar == a.MSG_TYPE2_RECEVIED) {
                i iVar2 = this.f742b;
                qVar.b();
                throw null;
            } else {
                throw new j("Unexpected state: " + this.f743c);
            }
        } catch (ClassCastException unused) {
            throw new o("Credentials cannot be used for NTLM authentication: " + nVar.getClass().getName());
        }
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.a.a
    public void a(d dVar, int i, int i2) {
        a aVar;
        this.d = dVar.b(i, i2);
        if (this.d.isEmpty()) {
            aVar = this.f743c == a.UNINITIATED ? a.CHALLENGE_RECEIVED : a.FAILED;
        } else if (this.f743c.compareTo((Enum) a.MSG_TYPE1_GENERATED) < 0) {
            this.f743c = a.FAILED;
            throw new p("Out of sequence NTLM response message");
        } else if (this.f743c == a.MSG_TYPE1_GENERATED) {
            aVar = a.MSG_TYPE2_RECEVIED;
        } else {
            return;
        }
        this.f743c = aVar;
    }

    @Override // c.a.a.a.a.c
    public String getRealm() {
        return null;
    }

    @Override // c.a.a.a.a.c
    public String getSchemeName() {
        return "ntlm";
    }

    @Override // c.a.a.a.a.c
    public boolean isComplete() {
        a aVar = this.f743c;
        return aVar == a.MSG_TYPE3_GENERATED || aVar == a.FAILED;
    }

    @Override // c.a.a.a.a.c
    public boolean isConnectionBased() {
        return true;
    }
}
