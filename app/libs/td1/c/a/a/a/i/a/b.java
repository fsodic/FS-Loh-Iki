package c.a.a.a.i.a;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.C0119c;
import c.a.a.a.a.n;
import c.a.a.a.k.q;
import c.a.a.a.n.a;
import c.a.a.a.n.e;
import c.a.a.a.p.d;
import c.a.a.a.p.f;
import c.a.a.a.r;
import java.nio.charset.Charset;

public class b extends m {
    private boolean d;

    public b() {
        this(C0119c.f646b);
    }

    public b(Charset charset) {
        super(charset);
        this.d = false;
    }

    @Override // c.a.a.a.a.c
    @Deprecated
    public AbstractC0121e a(n nVar, r rVar) {
        return a(nVar, rVar, new a());
    }

    @Override // c.a.a.a.i.a.a, c.a.a.a.a.m
    public AbstractC0121e a(n nVar, r rVar, e eVar) {
        c.a.a.a.p.a.a(nVar, "Credentials");
        c.a.a.a.p.a.a(rVar, "HTTP request");
        StringBuilder sb = new StringBuilder();
        sb.append(nVar.getUserPrincipal().getName());
        sb.append(":");
        sb.append(nVar.getPassword() == null ? "null" : nVar.getPassword());
        byte[] a2 = c.a.a.a.h.a.a(f.a(sb.toString(), a(rVar)), 2);
        d dVar = new d(32);
        dVar.a(a() ? "Proxy-Authorization" : "Authorization");
        dVar.a(": Basic ");
        dVar.a(a2, 0, a2.length);
        return new q(dVar);
    }

    @Override // c.a.a.a.i.a.a, c.a.a.a.a.c
    public void a(AbstractC0121e eVar) {
        super.a(eVar);
        this.d = true;
    }

    @Override // c.a.a.a.a.c
    public String getSchemeName() {
        return "basic";
    }

    @Override // c.a.a.a.a.c
    public boolean isComplete() {
        return this.d;
    }

    @Override // c.a.a.a.a.c
    public boolean isConnectionBased() {
        return false;
    }

    @Override // c.a.a.a.i.a.a
    public String toString() {
        return "BASIC [complete=" + this.d + "]";
    }
}
