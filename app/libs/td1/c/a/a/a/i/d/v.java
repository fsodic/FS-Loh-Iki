package c.a.a.a.i.d;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.k.c;
import c.a.a.a.k.m;
import c.a.a.a.k.w;
import c.a.a.a.k.x;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.z;
import java.util.ArrayList;
import java.util.BitSet;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f860a = new v();

    /* renamed from: b  reason: collision with root package name */
    private static final BitSet f861b = x.a(61, 59);

    /* renamed from: c  reason: collision with root package name */
    private static final BitSet f862c = x.a(59);
    private final x d = x.f952a;

    private z b(d dVar, w wVar) {
        String a2 = this.d.a(dVar, wVar, f861b);
        if (wVar.a()) {
            return new m(a2, null);
        }
        char charAt = dVar.charAt(wVar.b());
        wVar.a(wVar.b() + 1);
        if (charAt != '=') {
            return new m(a2, null);
        }
        String a3 = this.d.a(dVar, wVar, f862c);
        if (!wVar.a()) {
            wVar.a(wVar.b() + 1);
        }
        return new m(a2, a3);
    }

    public AbstractC0122f a(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        z b2 = b(dVar, wVar);
        ArrayList arrayList = new ArrayList();
        while (!wVar.a()) {
            arrayList.add(b(dVar, wVar));
        }
        return new c(b2.getName(), b2.getValue(), (z[]) arrayList.toArray(new z[arrayList.size()]));
    }
}
