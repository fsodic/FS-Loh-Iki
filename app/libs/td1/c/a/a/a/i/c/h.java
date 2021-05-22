package c.a.a.a.i.c;

import c.a.a.a.e.c.f;
import c.a.a.a.e.c.i;
import c.a.a.a.e.d;
import c.a.a.a.e.j;
import c.a.a.a.e.q;
import c.a.a.a.h.b;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.p.a;
import java.net.InetAddress;
import java.net.Socket;

@Deprecated
public class h implements d {

    /* renamed from: a  reason: collision with root package name */
    public b f822a = new b(h.class);

    /* renamed from: b  reason: collision with root package name */
    protected final i f823b;

    /* renamed from: c  reason: collision with root package name */
    protected final j f824c;

    public h(i iVar) {
        a.a(iVar, "Scheme registry");
        this.f823b = iVar;
        this.f824c = new r();
    }

    private i a(e eVar) {
        i iVar = (i) eVar.getAttribute("http.scheme-registry");
        return iVar == null ? this.f823b : iVar;
    }

    @Override // c.a.a.a.e.d
    public void a(q qVar, o oVar, e eVar, g gVar) {
        a.a(qVar, "Connection");
        a.a(oVar, "Target host");
        a.a(gVar, "Parameters");
        c.a.a.a.p.b.a(qVar.isOpen(), "Connection must be open");
        c.a.a.a.e.c.e b2 = a(eVar).b(oVar.f());
        c.a.a.a.p.b.a(b2.c() instanceof f, "Socket factory must implement SchemeLayeredSocketFactory");
        f fVar = (f) b2.c();
        Socket a2 = fVar.a(qVar.getSocket(), oVar.d(), b2.a(oVar.e()), gVar);
        a(a2, eVar, gVar);
        qVar.a(a2, oVar, fVar.isSecure(a2), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf A[SYNTHETIC] */
    @Override // c.a.a.a.e.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(c.a.a.a.e.q r17, c.a.a.a.o r18, java.net.InetAddress r19, c.a.a.a.n.e r20, c.a.a.a.l.g r21) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.c.h.a(c.a.a.a.e.q, c.a.a.a.o, java.net.InetAddress, c.a.a.a.n.e, c.a.a.a.l.g):void");
    }

    /* access modifiers changed from: protected */
    public void a(Socket socket, e eVar, g gVar) {
        socket.setTcpNoDelay(c.a.a.a.l.e.e(gVar));
        socket.setSoTimeout(c.a.a.a.l.e.d(gVar));
        int b2 = c.a.a.a.l.e.b(gVar);
        if (b2 >= 0) {
            socket.setSoLinger(b2 > 0, b2);
        }
    }

    /* access modifiers changed from: protected */
    public InetAddress[] a(String str) {
        return this.f824c.resolve(str);
    }

    @Override // c.a.a.a.e.d
    public q createConnection() {
        return new g();
    }
}
