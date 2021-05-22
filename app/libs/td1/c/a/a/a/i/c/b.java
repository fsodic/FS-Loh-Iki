package c.a.a.a.i.c;

import c.a.a.a.e.b.f;
import c.a.a.a.e.d;
import c.a.a.a.e.q;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import java.io.InterruptedIOException;

@Deprecated
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    protected final d f813a;

    /* renamed from: b  reason: collision with root package name */
    protected final q f814b;

    /* renamed from: c  reason: collision with root package name */
    protected volatile c.a.a.a.e.b.b f815c;
    protected volatile Object d;
    protected volatile f e = null;

    protected b(d dVar, c.a.a.a.e.b.b bVar) {
        a.a(dVar, "Connection operator");
        this.f813a = dVar;
        this.f814b = dVar.createConnection();
        this.f815c = bVar;
    }

    public Object a() {
        return this.d;
    }

    public void a(c.a.a.a.e.b.b bVar, e eVar, g gVar) {
        a.a(bVar, "Route");
        a.a(gVar, "HTTP parameters");
        if (this.e != null) {
            c.a.a.a.p.b.a(!this.e.c(), "Connection already open");
        }
        this.e = new f(bVar);
        o proxyHost = bVar.getProxyHost();
        this.f813a.a(this.f814b, proxyHost != null ? proxyHost : bVar.getTargetHost(), bVar.getLocalAddress(), eVar, gVar);
        f fVar = this.e;
        if (fVar == null) {
            throw new InterruptedIOException("Request aborted");
        } else if (proxyHost == null) {
            fVar.a(this.f814b.isSecure());
        } else {
            fVar.a(proxyHost, this.f814b.isSecure());
        }
    }

    public void a(e eVar, g gVar) {
        a.a(gVar, "HTTP parameters");
        c.a.a.a.p.b.a(this.e, "Route tracker");
        c.a.a.a.p.b.a(this.e.c(), "Connection not open");
        c.a.a.a.p.b.a(this.e.isTunnelled(), "Protocol layering without a tunnel not supported");
        c.a.a.a.p.b.a(!this.e.isLayered(), "Multiple protocol layering not supported");
        this.f813a.a(this.f814b, this.e.getTargetHost(), eVar, gVar);
        this.e.b(this.f814b.isSecure());
    }

    public void a(Object obj) {
        this.d = obj;
    }

    public void a(boolean z, g gVar) {
        a.a(gVar, "HTTP parameters");
        c.a.a.a.p.b.a(this.e, "Route tracker");
        c.a.a.a.p.b.a(this.e.c(), "Connection not open");
        c.a.a.a.p.b.a(!this.e.isTunnelled(), "Connection is already tunnelled");
        this.f814b.a(null, this.e.getTargetHost(), z, gVar);
        this.e.c(z);
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.e = null;
        this.d = null;
    }
}
