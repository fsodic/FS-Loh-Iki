package c.a.a.a.e.c;

import c.a.a.a.e.f;
import c.a.a.a.l.e;
import c.a.a.a.l.g;
import c.a.a.a.p.a;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

@Deprecated
public class d implements l, j {

    /* renamed from: a  reason: collision with root package name */
    private final a f672a = null;

    public static d a() {
        return new d();
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(g gVar) {
        return new Socket();
    }

    @Override // c.a.a.a.e.c.l
    @Deprecated
    public Socket a(Socket socket, String str, int i, InetAddress inetAddress, int i2, g gVar) {
        InetSocketAddress inetSocketAddress;
        if (inetAddress != null || i2 > 0) {
            if (i2 <= 0) {
                i2 = 0;
            }
            inetSocketAddress = new InetSocketAddress(inetAddress, i2);
        } else {
            inetSocketAddress = null;
        }
        a aVar = this.f672a;
        return a(socket, new InetSocketAddress(aVar != null ? aVar.resolve(str) : InetAddress.getByName(str), i), inetSocketAddress, gVar);
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g gVar) {
        a.a(inetSocketAddress, "Remote address");
        a.a(gVar, "HTTP parameters");
        if (socket == null) {
            socket = createSocket();
        }
        if (inetSocketAddress2 != null) {
            socket.setReuseAddress(e.c(gVar));
            socket.bind(inetSocketAddress2);
        }
        int a2 = e.a(gVar);
        try {
            socket.setSoTimeout(e.d(gVar));
            socket.connect(inetSocketAddress, a2);
            return socket;
        } catch (SocketTimeoutException unused) {
            throw new f("Connect to " + inetSocketAddress + " timed out");
        }
    }

    @Override // c.a.a.a.e.c.l
    public Socket createSocket() {
        return new Socket();
    }

    @Override // c.a.a.a.e.c.l, c.a.a.a.e.c.j
    public final boolean isSecure(Socket socket) {
        return false;
    }
}
