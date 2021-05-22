package c.a.a.a.e.c;

import java.net.InetSocketAddress;
import java.net.Socket;

/* access modifiers changed from: package-private */
@Deprecated
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final b f676a;

    g(b bVar) {
        this.f676a = bVar;
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(c.a.a.a.l.g gVar) {
        return this.f676a.a(gVar);
    }

    @Override // c.a.a.a.e.c.f
    public Socket a(Socket socket, String str, int i, c.a.a.a.l.g gVar) {
        return this.f676a.a(socket, str, i, true);
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, c.a.a.a.l.g gVar) {
        return this.f676a.a(socket, inetSocketAddress, inetSocketAddress2, gVar);
    }

    @Override // c.a.a.a.e.c.j
    public boolean isSecure(Socket socket) {
        return this.f676a.isSecure(socket);
    }
}
