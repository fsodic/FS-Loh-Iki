package c.a.a.a.i;

import c.a.a.a.i.f.n;
import c.a.a.a.i.f.o;
import c.a.a.a.l.g;
import c.a.a.a.p;
import c.a.a.a.p.a;
import c.a.a.a.p.b;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;

@Deprecated
public class f extends a implements p {
    private volatile boolean i;
    private volatile Socket j = null;

    private static void a(StringBuilder sb, SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            sb.append(inetSocketAddress.getAddress() != null ? inetSocketAddress.getAddress().getHostAddress() : inetSocketAddress.getAddress());
            sb.append(':');
            sb.append(inetSocketAddress.getPort());
            return;
        }
        sb.append(socketAddress);
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.j.f a(Socket socket, int i2, g gVar) {
        return new n(socket, i2, gVar);
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.a
    public void a() {
        b.a(this.i, "Connection is not open");
    }

    /* access modifiers changed from: protected */
    public void a(Socket socket, g gVar) {
        a.a(socket, "Socket");
        a.a(gVar, "HTTP parameters");
        this.j = socket;
        int intParameter = gVar.getIntParameter("http.socket.buffer-size", -1);
        a(a(socket, intParameter, gVar), b(socket, intParameter, gVar), gVar);
        this.i = true;
    }

    /* access modifiers changed from: protected */
    public c.a.a.a.j.g b(Socket socket, int i2, g gVar) {
        return new o(socket, i2, gVar);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: UnsupportedOperationException (unused java.lang.UnsupportedOperationException), SYNTHETIC, Splitter:B:8:0x0010] */
    @Override // java.io.Closeable, c.a.a.a.j, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r2 = this;
            boolean r0 = r2.i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r2.i = r0
            java.net.Socket r0 = r2.j
            r2.e()     // Catch:{ all -> 0x0017 }
            r0.shutdownOutput()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            r0.shutdownInput()     // Catch:{ UnsupportedOperationException -> 0x0013, UnsupportedOperationException -> 0x0013 }
        L_0x0013:
            r0.close()
            return
        L_0x0017:
            r1 = move-exception
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.f.close():void");
    }

    /* access modifiers changed from: protected */
    public void g() {
        b.a(!this.i, "Connection is already open");
    }

    @Override // c.a.a.a.p
    public InetAddress getRemoteAddress() {
        if (this.j != null) {
            return this.j.getInetAddress();
        }
        return null;
    }

    @Override // c.a.a.a.p
    public int getRemotePort() {
        if (this.j != null) {
            return this.j.getPort();
        }
        return -1;
    }

    @Override // c.a.a.a.j
    public boolean isOpen() {
        return this.i;
    }

    @Override // c.a.a.a.j
    public void setSocketTimeout(int i2) {
        a();
        if (this.j != null) {
            try {
                this.j.setSoTimeout(i2);
            } catch (SocketException unused) {
            }
        }
    }

    @Override // c.a.a.a.j
    public void shutdown() {
        this.i = false;
        Socket socket = this.j;
        if (socket != null) {
            socket.close();
        }
    }

    public String toString() {
        if (this.j == null) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        SocketAddress remoteSocketAddress = this.j.getRemoteSocketAddress();
        SocketAddress localSocketAddress = this.j.getLocalSocketAddress();
        if (!(remoteSocketAddress == null || localSocketAddress == null)) {
            a(sb, localSocketAddress);
            sb.append("<->");
            a(sb, remoteSocketAddress);
        }
        return sb.toString();
    }
}
