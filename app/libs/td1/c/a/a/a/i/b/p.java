package c.a.a.a.i.b;

import c.a.a.a.A;
import c.a.a.a.AbstractC0118b;
import c.a.a.a.C;
import c.a.a.a.a.i;
import c.a.a.a.a.s;
import c.a.a.a.b.c;
import c.a.a.a.b.c.l;
import c.a.a.a.b.k;
import c.a.a.a.b.n;
import c.a.a.a.b.o;
import c.a.a.a.b.q;
import c.a.a.a.b.r;
import c.a.a.a.e.b.d;
import c.a.a.a.e.g;
import c.a.a.a.h.b;
import c.a.a.a.i.c.f;
import c.a.a.a.m;
import c.a.a.a.n.e;
import c.a.a.a.n.h;
import c.a.a.a.p.a;
import c.a.a.a.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

@Deprecated
public class p implements q {

    /* renamed from: a  reason: collision with root package name */
    public b f777a;

    /* renamed from: b  reason: collision with root package name */
    protected final c.a.a.a.e.b f778b;

    /* renamed from: c  reason: collision with root package name */
    protected final d f779c;
    protected final AbstractC0118b d;
    protected final g e;
    protected final h f;
    protected final c.a.a.a.n.g g;
    protected final k h;
    @Deprecated
    protected final o i;
    protected final c.a.a.a.b.p j;
    @Deprecated
    protected final c.a.a.a.b.b k;
    protected final c l;
    @Deprecated
    protected final c.a.a.a.b.b m;
    protected final c n;
    protected final r o;
    protected final c.a.a.a.l.g p;
    protected c.a.a.a.e.o q;
    protected final i r;
    protected final i s;
    private final s t;
    private int u;
    private int v;
    private final int w;
    private c.a.a.a.o x;

    public p(b bVar, h hVar, c.a.a.a.e.b bVar2, AbstractC0118b bVar3, g gVar, d dVar, c.a.a.a.n.g gVar2, k kVar, c.a.a.a.b.p pVar, c cVar, c cVar2, r rVar, c.a.a.a.l.g gVar3) {
        a.a(bVar, "Log");
        a.a(hVar, "Request executor");
        a.a(bVar2, "Client connection manager");
        a.a(bVar3, "Connection reuse strategy");
        a.a(gVar, "Connection keep alive strategy");
        a.a(dVar, "Route planner");
        a.a(gVar2, "HTTP protocol processor");
        a.a(kVar, "HTTP request retry handler");
        a.a(pVar, "Redirect strategy");
        a.a(cVar, "Target authentication strategy");
        a.a(cVar2, "Proxy authentication strategy");
        a.a(rVar, "User token handler");
        a.a(gVar3, "HTTP parameters");
        this.f777a = bVar;
        this.t = new s(bVar);
        this.f = hVar;
        this.f778b = bVar2;
        this.d = bVar3;
        this.e = gVar;
        this.f779c = dVar;
        this.g = gVar2;
        this.h = kVar;
        this.j = pVar;
        this.l = cVar;
        this.n = cVar2;
        this.o = rVar;
        this.p = gVar3;
        if (pVar instanceof o) {
            this.i = ((o) pVar).a();
        } else {
            this.i = null;
        }
        if (cVar instanceof b) {
            this.k = ((b) cVar).a();
        } else {
            this.k = null;
        }
        if (cVar2 instanceof b) {
            this.m = ((b) cVar2).a();
        } else {
            this.m = null;
        }
        this.q = null;
        this.u = 0;
        this.v = 0;
        this.r = new i();
        this.s = new i();
        this.w = this.p.getIntParameter("http.protocol.max-redirects", 100);
    }

    private v a(c.a.a.a.r rVar) {
        return rVar instanceof m ? new r((m) rVar) : new v(rVar);
    }

