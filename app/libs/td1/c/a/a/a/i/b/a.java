package c.a.a.a.i.b;

import c.a.a.a.AbstractC0118b;
import c.a.a.a.b.c;
import c.a.a.a.b.f;
import c.a.a.a.b.i;
import c.a.a.a.b.p;
import c.a.a.a.b.q;
import c.a.a.a.b.r;
import c.a.a.a.e.b.d;
import c.a.a.a.f.m;
import c.a.a.a.h.b;
import c.a.a.a.i.a.e;
import c.a.a.a.i.a.l;
import c.a.a.a.i.c.j;
import c.a.a.a.i.d.A;
import c.a.a.a.i.d.H;
import c.a.a.a.i.d.t;
import c.a.a.a.i.d.x;
import c.a.a.a.l.g;
import c.a.a.a.n;
import c.a.a.a.n.h;
import c.a.a.a.n.k;
import c.a.a.a.o;
import c.a.a.a.s;
import c.a.a.a.v;
import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;

@Deprecated
public abstract class a extends h {

    /* renamed from: b  reason: collision with root package name */
    public b f750b = new b(getClass());

    /* renamed from: c  reason: collision with root package name */
    private g f751c;
    private h d;
    private c.a.a.a.e.b e;
    private AbstractC0118b f;
    private c.a.a.a.e.g g;
    private m h;
    private c.a.a.a.a.g i;
    private c.a.a.a.n.b j;
    private k k;
    private c.a.a.a.b.k l;
    private p m;
    private c n;
    private c o;
    private c.a.a.a.b.h p;
    private i q;
    private d r;
    private r s;
    private c.a.a.a.b.g t;
    private c.a.a.a.b.d u;

    protected a(c.a.a.a.e.b bVar, g gVar) {
        this.f751c = gVar;
        this.e = bVar;
    }

    private synchronized c.a.a.a.n.g I() {
        if (this.k == null) {
            c.a.a.a.n.b z = z();
            int c2 = z.c();
            s[] sVarArr = new s[c2];
            for (int i2 = 0; i2 < c2; i2++) {
                sVarArr[i2] = z.a(i2);
            }
            int d2 = z.d();
            v[] vVarArr = new v[d2];
            for (int i3 = 0; i3 < d2; i3++) {
                vVarArr[i3] = z.b(i3);
            }
            this.k = new k(sVarArr, vVarArr);
        }
        return this.k;
    }

    public final synchronized c.a.a.a.b.k A() {
        if (this.l == null) {
            this.l = k();
        }
        return this.l;
    }

    public final synchronized g B() {
        if (this.f751c == null) {
            this.f751c = i();
        }
        return this.f751c;
    }

    public final synchronized c C() {
        if (this.o == null) {
            this.o = m();
        }
        return this.o;
    }

    public final synchronized p D() {
        if (this.m == null) {
            this.m = new n();
        }
        return this.m;
    }

    public final synchronized h E() {
        if (this.d == null) {
            this.d = n();
        }
        return this.d;
    }

    public final synchronized d F() {
        if (this.r == null) {
            this.r = l();
        }
        return this.r;
    }

    public final synchronized c G() {
        if (this.n == null) {
            this.n = o();
        }
        return this.n;
    }

