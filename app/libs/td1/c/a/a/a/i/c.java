package c.a.a.a.i;

import c.a.a.a.E;
import c.a.a.a.G;
import c.a.a.a.k.i;
import c.a.a.a.n.e;
import c.a.a.a.p.a;
import c.a.a.a.t;
import c.a.a.a.u;
import java.util.Locale;

public class c implements u {

    /* renamed from: a  reason: collision with root package name */
    public static final c f788a = new c();

    /* renamed from: b  reason: collision with root package name */
    protected final E f789b;

    public c() {
        this(d.f841a);
    }

    public c(E e) {
        a.a(e, "Reason phrase catalog");
        this.f789b = e;
    }

    @Override // c.a.a.a.u
    public t a(G g, e eVar) {
        a.a(g, "Status line");
        return new i(g, this.f789b, a(eVar));
    }

    /* access modifiers changed from: protected */
    public Locale a(e eVar) {
        return Locale.getDefault();
    }
}
