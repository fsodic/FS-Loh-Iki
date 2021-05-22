package c.a.a.a.e.c;

import c.a.a.a.l.g;
import java.net.Socket;

/* access modifiers changed from: package-private */
@Deprecated
public class h extends k implements f {

    /* renamed from: b  reason: collision with root package name */
    private final c f677b;

    h(c cVar) {
        super(cVar);
        this.f677b = cVar;
    }

    @Override // c.a.a.a.e.c.f
    public Socket a(Socket socket, String str, int i, g gVar) {
        return this.f677b.createSocket(socket, str, i, true);
    }
}
