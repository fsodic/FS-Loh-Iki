package c.a.a.a.i.a;

import c.a.a.a.a.i;
import c.a.a.a.b.c;
import c.a.a.a.h.b;
import c.a.a.a.n.e;
import c.a.a.a.o;
import c.a.a.a.t;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public b f732a;

    public g(b bVar) {
        this.f732a = bVar == null ? new b(getClass()) : bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[Catch:{ p -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7 A[Catch:{ p -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(c.a.a.a.o r7, c.a.a.a.t r8, c.a.a.a.b.c r9, c.a.a.a.a.i r10, c.a.a.a.n.e r11) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.a.g.a(c.a.a.a.o, c.a.a.a.t, c.a.a.a.b.c, c.a.a.a.a.i, c.a.a.a.n.e):boolean");
    }

    public boolean b(o oVar, t tVar, c cVar, i iVar, e eVar) {
        if (cVar.b(oVar, tVar, eVar)) {
            this.f732a.a("Authentication required");
            if (iVar.d() == c.a.a.a.a.b.SUCCESS) {
                cVar.a(oVar, iVar.b(), eVar);
            }
            return true;
        }
        int i = f.f731a[iVar.d().ordinal()];
        if (i == 1 || i == 2) {
            this.f732a.a("Authentication succeeded");
            iVar.a(c.a.a.a.a.b.SUCCESS);
            cVar.b(oVar, iVar.b(), eVar);
            return false;
        } else if (i == 3) {
            return false;
        } else {
            iVar.a(c.a.a.a.a.b.UNCHALLENGED);
            return false;
        }
    }
}
