package c.a.a.a.i;

import c.a.a.a.AbstractC0125i;
import c.a.a.a.i.e.b;
import c.a.a.a.i.f.j;
import c.a.a.a.j.c;
import c.a.a.a.j.d;
import c.a.a.a.j.e;
import c.a.a.a.j.f;
import c.a.a.a.j.g;
import c.a.a.a.m;
import c.a.a.a.r;
import c.a.a.a.t;
import c.a.a.a.u;
import java.io.IOException;
import java.net.SocketTimeoutException;

@Deprecated
public abstract class a implements AbstractC0125i {

    /* renamed from: a  reason: collision with root package name */
    private final b f725a = c();

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.a.i.e.a f726b = b();

    /* renamed from: c  reason: collision with root package name */
    private f f727c = null;
    private g d = null;
    private c.a.a.a.j.b e = null;
    private c<t> f = null;
    private d<r> g = null;
    private e h = null;

    /* access modifiers changed from: protected */
    public e a(e eVar, e eVar2) {
        return new e(eVar, eVar2);
    }

    /* access modifiers changed from: protected */
    public abstract c<t> a(f fVar, u uVar, c.a.a.a.l.g gVar);

    /* access modifiers changed from: protected */
    public d<r> a(g gVar, c.a.a.a.l.g gVar2) {
        return new j(gVar, null, gVar2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public void a(f fVar, g gVar, c.a.a.a.l.g gVar2) {
        c.a.a.a.p.a.a(fVar, "Input session buffer");
        this.f727c = fVar;
        c.a.a.a.p.a.a(gVar, "Output session buffer");
        this.d = gVar;
        if (fVar instanceof c.a.a.a.j.b) {
            this.e = (c.a.a.a.j.b) fVar;
        }
        this.f = a(fVar, d(), gVar2);
        this.g = a(gVar, gVar2);
        this.h = a(fVar.getMetrics(), gVar.getMetrics());
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(m mVar) {
        c.a.a.a.p.a.a(mVar, "HTTP request");
        a();
        if (mVar.getEntity() != null) {
            this.f725a.a(this.d, mVar, mVar.getEntity());
        }
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(r rVar) {
        c.a.a.a.p.a.a(rVar, "HTTP request");
        a();
        this.g.a(rVar);
        this.h.a();
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(t tVar) {
        c.a.a.a.p.a.a(tVar, "HTTP response");
        a();
        tVar.a(this.f726b.a(this.f727c, tVar));
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.i.e.a b() {
        return new c.a.a.a.i.e.a(new c.a.a.a.i.e.c());
    }

    /* access modifiers changed from: protected */
    public b c() {
        return new b(new c.a.a.a.i.e.d());
    }

    /* access modifiers changed from: protected */
    public u d() {
        return c.f788a;
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.d.flush();
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        c.a.a.a.j.b bVar = this.e;
        return bVar != null && bVar.a();
    }

    @Override // c.a.a.a.AbstractC0125i
    public void flush() {
        a();
        e();
    }

    @Override // c.a.a.a.AbstractC0125i
    public boolean isResponseAvailable(int i) {
        a();
        try {
            return this.f727c.isDataAvailable(i);
        } catch (SocketTimeoutException unused) {
            return false;
        }
    }

    @Override // c.a.a.a.j
    public boolean isStale() {
        if (!isOpen() || f()) {
            return true;
        }
        try {
            this.f727c.isDataAvailable(1);
            return f();
        } catch (SocketTimeoutException unused) {
            return false;
        } catch (IOException unused2) {
            return true;
        }
    }

    @Override // c.a.a.a.AbstractC0125i
    public t receiveResponseHeader() {
        a();
        t parse = this.f.parse();
        if (parse.getStatusLine().getStatusCode() >= 200) {
            this.h.b();
        }
        return parse;
    }
}
