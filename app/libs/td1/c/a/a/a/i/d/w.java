package c.a.a.a.i.d;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.n;
import c.a.a.a.k.q;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class w extends q {
    public w() {
        this((String[]) null);
    }

    w(b... bVarArr) {
        super(bVarArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(java.lang.String[] r6) {
        /*
            r5 = this;
            r0 = 5
            c.a.a.a.f.b[] r0 = new c.a.a.a.f.b[r0]
            c.a.a.a.i.d.i r1 = new c.a.a.a.i.d.i
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            c.a.a.a.i.d.u r1 = new c.a.a.a.i.d.u
            r1.<init>()
            r3 = 1
            r0[r3] = r1
            c.a.a.a.i.d.j r1 = new c.a.a.a.i.d.j
            r1.<init>()
            r4 = 2
            r0[r4] = r1
            c.a.a.a.i.d.e r1 = new c.a.a.a.i.d.e
            r1.<init>()
            r4 = 3
            r0[r4] = r1
            c.a.a.a.i.d.g r1 = new c.a.a.a.i.d.g
            if (r6 == 0) goto L_0x002e
            java.lang.Object r6 = r6.clone()
            java.lang.String[] r6 = (java.lang.String[]) r6
            goto L_0x0034
        L_0x002e:
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r3 = "EEE, dd-MMM-yy HH:mm:ss z"
            r6[r2] = r3
        L_0x0034:
            r1.<init>(r6)
            r6 = 4
            r0[r6] = r1
            r5.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.d.w.<init>(java.lang.String[]):void");
    }

    @Override // c.a.a.a.f.i
    public List<c> a(AbstractC0121e eVar, f fVar) {
        c.a.a.a.k.w wVar;
        d dVar;
        a.a(eVar, "Header");
        a.a(fVar, "Cookie origin");
        if (eVar.getName().equalsIgnoreCase("Set-Cookie")) {
            v vVar = v.f860a;
            if (eVar instanceof AbstractC0120d) {
                AbstractC0120d dVar2 = (AbstractC0120d) eVar;
                dVar = dVar2.getBuffer();
                wVar = new c.a.a.a.k.w(dVar2.getValuePos(), dVar.length());
            } else {
                String value = eVar.getValue();
                if (value != null) {
                    dVar = new d(value.length());
                    dVar.a(value);
                    wVar = new c.a.a.a.k.w(0, dVar.length());
                } else {
                    throw new n("Header value is null");
                }
            }
            return a(new AbstractC0122f[]{vVar.a(dVar, wVar)}, fVar);
        }
        throw new n("Unrecognized cookie header '" + eVar.toString() + "'");
    }

    @Override // c.a.a.a.f.i
    public List<AbstractC0121e> formatCookies(List<c> list) {
        a.a((Collection) list, "List of cookies");
        d dVar = new d(list.size() * 20);
        dVar.a("Cookie");
        dVar.a(": ");
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (i > 0) {
                dVar.a("; ");
            }
            dVar.a(cVar.getName());
            String value = cVar.getValue();
            if (value != null) {
                dVar.a("=");
                dVar.a(value);
            }
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new q(dVar));
        return arrayList;
    }

    @Override // c.a.a.a.f.i
    public int getVersion() {
        return 0;
    }

    @Override // c.a.a.a.f.i
    public AbstractC0121e getVersionHeader() {
        return null;
    }

    public String toString() {
        return "netscape";
    }
}
