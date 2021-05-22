package c.a.a.a.e.e;

import c.a.a.a.e.c.a;
import c.a.a.a.e.c.c;
import c.a.a.a.e.c.f;
import c.a.a.a.e.d.b;
import c.a.a.a.e.m;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import c.a.a.a.o;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

@Deprecated
public class i implements b, f, c.a.a.a.e.c.b, c {

    /* renamed from: a  reason: collision with root package name */
    public static final l f692a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final l f693b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final l f694c = new j();
    private final SSLSocketFactory d;
    private final a e;
    private volatile l f;
    private final String[] g;
    private final String[] h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(java.security.KeyStore r2) {
        /*
            r1 = this;
            c.a.a.a.e.e.f r0 = c.a.a.a.e.e.g.b()
            r0.a(r2)
            javax.net.ssl.SSLContext r2 = r0.a()
            c.a.a.a.e.e.l r0 = c.a.a.a.e.e.i.f693b
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.e.e.i.<init>(java.security.KeyStore):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i(SSLContext sSLContext, l lVar) {
        this(sSLContext.getSocketFactory(), null, null, lVar);
        c.a.a.a.p.a.a(sSLContext, "SSL context");
    }

    public i(SSLSocketFactory sSLSocketFactory, String[] strArr, String[] strArr2, l lVar) {
        c.a.a.a.p.a.a(sSLSocketFactory, "SSL socket factory");
        this.d = sSLSocketFactory;
        this.g = strArr;
        this.h = strArr2;
        this.f = lVar == null ? f693b : lVar;
        this.e = null;
    }

    public static i a() {
        return new i(g.a(), f693b);
    }

    private void a(SSLSocket sSLSocket, String str) {
        try {
            this.f.verify(str, sSLSocket);
        } catch (IOException e2) {
            try {
                sSLSocket.close();
            } catch (Exception unused) {
            }
            throw e2;
        }
    }

    private void b(SSLSocket sSLSocket) {
        String[] strArr = this.g;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = this.h;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
        a(sSLSocket);
    }

    public Socket a(int i, Socket socket, o oVar, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, e eVar) {
        c.a.a.a.p.a.a(oVar, "HTTP host");
        c.a.a.a.p.a.a(inetSocketAddress, "Remote address");
        if (socket == null) {
            socket = a(eVar);
        }
        if (inetSocketAddress2 != null) {
            socket.bind(inetSocketAddress2);
        }
        try {
            socket.connect(inetSocketAddress, i);
            if (!(socket instanceof SSLSocket)) {
                return a(socket, oVar.d(), inetSocketAddress.getPort(), eVar);
            }
            SSLSocket sSLSocket = (SSLSocket) socket;
            sSLSocket.startHandshake();
            a(sSLSocket, oVar.d());
            return socket;
        } catch (IOException e2) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
            throw e2;
        }
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(g gVar) {
        return a((e) null);
    }

    public Socket a(e eVar) {
        SSLSocket sSLSocket = (SSLSocket) this.d.createSocket();
        b(sSLSocket);
        return sSLSocket;
    }

    @Override // c.a.a.a.e.c.f
    public Socket a(Socket socket, String str, int i, g gVar) {
        return a(socket, str, i, (e) null);
    }

    public Socket a(Socket socket, String str, int i, e eVar) {
        SSLSocket sSLSocket = (SSLSocket) this.d.createSocket(socket, str, i, true);
        b(sSLSocket);
        sSLSocket.startHandshake();
        a(sSLSocket, str);
        return sSLSocket;
    }

    @Override // c.a.a.a.e.c.l
    public Socket a(Socket socket, String str, int i, InetAddress inetAddress, int i2, g gVar) {
        a aVar = this.e;
        InetAddress resolve = aVar != null ? aVar.resolve(str) : InetAddress.getByName(str);
        InetSocketAddress inetSocketAddress = null;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        }
        return a(socket, new m(new o(str, i), resolve, i), inetSocketAddress, gVar);
    }

    @Override // c.a.a.a.e.c.b
    public Socket a(Socket socket, String str, int i, boolean z) {
        return a(socket, str, i, (e) null);
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g gVar) {
        c.a.a.a.p.a.a(inetSocketAddress, "Remote address");
        c.a.a.a.p.a.a(gVar, "HTTP parameters");
        o a2 = inetSocketAddress instanceof m ? ((m) inetSocketAddress).a() : new o(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), "https");
        int d2 = c.a.a.a.l.e.d(gVar);
        int a3 = c.a.a.a.l.e.a(gVar);
        socket.setSoTimeout(d2);
        return a(a3, socket, a2, inetSocketAddress, inetSocketAddress2, (e) null);
    }

    public void a(l lVar) {
        c.a.a.a.p.a.a(lVar, "Hostname verifier");
        this.f = lVar;
    }

    /* access modifiers changed from: protected */
    public void a(SSLSocket sSLSocket) {
    }

    @Override // c.a.a.a.e.c.l
    public Socket createSocket() {
        return a((e) null);
    }

    @Override // c.a.a.a.e.c.c
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a(socket, str, i, z);
    }

    @Override // c.a.a.a.e.c.l, c.a.a.a.e.c.j
    public boolean isSecure(Socket socket) {
        c.a.a.a.p.a.a(socket, "Socket");
        c.a.a.a.p.b.a(socket instanceof SSLSocket, "Socket not created by this factory");
        c.a.a.a.p.b.a(!socket.isClosed(), "Socket is closed");
        return true;
    }
}
