package c.a.a.a.i.c;

import c.a.a.a.e.b;
import c.a.a.a.e.q;
import c.a.a.a.l.g;
import c.a.a.a.n.e;

@Deprecated
public abstract class c extends a {
    protected volatile b f;

    protected c(b bVar, b bVar2) {
        super(bVar, bVar2.f814b);
        this.f = bVar2;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.c.a
    public synchronized void a() {
        this.f = null;
        super.a();
    }

    @Override // c.a.a.a.e.o
    public void a(c.a.a.a.e.b.b bVar, e eVar, g gVar) {
        b f2 = f();
        a(f2);
        f2.a(bVar, eVar, gVar);
    }

    /* access modifiers changed from: protected */
    public void a(b bVar) {
        if (e() || bVar == null) {
            throw new f();
        }
    }

    @Override // c.a.a.a.e.o
    public void a(e eVar, g gVar) {
        b f2 = f();
        a(f2);
        f2.a(eVar, gVar);
    }

    @Override // c.a.a.a.e.o
    public void a(boolean z, g gVar) {
        b f2 = f();
        a(f2);
        f2.a(z, gVar);
    }

    @Override // java.io.Closeable, c.a.a.a.j, java.lang.AutoCloseable
    public void close() {
        b f2 = f();
        if (f2 != null) {
            f2.b();
        }
        q c2 = c();
        if (c2 != null) {
            c2.close();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public b f() {
        return this.f;
    }

    @Override // c.a.a.a.e.n, c.a.a.a.e.o
    public c.a.a.a.e.b.b getRoute() {
        b f2 = f();
        a(f2);
        if (f2.e == null) {
            return null;
        }
        return f2.e.e();
    }

    @Override // c.a.a.a.e.o
    public void setState(Object obj) {
        b f2 = f();
        a(f2);
        f2.a(obj);
    }

    @Override // c.a.a.a.j
    public void shutdown() {
        b f2 = f();
        if (f2 != null) {
            f2.b();
        }
        q c2 = c();
        if (c2 != null) {
            c2.shutdown();
        }
    }
}
