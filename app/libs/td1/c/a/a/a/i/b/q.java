package c.a.a.a.i.b;

import c.a.a.a.a.c;
import c.a.a.a.a.i;
import c.a.a.a.a.n;
import c.a.a.a.b.e.a;
import c.a.a.a.b.r;
import c.a.a.a.e.p;
import c.a.a.a.j;
import c.a.a.a.n.e;
import java.security.Principal;
import javax.net.ssl.SSLSession;

public class q implements r {

    /* renamed from: a  reason: collision with root package name */
    public static final q f780a = new q();

    private static Principal a(i iVar) {
        n c2;
        c b2 = iVar.b();
        if (b2 == null || !b2.isComplete() || !b2.isConnectionBased() || (c2 = iVar.c()) == null) {
            return null;
        }
        return c2.getUserPrincipal();
    }

    @Override // c.a.a.a.b.r
    public Object a(e eVar) {
        Principal principal;
        SSLSession sSLSession;
        a a2 = a.a(eVar);
        i o = a2.o();
        if (o != null) {
            principal = a(o);
            if (principal == null) {
                principal = a(a2.m());
            }
        } else {
            principal = null;
        }
        if (principal != null) {
            return principal;
        }
        j a3 = a2.a();
        return (!a3.isOpen() || !(a3 instanceof p) || (sSLSession = ((p) a3).getSSLSession()) == null) ? principal : sSLSession.getLocalPrincipal();
    }
}