    public final synchronized r H() {
        if (this.s == null) {
            this.s = p();
        }
        return this.s;
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.a.g a() {
        c.a.a.a.a.g gVar = new c.a.a.a.a.g();
        gVar.a("Basic", new c.a.a.a.i.a.c());
        gVar.a("Digest", new e());
        gVar.a("NTLM", new l());
        return gVar;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.b.h
    public final c.a.a.a.b.c.e a(o oVar, c.a.a.a.r rVar, c.a.a.a.n.e eVar) {
        c.a.a.a.n.c cVar;
        q a2;
        d F;
        c.a.a.a.b.g s2;
        c.a.a.a.b.d r2;
        o oVar2;
        c.a.a.a.p.a.a(rVar, "HTTP request");
        synchronized (this) {
            c.a.a.a.n.e h2 = h();
            cVar = eVar == null ? h2 : new c.a.a.a.n.c(eVar, h2);
            g b2 = b(rVar);
            cVar.setAttribute("http.request-config", c.a.a.a.b.d.a.a(b2));
            a2 = a(E(), u(), v(), t(), F(), I(), A(), D(), G(), C(), H(), b2);
            F = F();
            s2 = s();
            r2 = r();
        }
        if (s2 == null || r2 == null) {
            return i.a(a2.a(oVar, rVar, cVar));
        }
        if (oVar != null) {
            oVar2 = oVar;
        } else {
            try {
                oVar2 = (o) b(rVar).getParameter("http.default-host");
            } catch (n e2) {
                throw new f(e2);
            }
        }
        c.a.a.a.e.b.b a3 = F.a(oVar2, rVar, cVar);
        try {
            c.a.a.a.b.c.e a4 = i.a(a2.a(oVar, rVar, cVar));
            if (s2.a(a4)) {
                r2.a(a3);
            } else {
                r2.b(a3);
            }
            return a4;
        } catch (RuntimeException e3) {
            if (s2.a(e3)) {
                r2.a(a3);
            }
            throw e3;
        } catch (Exception e4) {
            if (s2.a(e4)) {
                r2.a(a3);
            }
            if (e4 instanceof n) {
                throw ((n) e4);
            } else if (e4 instanceof IOException) {
                throw ((IOException) e4);
            } else {
                throw new UndeclaredThrowableException(e4);
            }
        }
    }

    /* access modifiers changed from: protected */
    public q a(h hVar, c.a.a.a.e.b bVar, AbstractC0118b bVar2, c.a.a.a.e.g gVar, d dVar, c.a.a.a.n.g gVar2, c.a.a.a.b.k kVar, p pVar, c cVar, c cVar2, r rVar, g gVar3) {
        return new p(this.f750b, hVar, bVar, bVar2, gVar, dVar, gVar2, kVar, pVar, cVar, cVar2, rVar, gVar3);
    }

    public synchronized void a(c.a.a.a.b.k kVar) {
        this.l = kVar;
    }

    @Deprecated
    public synchronized void a(c.a.a.a.b.o oVar) {
        this.m = new o(oVar);
    }

    public synchronized void a(s sVar) {
        z().a(sVar);
        this.k = null;
    }

    public synchronized void a(s sVar, int i2) {
        z().a(sVar, i2);
        this.k = null;
    }

    public synchronized void a(v vVar) {
        z().a(vVar);
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.e.b b() {
        c.a.a.a.e.c cVar;
        c.a.a.a.e.c.i a2 = c.a.a.a.i.c.q.a();
        g B = B();
        String str = (String) B.getParameter("http.connection-manager.factory-class-name");
        if (str != null) {
            try {
                cVar = (c.a.a.a.e.c) Class.forName(str).newInstance();
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Invalid class name: " + str);
            } catch (IllegalAccessException e2) {
                throw new IllegalAccessError(e2.getMessage());
            } catch (InstantiationException e3) {
                throw new InstantiationError(e3.getMessage());
            }
        } else {
            cVar = null;
        }
        return cVar != null ? cVar.a(B, a2) : new c.a.a.a.i.c.e(a2);
    }

    /* access modifiers changed from: protected */
    public g b(c.a.a.a.r rVar) {
        return new g(null, B(), rVar.getParams(), null);
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.e.g c() {
        return new j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        u().shutdown();
    }

    /* access modifiers changed from: protected */
    public AbstractC0118b d() {
        return new c.a.a.a.i.b();
    }

    /* access modifiers changed from: protected */
    public m e() {
        m mVar = new m();
        mVar.a("default", new c.a.a.a.i.d.l());
        mVar.a("best-match", new c.a.a.a.i.d.l());
        mVar.a("compatibility", new c.a.a.a.i.d.o());
        mVar.a("netscape", new x());
        mVar.a("rfc2109", new A());
        mVar.a("rfc2965", new H());
        mVar.a("ignoreCookies", new t());
        return mVar;
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.b.h f() {
        return new e();
    }

    /* access modifiers changed from: protected */
    public i g() {
        return new f();
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.n.e h() {
        c.a.a.a.n.a aVar = new c.a.a.a.n.a();
        aVar.setAttribute("http.scheme-registry", u().getSchemeRegistry());
        aVar.setAttribute("http.authscheme-registry", q());
        aVar.setAttribute("http.cookiespec-registry", w());
        aVar.setAttribute("http.cookie-store", x());
        aVar.setAttribute("http.auth.credentials-provider", y());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public abstract g i();

    /* access modifiers changed from: protected */
    public abstract c.a.a.a.n.b j();

    /* access modifiers changed from: protected */
    public c.a.a.a.b.k k() {
        return new l();
    }

    /* access modifiers changed from: protected */
    public d l() {
        return new j(u().getSchemeRegistry());
    }

    /* access modifiers changed from: protected */
    public c m() {
        return new t();
    }

    /* access modifiers changed from: protected */
    public h n() {
        return new h();
    }

    /* access modifiers changed from: protected */
    public c o() {
        return new x();
    }

    /* access modifiers changed from: protected */
    public r p() {
        return new q();
    }

    public final synchronized c.a.a.a.a.g q() {
        if (this.i == null) {
            this.i = a();
        }
        return this.i;
    }

    public final synchronized c.a.a.a.b.d r() {
        return this.u;
    }

    public final synchronized c.a.a.a.b.g s() {
        return this.t;
    }

    public final synchronized c.a.a.a.e.g t() {
        if (this.g == null) {
            this.g = c();
        }
        return this.g;
    }

    public final synchronized c.a.a.a.e.b u() {
        if (this.e == null) {
            this.e = b();
        }
        return this.e;
    }

    public final synchronized AbstractC0118b v() {
        if (this.f == null) {
            this.f = d();
        }
        return this.f;
    }

    public final synchronized m w() {
        if (this.h == null) {
            this.h = e();
        }
        return this.h;
    }

    public final synchronized c.a.a.a.b.h x() {
        if (this.p == null) {
            this.p = f();
        }
        return this.p;
    }

    public final synchronized i y() {
        if (this.q == null) {
            this.q = g();
        }
        return this.q;
    }

    /* access modifiers changed from: protected */
    public final synchronized c.a.a.a.n.b z() {
        if (this.j == null) {
            this.j = j();
        }
        return this.j;
    }
}
