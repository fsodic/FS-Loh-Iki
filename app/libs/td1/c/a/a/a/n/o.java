package c.a.a.a.n;

import c.a.a.a.l.g;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;

public class o implements s {

    /* renamed from: a  reason: collision with root package name */
    private final String f971a;

    public o() {
        this(null);
    }

    public o(String str) {
        this.f971a = str;
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        if (!rVar.containsHeader("User-Agent")) {
            String str = null;
            g params = rVar.getParams();
            if (params != null) {
                str = (String) params.getParameter("http.useragent");
            }
            if (str == null) {
                str = this.f971a;
            }
            if (str != null) {
                rVar.addHeader("User-Agent", str);
            }
        }
    }
}
