package c.a.a.a.l;

import c.a.a.a.p.a;

@Deprecated
public final class e implements c {
    public static int a(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getIntParameter("http.connection.timeout", 0);
    }

    public static void a(g gVar, int i) {
        a.a(gVar, "HTTP parameters");
        gVar.setIntParameter("http.connection.timeout", i);
    }

    public static void a(g gVar, boolean z) {
        a.a(gVar, "HTTP parameters");
        gVar.setBooleanParameter("http.tcp.nodelay", z);
    }

    public static int b(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getIntParameter("http.socket.linger", -1);
    }

    public static void b(g gVar, int i) {
        a.a(gVar, "HTTP parameters");
        gVar.setIntParameter("http.socket.timeout", i);
    }

    public static void c(g gVar, int i) {
        a.a(gVar, "HTTP parameters");
        gVar.setIntParameter("http.socket.buffer-size", i);
    }

    public static boolean c(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getBooleanParameter("http.socket.reuseaddr", false);
    }

    public static int d(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getIntParameter("http.socket.timeout", 0);
    }

    public static boolean e(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getBooleanParameter("http.tcp.nodelay", true);
    }

    public static boolean f(g gVar) {
        a.a(gVar, "HTTP parameters");
        return gVar.getBooleanParameter("http.connection.stalecheck", true);
    }
}
