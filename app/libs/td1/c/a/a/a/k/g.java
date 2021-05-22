package c.a.a.a.k;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.z;
import java.util.ArrayList;
import java.util.BitSet;

public class g implements t {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final g f920a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static final g f921b = new g();

    /* renamed from: c  reason: collision with root package name */
    private static final BitSet f922c = x.a(61, 59, 44);
    private static final BitSet d = x.a(59, 44);
    private final x e = x.f952a;

    public static AbstractC0122f[] a(String str, t tVar) {
        a.a((Object) str, "Value");
        d dVar = new d(str.length());
        dVar.a(str);
        w wVar = new w(0, str.length());
        if (tVar == null) {
            tVar = f921b;
        }
        return tVar.a(dVar, wVar);
    }

    /* access modifiers changed from: protected */
    public AbstractC0122f a(String str, String str2, z[] zVarArr) {
        return new c(str, str2, zVarArr);
    }

    /* access modifiers changed from: protected */
    public z a(String str, String str2) {
        return new m(str, str2);
    }

    @Override // c.a.a.a.k.t
    public AbstractC0122f[] a(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        ArrayList arrayList = new ArrayList();
        while (!wVar.a()) {
            AbstractC0122f b2 = b(dVar, wVar);
            if (b2.getName().length() != 0 || b2.getValue() != null) {
                arrayList.add(b2);
            }
        }
        return (AbstractC0122f[]) arrayList.toArray(new AbstractC0122f[arrayList.size()]);
    }

    @Override // c.a.a.a.k.t
    public AbstractC0122f b(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        z c2 = c(dVar, wVar);
        return a(c2.getName(), c2.getValue(), (wVar.a() || dVar.charAt(wVar.b() + -1) == ',') ? null : d(dVar, wVar));
    }

    public z c(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        String a2 = this.e.a(dVar, wVar, f922c);
        if (wVar.a()) {
            return new m(a2, null);
        }
        char charAt = dVar.charAt(wVar.b());
        wVar.a(wVar.b() + 1);
        if (charAt != '=') {
            return a(a2, (String) null);
        }
        String b2 = this.e.b(dVar, wVar, d);
        if (!wVar.a()) {
            wVar.a(wVar.b() + 1);
        }
        return a(a2, b2);
    }

    public z[] d(d dVar, w wVar) {
        a.a((Object) dVar, "Char array buffer");
        a.a(wVar, "Parser cursor");
        this.e.a(dVar, wVar);
        ArrayList arrayList = new ArrayList();
        while (!wVar.a()) {
            arrayList.add(c(dVar, wVar));
            if (dVar.charAt(wVar.b() - 1) == ',') {
                break;
            }
        }
        return (z[]) arrayList.toArray(new z[arrayList.size()]);
    }
}
