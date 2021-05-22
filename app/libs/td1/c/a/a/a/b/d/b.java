package c.a.a.a.b.d;

import c.a.a.a.l.e;
import c.a.a.a.l.g;
import c.a.a.a.p.a;

@Deprecated
public class b {
    public static long a(g gVar) {
        a.a(gVar, "HTTP parameters");
        Long l = (Long) gVar.getParameter("http.conn-manager.timeout");
        return l != null ? l.longValue() : (long) e.a(gVar);
    }

    public static boolean b(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getBooleanParameter("http.protocol.handle-authentication", true);
    }

    public static boolean c(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getBooleanParameter("http.protocol.handle-redirects", true);
    }
}