    private void a(w wVar, e eVar) {
        c.a.a.a.e.b.b b2 = wVar.b();
        v a2 = wVar.a();
        int i2 = 0;
        while (true) {
            eVar.setAttribute("http.request", a2);
            i2++;
            try {
                if (!this.q.isOpen()) {
                    this.q.a(b2, eVar, this.p);
                } else {
                    this.q.setSocketTimeout(c.a.a.a.l.e.d(this.p));
                }
                c(b2, eVar);
                return;
            } catch (IOException e2) {
                try {
                    this.q.close();
                } catch (IOException unused) {
                }
                if (!this.h.a(e2, i2, eVar)) {
                    throw e2;
                } else if (this.f777a.c()) {
                    b bVar = this.f777a;
                    bVar.c("I/O exception (" + e2.getClass().getName() + ") caught when connecting to " + b2 + ": " + e2.getMessage());
                    if (this.f777a.a()) {
                        this.f777a.a(e2.getMessage(), e2);
                    }
                    b bVar2 = this.f777a;
                    bVar2.c("Retrying connect to " + b2);
                }
            }
        }
    }

    private t b(w wVar, e eVar) {
        v a2 = wVar.a();
        c.a.a.a.e.b.b b2 = wVar.b();
        IOException e2 = null;
        while (true) {
            this.u++;
            a2.f();
            if (!a2.g()) {
                this.f777a.a("Cannot retry non-repeatable request");
                if (e2 != null) {
                    throw new c.a.a.a.b.m("Cannot retry request with a non-repeatable request entity.  The cause lists the reason the original request failed.", e2);
                }
                throw new c.a.a.a.b.m("Cannot retry request with a non-repeatable request entity.");
            }
            try {
                if (!this.q.isOpen()) {
                    if (!b2.isTunnelled()) {
                        this.f777a.a("Reopening the direct connection.");
                        this.q.a(b2, eVar, this.p);
                    } else {
                        this.f777a.a("Proxied connection. Need to start over.");
                        return null;
                    }
                }
                if (this.f777a.a()) {
                    this.f777a.a("Attempt " + this.u + " to execute request");
                }
                return this.f.c(a2, this.q, eVar);
            } catch (IOException e3) {
                e2 = e3;
                this.f777a.a("Closing the connection.");
                try {
                    this.q.close();
                } catch (IOException unused) {
                }
                if (this.h.a(e2, a2.d(), eVar)) {
                    if (this.f777a.c()) {
                        this.f777a.c("I/O exception (" + e2.getClass().getName() + ") caught when processing request to " + b2 + ": " + e2.getMessage());
                    }
                    if (this.f777a.a()) {
                        this.f777a.a(e2.getMessage(), e2);
                    }
                    if (this.f777a.c()) {
                        this.f777a.c("Retrying request to " + b2);
                    }
                } else if (e2 instanceof A) {
                    A a3 = new A(b2.getTargetHost().g() + " failed to respond");
                    a3.setStackTrace(e2.getStackTrace());
                    throw a3;
                } else {
                    throw e2;
                }
            }
        }
    }

