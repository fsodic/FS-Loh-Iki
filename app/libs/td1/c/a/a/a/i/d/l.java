package c.a.a.a.i.d;

import c.a.a.a.f.i;
import c.a.a.a.f.j;
import c.a.a.a.f.k;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import java.util.Collection;

@Deprecated
public class l implements j, k {

    /* renamed from: a  reason: collision with root package name */
    private final i f850a;

    public l() {
        this(null, false);
    }

    public l(String[] strArr, boolean z) {
        this.f850a = new k(strArr, z);
    }

    @Override // c.a.a.a.f.j
    public i a(g gVar) {
        if (gVar == null) {
            return new k();
        }
        String[] strArr = null;
        Collection collection = (Collection) gVar.getParameter("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new k(strArr, gVar.getBooleanParameter("http.protocol.single-cookie-header", false));
    }

    @Override // c.a.a.a.f.k
    public i a(e eVar) {
        return this.f850a;
    }
}
