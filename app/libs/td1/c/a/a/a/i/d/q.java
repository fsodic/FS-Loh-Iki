package c.a.a.a.i.d;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.d;
import c.a.a.a.f.f;
import c.a.a.a.f.n;
import c.a.a.a.p.a;
import c.a.a.a.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class q extends AbstractC0127b {
    public q() {
    }

    protected q(b... bVarArr) {
        super(bVarArr);
    }

    protected static String a(f fVar) {
        return fVar.a();
    }

    protected static String b(f fVar) {
        String b2 = fVar.b();
        int lastIndexOf = b2.lastIndexOf(47);
        if (lastIndexOf < 0) {
            return b2;
        }
        if (lastIndexOf == 0) {
            lastIndexOf = 1;
        }
        return b2.substring(0, lastIndexOf);
    }

    /* access modifiers changed from: protected */
    public List<c> a(AbstractC0122f[] fVarArr, f fVar) {
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (AbstractC0122f fVar2 : fVarArr) {
            String name = fVar2.getName();
            String value = fVar2.getValue();
            if (name == null || name.isEmpty()) {
                throw new n("Cookie name may not be empty");
            }
            C0129d dVar = new C0129d(name, value);
            dVar.setPath(b(fVar));
            dVar.setDomain(a(fVar));
            z[] parameters = fVar2.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                z zVar = parameters[length];
                String lowerCase = zVar.getName().toLowerCase(Locale.ROOT);
                dVar.a(lowerCase, zVar.getValue());
                d a2 = a(lowerCase);
                if (a2 != null) {
                    a2.a(dVar, zVar.getValue());
                }
            }
            arrayList.add(dVar);
        }
        return arrayList;
    }

    @Override // c.a.a.a.f.i
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        for (d dVar : a()) {
            dVar.a(cVar, fVar);
        }
    }

    @Override // c.a.a.a.f.i
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        for (d dVar : a()) {
            if (!dVar.b(cVar, fVar)) {
                return false;
            }
        }
        return true;
    }
}
