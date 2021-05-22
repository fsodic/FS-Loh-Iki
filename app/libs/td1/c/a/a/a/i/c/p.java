package c.a.a.a.i.c;

import c.a.a.a.e.b;
import c.a.a.a.e.b.f;
import c.a.a.a.e.d;
import c.a.a.a.e.o;
import c.a.a.a.e.q;
import c.a.a.a.l.g;
import c.a.a.a.m;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.t;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* access modifiers changed from: package-private */
@Deprecated
public class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final b f835a;

    /* renamed from: b  reason: collision with root package name */
    private final d f836b;

    /* renamed from: c  reason: collision with root package name */
    private volatile l f837c;
    private volatile boolean d = false;
    private volatile long e = Long.MAX_VALUE;

    p(b bVar, d dVar, l lVar) {
        a.a(bVar, "Connection manager");
        a.a(dVar, "Connection operator");
        a.a(lVar, "HTTP pool entry");
        this.f835a = bVar;
        this.f836b = dVar;
        this.f837c = lVar;
    }

    private q e() {
        l lVar = this.f837c;
        if (lVar != null) {
            return (q) lVar.a();
        }
        throw new f();
    }

    private l f() {
        l lVar = this.f837c;
        if (lVar != null) {
            return lVar;
        }
        throw new f();
    }

    private q g() {
        l lVar = this.f837c;
        if (lVar == null) {
            return null;
        }
        return (q) lVar.a();
    }

    /* access modifiers changed from: package-private */
    public l a() {
        l lVar = this.f837c;
        this.f837c = null;
        return lVar;
    }

    @Override // c.a.a.a.e.o
    public void a(c.a.a.a.e.b.b bVar, e eVar, g gVar) {
        q qVar;
        a.a(bVar, "Route");
        a.a(gVar, "HTTP parameters");
        synchronized (this) {
            if (this.f837c != null) {
                f g = this.f837c.g();
                c.a.a.a.p.b.a(g, "Route tracker");
                c.a.a.a.p.b.a(!g.c(), "Connection already open");
                qVar = (q) this.f837c.a();
            } else {
                throw new f();
            }
        }
        c.a.a.a.o proxyHost = bVar.getProxyHost();
        this.f836b.a(qVar, proxyHost != null ? proxyHost : bVar.getTargetHost(), bVar.getLocalAddress(), eVar, gVar);
        synchronized (this) {
            if (this.f837c != null) {
                f g2 = this.f837c.g();
                if (proxyHost == null) {
                    g2.a(qVar.isSecure());
                } else {
                    g2.a(proxyHost, qVar.isSecure());
                }
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(m mVar) {
        e().a(mVar);
    }

    @Override // c.a.a.a.e.o
    public void a(e eVar, g gVar) {
        c.a.a.a.o targetHost;
        q qVar;
        a.a(gVar, "HTTP parameters");
        synchronized (this) {
            if (this.f837c != null) {
                f g = this.f837c.g();
                c.a.a.a.p.b.a(g, "Route tracker");
                c.a.a.a.p.b.a(g.c(), "Connection not open");
                c.a.a.a.p.b.a(g.isTunnelled(), "Protocol layering without a tunnel not supported");
                c.a.a.a.p.b.a(!g.isLayered(), "Multiple protocol layering not supported");
                targetHost = g.getTargetHost();
                qVar = (q) this.f837c.a();
            } else {
                throw new f();
            }
        }
        this.f836b.a(qVar, targetHost, eVar, gVar);
        synchronized (this) {
            if (this.f837c != null) {
                this.f837c.g().b(qVar.isSecure());
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(r rVar) {
        e().a(rVar);
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(t tVar) {
        e().a(tVar);
    }

    @Override // c.a.a.a.e.o
    public void a(boolean z, g gVar) {
        c.a.a.a.o targetHost;
        q qVar;
        a.a(gVar, "HTTP parameters");
        synchronized (this) {
            if (this.f837c != null) {
                f g = this.f837c.g();
                c.a.a.a.p.b.a(g, "Route tracker");
                c.a.a.a.p.b.a(g.c(), "Connection not open");
                c.a.a.a.p.b.a(!g.isTunnelled(), "Connection is already tunnelled");
                targetHost = g.getTargetHost();
                qVar = (q) this.f837c.a();
            } else {
                throw new f();
            }
        }
        qVar.a(null, targetHost, z, gVar);
        synchronized (this) {
            if (this.f837c != null) {
                this.f837c.g().c(z);
            } else {
                throw new InterruptedIOException();
            }
        }
    }

    @Override // c.a.a.a.e.i
    public void abortConnection() {
        synchronized (this) {
            if (this.f837c != null) {
                this.d = false;
                try {
                    ((q) this.f837c.a()).shutdown();
                } catch (IOException unused) {
                }
                this.f835a.a(this, this.e, TimeUnit.MILLISECONDS);
                this.f837c = null;
            }
        }
    }

    public b b() {
        return this.f835a;
    }

    /* access modifiers changed from: package-private */
    public l c() {
        return this.f837c;
    }

    @Override // java.io.Closeable, c.a.a.a.j, java.lang.AutoCloseable
    public void close() {
        l lVar = this.f837c;
        if (lVar != null) {
            lVar.g().d();
            ((q) lVar.a()).close();
        }
    }

    public boolean d() {
        return this.d;
    }

    @Override // c.a.a.a.AbstractC0125i
    public void flush() {
        e().flush();
    }

    @Override // c.a.a.a.p
    public InetAddress getRemoteAddress() {
        return e().getRemoteAddress();
    }

    @Override // c.a.a.a.p
    public int getRemotePort() {
        return e().getRemotePort();
    }

    @Override // c.a.a.a.e.n, c.a.a.a.e.o
    public c.a.a.a.e.b.b getRoute() {
        return f().e();
    }

    @Override // c.a.a.a.e.p
    public SSLSession getSSLSession() {
        Socket socket = e().getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    @Override // c.a.a.a.j
    public boolean isOpen() {
        q g = g();
        if (g != null) {
            return g.isOpen();
        }
        return false;
    }

    @Override // c.a.a.a.AbstractC0125i
    public boolean isResponseAvailable(int i) {
        return e().isResponseAvailable(i);
    }

    @Override // c.a.a.a.j
    public boolean isStale() {
        q g = g();
        if (g != null) {
            return g.isStale();
        }
        return true;
    }

    @Override // c.a.a.a.e.o
    public void markReusable() {
        this.d = true;
    }

    @Override // c.a.a.a.AbstractC0125i
    public t receiveResponseHeader() {
        return e().receiveResponseHeader();
    }

    @Override // c.a.a.a.e.i
    public void releaseConnection() {
        synchronized (this) {
            if (this.f837c != null) {
                this.f835a.a(this, this.e, TimeUnit.MILLISECONDS);
                this.f837c = null;
            }
        }
    }

    @Override // c.a.a.a.e.o
    public void setIdleDuration(long j, TimeUnit timeUnit) {
        this.e = j > 0 ? timeUnit.toMillis(j) : -1;
    }

    @Override // c.a.a.a.j
    public void setSocketTimeout(int i) {
        e().setSocketTimeout(i);
    }

    @Override // c.a.a.a.e.o
    public void setState(Object obj) {
        f().a(obj);
    }

    @Override // c.a.a.a.j
    public void shutdown() {
        l lVar = this.f837c;
        if (lVar != null) {
            lVar.g().d();
            ((q) lVar.a()).shutdown();
        }
    }

    @Override // c.a.a.a.e.o
    public void unmarkReusable() {
        this.d = false;
    }
}
