package c.a.a.a.i.d;

import c.a.a.a.f.i;
import c.a.a.a.f.j;
import c.a.a.a.f.k;
import c.a.a.a.l.g;
import c.a.a.a.n.e;
import java.util.Collection;

@Deprecated
public class o implements j, k {

    /* renamed from: a  reason: collision with root package name */
    private final a f852a;

    /* renamed from: b  reason: collision with root package name */
    private final i f853b;

    public enum a {
        SECURITYLEVEL_DEFAULT,
        SECURITYLEVEL_IE_MEDIUM
    }

    public o() {
        this(null, a.SECURITYLEVEL_DEFAULT);
    }

    public o(String[] strArr, a aVar) {
        this.f852a = aVar;
        this.f853b = new n(strArr, aVar);
    }

    @Override // c.a.a.a.f.j
    public i a(g gVar) {
        String[] strArr = null;
        if (gVar == null) {
            return new n(null, this.f852a);
        }
        Collection collection = (Collection) gVar.getParameter("http.protocol.cookie-datepatterns");
        if (collection != null) {
            strArr = (String[]) collection.toArray(new String[collection.size()]);
        }
        return new n(strArr, this.f852a);
    }

    @Override // c.a.a.a.f.k
    public i a(e eVar) {
        return this.f853b;
    }
}
