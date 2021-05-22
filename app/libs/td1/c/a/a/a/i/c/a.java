package c.a.a.a.i.c;

import c.a.a.a.e.b;
import c.a.a.a.e.o;
import c.a.a.a.e.q;
import c.a.a.a.m;
import c.a.a.a.n.e;
import c.a.a.a.r;
import c.a.a.a.t;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
public abstract class a implements o, e {

    /* renamed from: a  reason: collision with root package name */
    private final b f790a;

    /* renamed from: b  reason: collision with root package name */
    private volatile q f791b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f792c = false;
    private volatile boolean d = false;
    private volatile long e = Long.MAX_VALUE;

    protected a(b bVar, q qVar) {
        this.f790a = bVar;
        this.f791b = qVar;
    }

    /* access modifiers changed from: protected */
    public synchronized void a() {
        this.f791b = null;
        this.e = Long.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public final void a(q qVar) {
        if (e() || qVar == null) {
            throw new f();
        }
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(m mVar) {
        q c2 = c();
        a(c2);
        unmarkReusable();
        c2.a(mVar);
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(r rVar) {
        q c2 = c();
        a(c2);
        unmarkReusable();
        c2.a(rVar);
    }

    @Override // c.a.a.a.AbstractC0125i
    public void a(t tVar) {
        q c2 = c();
        a(c2);
        unmarkReusable();
        c2.a(tVar);
    }

    @Override // c.a.a.a.e.i
    public synchronized void abortConnection() {
        if (!this.d) {
            this.d = true;
            unmarkReusable();
            try {
                shutdown();
            } catch (IOException unused) {
            }
            this.f790a.a(this, this.e, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: protected */
    public b b() {
        return this.f790a;
    }

    /* access modifiers changed from: protected */
    public q c() {
        return this.f791b;
    }

    public boolean d() {
        return this.f792c;
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return this.d;
    }

    @Override // c.a.a.a.AbstractC0125i
    public void flush() {
        q c2 = c();
        a(c2);
        c2.flush();
    }

    @Override // c.a.a.a.n.e
    public Object getAttribute(String str) {
        q c2 = c();
        a(c2);
        if (c2 instanceof e) {
            return ((e) c2).getAttribute(str);
        }
        return null;
    }

    @Override // c.a.a.a.p
    public InetAddress getRemoteAddress() {
        q c2 = c();
        a(c2);
        return c2.getRemoteAddress();
    }

    @Override // c.a.a.a.p
    public int getRemotePort() {
        q c2 = c();
        a(c2);
        return c2.getRemotePort();
    }

    @Override // c.a.a.a.e.p
    public SSLSession getSSLSession() {
        q c2 = c();
        a(c2);
        if (!isOpen()) {
            return null;
        }
        Socket socket = c2.getSocket();
        if (socket instanceof SSLSocket) {
            return ((SSLSocket) socket).getSession();
        }
        return null;
    }

    @Override // c.a.a.a.j
    public boolean isOpen() {
        q c2 = c();
        if (c2 == null) {
            return false;
        }
        return c2.isOpen();
    }

    @Override // c.a.a.a.AbstractC0125i
    public boolean isResponseAvailable(int i) {
        q c2 = c();
        a(c2);
        return c2.isResponseAvailable(i);
    }

    @Override // c.a.a.a.j
    public boolean isStale() {
        q c2;
        if (!e() && (c2 = c()) != null) {
            return c2.isStale();
        }
        return true;
    }

    @Override // c.a.a.a.e.o
    public void markReusable() {
        this.f792c = true;
    }

    @Override // c.a.a.a.AbstractC0125i
    public t receiveResponseHeader() {
        q c2 = c();
        a(c2);
        unmarkReusable();
        return c2.receiveResponseHeader();
    }

    @Override // c.a.a.a.e.i
    public synchronized void releaseConnection() {
        if (!this.d) {
            this.d = true;
            this.f790a.a(this, this.e, TimeUnit.MILLISECONDS);
        }
    }

    @Override // c.a.a.a.n.e
    public void setAttribute(String str, Object obj) {
        q c2 = c();
        a(c2);
        if (c2 instanceof e) {
            ((e) c2).setAttribute(str, obj);
        }
    }

    @Override // c.a.a.a.e.o
    public void setIdleDuration(long j, TimeUnit timeUnit) {
        this.e = j > 0 ? timeUnit.toMillis(j) : -1;
    }

    @Override // c.a.a.a.j
    public void setSocketTimeout(int i) {
        q c2 = c();
        a(c2);
        c2.setSocketTimeout(i);
    }

    @Override // c.a.a.a.e.o
    public void unmarkReusable() {
        this.f792c = false;
    }
}
