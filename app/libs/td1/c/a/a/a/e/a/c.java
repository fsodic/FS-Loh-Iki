package c.a.a.a.e.a;

import c.a.a.a.l.g;
import c.a.a.a.p.a;

@Deprecated
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final d f655a = new b();

    public static d a(g gVar) {
        a.a(gVar, "HTTP parameters");
        d dVar = (d) gVar.getParameter("http.conn-manager.max-per-route");
        return dVar == null ? f655a : dVar;
    }

    public static void a(g gVar, int i) {
        a.a(gVar, "HTTP parameters");
        gVar.setIntParameter("http.conn-manager.max-total", i);
    }

    @Deprecated
    public static void a(g gVar, long j) {
        a.a(gVar, "HTTP parameters");
        gVar.setLongParameter("http.conn-manager.timeout", j);
    }

    public static void a(g gVar, d dVar) {
        a.a(gVar, "HTTP parameters");
        gVar.setParameter("http.conn-manager.max-per-route", dVar);
    }

    public static int b(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getIntParameter("http.conn-manager.max-total", 20);
    }
}
