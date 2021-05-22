package c.a.a.a.i.f;

import c.a.a.a.j.b;
import c.a.a.a.l.g;
import c.a.a.a.p.a;
import java.net.Socket;

@Deprecated
public class n extends c implements b {
    private final Socket o;
    private boolean p = false;

    public n(Socket socket, int i, g gVar) {
        a.a(socket, "Socket");
        this.o = socket;
        i = i < 0 ? socket.getReceiveBufferSize() : i;
        a(socket.getInputStream(), i < 1024 ? 1024 : i, gVar);
    }

    @Override // c.a.a.a.j.b
    public boolean a() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.f.c
    public int c() {
        int c2 = super.c();
        this.p = c2 == -1;
        return c2;
    }

    /* JADX INFO: finally extract failed */
    @Override // c.a.a.a.j.f
    public boolean isDataAvailable(int i) {
        boolean d = d();
        if (d) {
            return d;
        }
        int soTimeout = this.o.getSoTimeout();
        try {
            this.o.setSoTimeout(i);
            c();
            boolean d2 = d();
            this.o.setSoTimeout(soTimeout);
            return d2;
        } catch (Throwable th) {
            this.o.setSoTimeout(soTimeout);
            throw th;
        }
    }
}
