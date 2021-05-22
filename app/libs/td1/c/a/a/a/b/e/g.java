package c.a.a.a.b.e;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.r;
import c.a.a.a.s;
import java.util.Collection;

public class g implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<? extends AbstractC0121e> f632a;

    public g() {
        this(null);
    }

    public g(Collection<? extends AbstractC0121e> collection) {
        this.f632a = collection;
    }

    @Override // c.a.a.a.s
    public void a(r rVar, e eVar) {
        a.a(rVar, "HTTP request");
        if (!rVar.getRequestLine().getMethod().equalsIgnoreCase("CONNECT")) {
            Collection<? extends AbstractC0121e> collection = (Collection) rVar.getParams().getParameter("http.default-headers");
            if (collection == null) {
                collection = this.f632a;
            }
            if (collection != null) {
                for (AbstractC0121e eVar2 : collection) {
                    rVar.a(eVar2);
                }
            }
        }
    }
}
