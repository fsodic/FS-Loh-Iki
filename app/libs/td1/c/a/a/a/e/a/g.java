package c.a.a.a.e.a;

import c.a.a.a.e.b.b;
import c.a.a.a.o;
import c.a.a.a.p.a;
import java.net.InetAddress;

@Deprecated
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final o f658a = new o("127.0.0.255", 0, "no-host");

    /* renamed from: b  reason: collision with root package name */
    public static final b f659b = new b(f658a);

    public static o a(c.a.a.a.l.g gVar) {
        a.a(gVar, "Parameters");
        o oVar = (o) gVar.getParameter("http.route.default-proxy");
        if (oVar == null || !f658a.equals(oVar)) {
            return oVar;
        }
        return null;
    }

    public static b b(c.a.a.a.l.g gVar) {
        a.a(gVar, "Parameters");
        b bVar = (b) gVar.getParameter("http.route.forced-route");
        if (bVar == null || !f659b.equals(bVar)) {
            return bVar;
        }
        return null;
    }

    public static InetAddress c(c.a.a.a.l.g gVar) {
        a.a(gVar, "Parameters");
        return (InetAddress) gVar.getParameter("http.route.local-address");
    }
}
