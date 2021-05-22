package c.a.a.a.l;

import c.a.a.a.D;
import c.a.a.a.n.d;
import c.a.a.a.p.a;
import c.a.a.a.w;

@Deprecated
public final class i implements d {
    public static String a(g gVar) {
        a.a(gVar, "HTTP parameters");
        String str = (String) gVar.getParameter("http.protocol.element-charset");
        return str == null ? d.f964b.name() : str;
    }

    public static void a(g gVar, D d) {
        a.a(gVar, "HTTP parameters");
        gVar.setParameter("http.protocol.version", d);
    }

    public static void a(g gVar, String str) {
        a.a(gVar, "HTTP parameters");
        gVar.setParameter("http.protocol.content-charset", str);
    }

    public static D b(g gVar) {
        a.a(gVar, "HTTP parameters");
        Object parameter = gVar.getParameter("http.protocol.version");
        return parameter == null ? w.f : (D) parameter;
    }

    public static void b(g gVar, String str) {
        a.a(gVar, "HTTP parameters");
        gVar.setParameter("http.useragent", str);
    }
}
