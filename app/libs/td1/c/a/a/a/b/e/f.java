package c.a.a.a.b.e;

import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;

public class f implements s {

    /* renamed from: a  reason: collision with root package name */
    public b f631a = new b(f.class);

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        if (rVar.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            rVar.setHeader("Proxy-Connection", "Keep-Alive");
            return;
        }
        c.a.a.a.e.b.e l = a.a(eVar).l();
        if (l == null) {
            this.f631a.a("Connection route not set in the context");
            return;
        }
        if ((l.getHopCount() == 1 || l.isTunnelled()) && !rVar.containsHeader("Connection")) {
            rVar.addHeader("Connection", "Keep-Alive");
        }
        if (l.getHopCount() == 2 && !l.isTunnelled() && !rVar.containsHeader("Proxy-Connection")) {
            rVar.addHeader("Proxy-Connection", "Keep-Alive");
        }
    }
}
