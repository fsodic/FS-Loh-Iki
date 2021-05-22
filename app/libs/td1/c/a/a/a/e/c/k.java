package c.a.a.a.e.c;

import c.a.a.a.l.g;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

/* access modifiers changed from: package-private */
@Deprecated
public class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final l f679a;

    k(l lVar) {
        this.f679a = lVar;
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(g gVar) {
        return this.f679a.createSocket();
    }

    @Override // c.a.a.a.e.c.j
    public Socket a(Socket socket, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, g gVar) {
        int i;
        InetAddress inetAddress;
        String hostName = inetSocketAddress.getHostName();
        int port = inetSocketAddress.getPort();
        if (inetSocketAddress2 != null) {
            inetAddress = inetSocketAddress2.getAddress();
            i = inetSocketAddress2.getPort();
        } else {
            inetAddress = null;
            i = 0;
        }
        return this.f679a.a(socket, hostName, port, inetAddress, i, gVar);
    }

    public boolean equals(Object obj) {
        l lVar;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            lVar = this.f679a;
            obj = ((k) obj).f679a;
        } else {
            lVar = this.f679a;
        }
        return lVar.equals(obj);
    }

    public int hashCode() {
        return this.f679a.hashCode();
    }

    @Override // c.a.a.a.e.c.j
    public boolean isSecure(Socket socket) {
        return this.f679a.isSecure(socket);
    }
}
