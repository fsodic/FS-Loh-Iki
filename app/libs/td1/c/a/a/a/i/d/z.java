package c.a.a.a.i.d;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.f.g;
import c.a.a.a.f.h;
import c.a.a.a.f.n;
import c.a.a.a.k.q;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class z extends q {

    /* renamed from: b  reason: collision with root package name */
    static final String[] f864b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy"};

    /* renamed from: c  reason: collision with root package name */
    private final boolean f865c;

    public z() {
        this((String[]) null, false);
    }

    protected z(boolean z, b... bVarArr) {
        super(bVarArr);
        this.f865c = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(java.lang.String[] r4, boolean r5) {
        /*
            r3 = this;
            r0 = 7
            c.a.a.a.f.b[] r0 = new c.a.a.a.f.b[r0]
            c.a.a.a.i.d.B r1 = new c.a.a.a.i.d.B
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            c.a.a.a.i.d.i r1 = new c.a.a.a.i.d.i
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            c.a.a.a.i.d.y r1 = new c.a.a.a.i.d.y
            r1.<init>()
            r2 = 2
            r0[r2] = r1
            c.a.a.a.i.d.h r1 = new c.a.a.a.i.d.h
            r1.<init>()
            r2 = 3
            r0[r2] = r1
            c.a.a.a.i.d.j r1 = new c.a.a.a.i.d.j
            r1.<init>()
            r2 = 4
            r0[r2] = r1
            c.a.a.a.i.d.e r1 = new c.a.a.a.i.d.e
            r1.<init>()
            r2 = 5
            r0[r2] = r1
            c.a.a.a.i.d.g r1 = new c.a.a.a.i.d.g
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x0040
        L_0x003e:
            java.lang.String[] r4 = c.a.a.a.i.d.z.f864b
        L_0x0040:
            r1.<init>(r4)
            r4 = 6
            r0[r4] = r1
            r3.<init>(r0)
            r3.f865c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.d.z.<init>(java.lang.String[], boolean):void");
    }

    private List<AbstractC0121e> a(List<c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (c cVar : list) {
            int version = cVar.getVersion();
            d dVar = new d(40);
            dVar.a("Cookie: ");
            dVar.a("$Version=");
            dVar.a(Integer.toString(version));
            dVar.a("; ");
            a(dVar, cVar, version);
            arrayList.add(new q(dVar));
        }
        return arrayList;
    }

    private List<AbstractC0121e> b(List<c> list) {
        int i = Integer.MAX_VALUE;
        for (c cVar : list) {
            if (cVar.getVersion() < i) {
                i = cVar.getVersion();
            }
        }
        d dVar = new d(list.size() * 40);
        dVar.a("Cookie");
        dVar.a(": ");
        dVar.a("$Version=");
        dVar.a(Integer.toString(i));
        for (c cVar2 : list) {
            dVar.a("; ");
            a(dVar, cVar2, i);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new q(dVar));
        return arrayList;
    }

    @Override // c.a.a.a.f.i
    public List<c> a(AbstractC0121e eVar, f fVar) {
        a.a(eVar, "Header");
        a.a(fVar, "Cookie origin");
        if (eVar.getName().equalsIgnoreCase("Set-Cookie")) {
            return a(eVar.getElements(), fVar);
        }
        throw new n("Unrecognized cookie header '" + eVar.toString() + "'");
    }

    @Override // c.a.a.a.i.d.q, c.a.a.a.f.i
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        String name = cVar.getName();
        if (name.indexOf(32) != -1) {
            throw new h("Cookie name may not contain blanks");
        } else if (!name.startsWith("$")) {
            super.a(cVar, fVar);
        } else {
            throw new h("Cookie name may not start with $");
        }
    }

    /* access modifiers changed from: protected */
    public void a(d dVar, c cVar, int i) {
        a(dVar, cVar.getName(), cVar.getValue(), i);
        if (cVar.getPath() != null && (cVar instanceof c.a.a.a.f.a) && ((c.a.a.a.f.a) cVar).containsAttribute("path")) {
            dVar.a("; ");
            a(dVar, "$Path", cVar.getPath(), i);
        }
        if (cVar.getDomain() != null && (cVar instanceof c.a.a.a.f.a) && ((c.a.a.a.f.a) cVar).containsAttribute("domain")) {
            dVar.a("; ");
            a(dVar, "$Domain", cVar.getDomain(), i);
        }
    }

    /* access modifiers changed from: protected */
    public void a(d dVar, String str, String str2, int i) {
        dVar.a(str);
        dVar.a("=");
        if (str2 == null) {
            return;
        }
        if (i > 0) {
            dVar.append('\"');
            dVar.a(str2);
            dVar.append('\"');
            return;
        }
        dVar.a(str2);
    }

    @Override // c.a.a.a.f.i
    public List<AbstractC0121e> formatCookies(List<c> list) {
        a.a((Collection) list, "List of cookies");
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            Collections.sort(arrayList, g.f707a);
            list = arrayList;
        }
        return this.f865c ? b(list) : a(list);
    }

    @Override // c.a.a.a.f.i
    public int getVersion() {
        return 1;
    }

    @Override // c.a.a.a.f.i
    public AbstractC0121e getVersionHeader() {
        return null;
    }

    public String toString() {
        return "rfc2109";
    }
}
