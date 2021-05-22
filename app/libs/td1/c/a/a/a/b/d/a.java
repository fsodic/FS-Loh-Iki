package c.a.a.a.b.d;

import c.a.a.a.b.a.a;
import c.a.a.a.l.g;
import c.a.a.a.o;
import java.net.InetAddress;
import java.util.Collection;

@Deprecated
public final class a {
    public static c.a.a.a.b.a.a a(g gVar) {
        a.C0021a c2 = c.a.a.a.b.a.a.c();
        c2.d(gVar.getIntParameter("http.socket.timeout", 0));
        c2.f(gVar.getBooleanParameter("http.connection.stalecheck", true));
        c2.a(gVar.getIntParameter("http.connection.timeout", 0));
        c2.c(gVar.getBooleanParameter("http.protocol.expect-continue", false));
        c2.a((o) gVar.getParameter("http.route.default-proxy"));
        c2.a((InetAddress) gVar.getParameter("http.route.local-address"));
        c2.a((Collection) gVar.getParameter("http.auth.proxy-scheme-pref"));
        c2.b((Collection) gVar.getParameter("http.auth.target-scheme-pref"));
        c2.a(gVar.getBooleanParameter("http.protocol.handle-authentication", true));
        c2.b(gVar.getBooleanParameter("http.protocol.allow-circular-redirects", false));
        c2.b((int) gVar.getLongParameter("http.conn-manager.timeout", 0));
        c2.a((String) gVar.getParameter("http.protocol.cookie-policy"));
        c2.c(gVar.getIntParameter("http.protocol.max-redirects", 50));
        c2.d(gVar.getBooleanParameter("http.protocol.handle-redirects", true));
        c2.e(!gVar.getBooleanParameter("http.protocol.reject-relative-redirect", false));
        return c2.a();
    }
}
