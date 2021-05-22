package c.a.a.a.i.c;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.e.p;
import c.a.a.a.e.q;
import c.a.a.a.h.b;
import c.a.a.a.i.f;
import c.a.a.a.j.c;
import c.a.a.a.l.i;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.t;
import c.a.a.a.u;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

@Deprecated
public class g extends f implements q, p, e {
    public b k = new b(g.class);
    public b l = new b("cz.msebera.android.httpclient.headers");
    public b m = new b("cz.msebera.android.httpclient.wire");
    private volatile Socket n;
    private o o;
    private boolean p;
    private volatile boolean q;
    private final Map<String, Object> r = new HashMap();

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.a
    public c<t> a(c.a.a.a.j.f fVar, u uVar, c.a.a.a.l.g gVar) {
        return new i(fVar, null, uVar, gVar);
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.f
    public c.a.a.a.j.f a(Socket socket, int i, c.a.a.a.l.g gVar) {
        if (i <= 0) {
            i = 8192;
        }
        c.a.a.a.j.f a2 = super.a(socket, i, gVar);
        return this.m.a() ? new n(a2, new s(this.m), i.a(gVar)) : a2;
    }

    @Override // c.a.a.a.AbstractC0125i, c.a.a.a.i.a
    public void a(r rVar) {
        if (this.k.a()) {
            this.k.a("Sending request: " + rVar.getRequestLine());
        }
        super.a(rVar);
        if (this.l.a()) {
            this.l.a(">> " + rVar.getRequestLine().toString());
            AbstractC0121e[] allHeaders = rVar.getAllHeaders();
            for (AbstractC0121e eVar : allHeaders) {
                this.l.a(">> " + eVar.toString());
            }
        }
    }

    @Override // c.a.a.a.e.q
    public void a(Socket socket, o oVar) {
        g();
        this.n = socket;
        this.o = oVar;
        if (this.q) {
            socket.close();
            throw new InterruptedIOException("Connection already shutdown");
        }
    }

    @Override // c.a.a.a.e.q
    public void a(Socket socket, o oVar, boolean z, c.a.a.a.l.g gVar) {
        a();
        a.a(oVar, "Target host");
        a.a(gVar, "Parameters");
        if (socket != null) {
            this.n = socket;
            a(socket, gVar);
        }
        this.o = oVar;
        this.p = z;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.f
    public c.a.a.a.j.g b(Socket socket, int i, c.a.a.a.l.g gVar) {
        if (i <= 0) {
            i = 8192;
        }
        c.a.a.a.j.g b2 = super.b(socket, i, gVar);
        return this.m.a() ? new o(b2, new s(this.m), i.a(gVar)) : b2;
    }

    @Override // c.a.a.a.e.q
    public void b(boolean z, c.a.a.a.l.g gVar) {
        a.a(gVar, "Parameters");
        g();
        this.p = z;
        a(this.n, gVar);
    }

    @Override // java.io.Closeable, c.a.a.a.j, java.lang.AutoCloseable, c.a.a.a.i.f
    public void close() {
        try {
            super.close();
            if (this.k.a()) {
                b bVar = this.k;
                bVar.a("Connection " + this + " closed");
            }
        } catch (IOException e) {
            this.k.a("I/O error closing connection", e);
        }
    }

    @Override // c.a.a.a.n.e
    public Object getAttribute(String str) {
        return this.r.get(str);
    }

    @Override // c.a.a.a.e.p
    public SSLSession getSSLSession() {
        if (this.n instanceof SSLSocket) {
            return ((SSLSocket) this.n).getSession();
        }
        return null;
    }

    @Override // c.a.a.a.e.q
    public final Socket getSocket() {
        return this.n;
    }

    @Override // c.a.a.a.e.q
    public final boolean isSecure() {
        return this.p;
    }

    @Override // c.a.a.a.AbstractC0125i, c.a.a.a.i.a
    public t receiveResponseHeader() {
        t receiveResponseHeader = super.receiveResponseHeader();
        if (this.k.a()) {
            this.k.a("Receiving response: " + receiveResponseHeader.getStatusLine());
        }
        if (this.l.a()) {
            this.l.a("<< " + receiveResponseHeader.getStatusLine().toString());
            AbstractC0121e[] allHeaders = receiveResponseHeader.getAllHeaders();
            for (AbstractC0121e eVar : allHeaders) {
                this.l.a("<< " + eVar.toString());
            }
        }
        return receiveResponseHeader;
    }

    @Override // c.a.a.a.n.e
    public void setAttribute(String str, Object obj) {
        this.r.put(str, obj);
    }

    @Override // c.a.a.a.j, c.a.a.a.i.f
    public void shutdown() {
        this.q = true;
        try {
            super.shutdown();
            if (this.k.a()) {
                b bVar = this.k;
                bVar.a("Connection " + this + " shut down");
            }
            Socket socket = this.n;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            this.k.a("I/O error shutting down connection", e);
        }
    }
}