    private void b() {
        c.a.a.a.e.o oVar = this.q;
        if (oVar != null) {
            this.q = null;
            try {
                oVar.abortConnection();
            } catch (IOException e2) {
                if (this.f777a.a()) {
                    this.f777a.a(e2.getMessage(), e2);
                }
            }
            try {
                oVar.releaseConnection();
            } catch (IOException e3) {
                this.f777a.a("Error releasing connection", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public w a(w wVar, t tVar, e eVar) {
        c.a.a.a.o oVar;
        c.a.a.a.e.b.b b2 = wVar.b();
        v a2 = wVar.a();
        c.a.a.a.l.g params = a2.getParams();
        if (c.a.a.a.b.d.b.b(params)) {
            c.a.a.a.o oVar2 = (c.a.a.a.o) eVar.getAttribute("http.target_host");
            if (oVar2 == null) {
                oVar2 = b2.getTargetHost();
            }
            if (oVar2.e() < 0) {
                oVar = new c.a.a.a.o(oVar2.d(), this.f778b.getSchemeRegistry().a(oVar2).a(), oVar2.f());
            } else {
                oVar = oVar2;
            }
            boolean b3 = this.t.b(oVar, tVar, this.l, this.r, eVar);
            c.a.a.a.o proxyHost = b2.getProxyHost();
            if (proxyHost == null) {
                proxyHost = b2.getTargetHost();
            }
            boolean b4 = this.t.b(proxyHost, tVar, this.n, this.s, eVar);
            if (b3 && this.t.c(oVar, tVar, this.l, this.r, eVar)) {
                return wVar;
            }
            if (b4 && this.t.c(proxyHost, tVar, this.n, this.s, eVar)) {
                return wVar;
            }
        }
        if (!c.a.a.a.b.d.b.c(params) || !this.j.b(a2, tVar, eVar)) {
            return null;
        }
        int i2 = this.v;
        if (i2 < this.w) {
            this.v = i2 + 1;
            this.x = null;
            l a3 = this.j.a(a2, tVar, eVar);
            a3.a(a2.e().getAllHeaders());
            URI uri = a3.getURI();
            c.a.a.a.o a4 = c.a.a.a.b.f.e.a(uri);
            if (a4 != null) {
                if (!b2.getTargetHost().equals(a4)) {
                    this.f777a.a("Resetting target auth state");
                    this.r.e();
                    c.a.a.a.a.c b5 = this.s.b();
                    if (b5 != null && b5.isConnectionBased()) {
                        this.f777a.a("Resetting proxy auth state");
                        this.s.e();
                    }
                }
                v a5 = a(a3);
                a5.a(params);
                c.a.a.a.e.b.b b6 = b(a4, a5, eVar);
                w wVar2 = new w(a5, b6);
                if (this.f777a.a()) {
                    b bVar = this.f777a;
                    bVar.a("Redirecting to '" + uri + "' via " + b6);
                }
                return wVar2;
            }
            throw new C("Redirect URI does not specify a valid host name: " + uri);
        }
        throw new n("Maximum redirects (" + this.w + ") exceeded");
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.r a(c.a.a.a.e.b.b bVar, e eVar) {
        c.a.a.a.o targetHost = bVar.getTargetHost();
        String d2 = targetHost.d();
        int e2 = targetHost.e();
        if (e2 < 0) {
            e2 = this.f778b.getSchemeRegistry().b(targetHost.f()).a();
        }
        StringBuilder sb = new StringBuilder(d2.length() + 6);
        sb.append(d2);
        sb.append(':');
        sb.append(Integer.toString(e2));
        return new c.a.a.a.k.h("CONNECT", sb.toString(), c.a.a.a.l.i.b(this.p));
    }

    @Override // c.a.a.a.b.q
    public t a(c.a.a.a.o oVar, c.a.a.a.r rVar, e eVar) {
        String str;
        eVar.setAttribute("http.auth.target-scope", this.r);
        eVar.setAttribute("http.auth.proxy-scope", this.s);
        v a2 = a(rVar);
        a2.a(this.p);
        c.a.a.a.e.b.b b2 = b(oVar, a2, eVar);
        this.x = (c.a.a.a.o) a2.getParams().getParameter("http.virtual-host");
        c.a.a.a.o oVar2 = this.x;
        if (oVar2 != null && oVar2.e() == -1) {
            int e2 = (oVar != null ? oVar : b2.getTargetHost()).e();
            if (e2 != -1) {
                this.x = new c.a.a.a.o(this.x.d(), e2, this.x.f());
            }
        }
        w wVar = new w(a2, b2);
        t tVar = null;
        boolean z = false;
        Object obj = oVar;
        boolean z2 = false;
        while (!z) {
            try {
                v a3 = wVar.a();
                c.a.a.a.e.b.b b3 = wVar.b();
                Object attribute = eVar.getAttribute("http.user-token");
                if (this.q == null) {
                    c.a.a.a.e.e a4 = this.f778b.a(b3, attribute);
                    if (rVar instanceof c.a.a.a.b.c.a) {
                        ((c.a.a.a.b.c.a) rVar).a(a4);
                    }
                    try {
                        this.q = a4.getConnection(c.a.a.a.b.d.b.a(this.p), TimeUnit.MILLISECONDS);
                        if (c.a.a.a.l.e.f(this.p) && this.q.isOpen()) {
                            this.f777a.a("Stale connection check");
                            if (this.q.isStale()) {
                                this.f777a.a("Stale connection detected");
                                this.q.close();
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                if (rVar instanceof c.a.a.a.b.c.a) {
                    ((c.a.a.a.b.c.a) rVar).a(this.q);
                }
                try {
                    a(wVar, eVar);
                    String userInfo = a3.getURI().getUserInfo();
                    if (userInfo != null) {
                        this.r.a(new c.a.a.a.i.a.b(), new s(userInfo));
                    }
                    if (this.x != null) {
                        obj = this.x;
                    } else {
                        URI uri = a3.getURI();
                        if (uri.isAbsolute()) {
                            obj = c.a.a.a.b.f.e.a(uri);
                        }
                    }
                    if (obj == null) {
                        obj = b3.getTargetHost();
                    }
                    a3.h();
                    a(a3, b3);
                    eVar.setAttribute("http.target_host", obj);
                    eVar.setAttribute("http.route", b3);
                    eVar.setAttribute("http.connection", this.q);
                    this.f.a(a3, this.g, eVar);
                    tVar = b(wVar, eVar);
                    if (tVar != null) {
                        tVar.a(this.p);
                        this.f.a(tVar, this.g, eVar);
                        z2 = this.d.a(tVar, eVar);
                        if (z2) {
                            long a5 = this.e.a(tVar, eVar);
                            if (this.f777a.a()) {
                                if (a5 > 0) {
                                    str = "for " + a5 + " " + TimeUnit.MILLISECONDS;
                                } else {
                                    str = "indefinitely";
                                }
                                this.f777a.a("Connection can be kept alive " + str);
                            }
                            this.q.setIdleDuration(a5, TimeUnit.MILLISECONDS);
                        }
                        w a6 = a(wVar, tVar, eVar);
                        if (a6 == null) {
                            z = true;
                        } else {
                            if (z2) {
                                c.a.a.a.p.g.a(tVar.getEntity());
                                this.q.markReusable();
                            } else {
                                this.q.close();
                                if (this.s.d().compareTo((Enum) c.a.a.a.a.b.CHALLENGED) > 0 && this.s.b() != null && this.s.b().isConnectionBased()) {
                                    this.f777a.a("Resetting proxy auth state");
                                    this.s.e();
                                }
                                if (this.r.d().compareTo((Enum) c.a.a.a.a.b.CHALLENGED) > 0 && this.r.b() != null && this.r.b().isConnectionBased()) {
                                    this.f777a.a("Resetting target auth state");
                                    this.r.e();
                                }
                            }
                            if (!a6.b().equals(wVar.b())) {
                                a();
                            }
                            wVar = a6;
                        }
                        if (this.q != null) {
                            if (attribute == null) {
                                attribute = this.o.a(eVar);
                                eVar.setAttribute("http.user-token", attribute);
                            }
                            if (attribute != null) {
                                this.q.setState(attribute);
                            }
                        }
                    }
                } catch (y e3) {
                    if (this.f777a.a()) {
                        this.f777a.a(e3.getMessage());
                    }
                    tVar = e3.a();
                }
            } catch (f e4) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                interruptedIOException.initCause(e4);
                throw interruptedIOException;
            } catch (c.a.a.a.n e5) {
                b();
                throw e5;
            } catch (IOException e6) {
                b();
                throw e6;
            } catch (RuntimeException e7) {
                b();
                throw e7;
            }
        }
        if (tVar == null || tVar.getEntity() == null || !tVar.getEntity().isStreaming()) {
            if (z2) {
                this.q.markReusable();
            }
            a();
        } else {
            tVar.a(new c.a.a.a.e.a(tVar.getEntity(), this.q, z2));
        }
        return tVar;
    }

    /* access modifiers changed from: protected */
    public void a() {
        try {
            this.q.releaseConnection();
        } catch (IOException e2) {
            this.f777a.a("IOException releasing connection", e2);
        }
        this.q = null;
    }

    /* access modifiers changed from: protected */
    public void a(v vVar, c.a.a.a.e.b.b bVar) {
        URI uri;
        try {
            URI uri2 = vVar.getURI();
            if (bVar.getProxyHost() == null || bVar.isTunnelled()) {
                if (uri2.isAbsolute()) {
                    uri = c.a.a.a.b.f.e.a(uri2, null, true);
                    vVar.a(uri);
                }
            } else if (!uri2.isAbsolute()) {
                uri = c.a.a.a.b.f.e.a(uri2, bVar.getTargetHost(), true);
                vVar.a(uri);
            }
            uri = c.a.a.a.b.f.e.b(uri2);
            vVar.a(uri);
        } catch (URISyntaxException e2) {
            throw new C("Invalid URI: " + vVar.getRequestLine().getUri(), e2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(c.a.a.a.e.b.b bVar, int i2, e eVar) {
        throw new c.a.a.a.n("Proxy chains are not supported.");
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.e.b.b b(c.a.a.a.o oVar, c.a.a.a.r rVar, e eVar) {
        d dVar = this.f779c;
        if (oVar == null) {
            oVar = (c.a.a.a.o) rVar.getParams().getParameter("http.default-host");
        }
        return dVar.a(oVar, rVar, eVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(c.a.a.a.e.b.b bVar, e eVar) {
        t c2;
        c.a.a.a.o proxyHost = bVar.getProxyHost();
        c.a.a.a.o targetHost = bVar.getTargetHost();
        while (true) {
            if (!this.q.isOpen()) {
                this.q.a(bVar, eVar, this.p);
            }
            c.a.a.a.r a2 = a(bVar, eVar);
            a2.a(this.p);
            eVar.setAttribute("http.target_host", targetHost);
            eVar.setAttribute("http.route", bVar);
            eVar.setAttribute("http.proxy_host", proxyHost);
            eVar.setAttribute("http.connection", this.q);
            eVar.setAttribute("http.request", a2);
            this.f.a(a2, this.g, eVar);
            c2 = this.f.c(a2, this.q, eVar);
            c2.a(this.p);
            this.f.a(c2, this.g, eVar);
            if (c2.getStatusLine().getStatusCode() < 200) {
                throw new c.a.a.a.n("Unexpected response to CONNECT request: " + c2.getStatusLine());
            } else if (c.a.a.a.b.d.b.b(this.p)) {
                if (this.t.b(proxyHost, c2, this.n, this.s, eVar) && this.t.c(proxyHost, c2, this.n, this.s, eVar)) {
                    if (this.d.a(c2, eVar)) {
                        this.f777a.a("Connection kept alive");
                        c.a.a.a.p.g.a(c2.getEntity());
                    } else {
                        this.q.close();
                    }
                }
            }
        }
        if (c2.getStatusLine().getStatusCode() > 299) {
            c.a.a.a.l entity = c2.getEntity();
            if (entity != null) {
                c2.a(new c.a.a.a.g.c(entity));
            }
            this.q.close();
            throw new y("CONNECT refused by proxy: " + c2.getStatusLine(), c2);
        }
        this.q.markReusable();
        return false;
    }

    /* access modifiers changed from: protected */
    public void c(c.a.a.a.e.b.b bVar, e eVar) {
        int a2;
        c.a.a.a.e.b.a aVar = new c.a.a.a.e.b.a();
        do {
            c.a.a.a.e.b.b route = this.q.getRoute();
            a2 = aVar.a(bVar, route);
            switch (a2) {
                case -1:
                    throw new c.a.a.a.n("Unable to establish route: planned = " + bVar + "; current = " + route);
                case 0:
                    break;
                case 1:
                case 2:
                    this.q.a(bVar, eVar, this.p);
                    continue;
                case 3:
                    boolean b2 = b(bVar, eVar);
                    this.f777a.a("Tunnel to target created.");
                    this.q.a(b2, this.p);
                    continue;
                case 4:
                    a(bVar, route.getHopCount() - 1, eVar);
                    throw null;
                case 5:
                    this.q.a(eVar, this.p);
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + a2 + " from RouteDirector.");
            }
        } while (a2 > 0);
    }
}
