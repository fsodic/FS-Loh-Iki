package c.a.a.a.i.d;

import c.a.a.a.AbstractC0120d;
import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.f.c;
import c.a.a.a.f.f;
import c.a.a.a.k.q;
import c.a.a.a.k.w;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class n extends q {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f851b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(java.lang.String[] r4, c.a.a.a.i.d.o.a r5) {
        /*
            r3 = this;
            r0 = 7
            c.a.a.a.f.b[] r0 = new c.a.a.a.f.b[r0]
            c.a.a.a.i.d.p r1 = new c.a.a.a.i.d.p
            r1.<init>()
            r2 = 0
            r0[r2] = r1
            c.a.a.a.i.d.f r1 = new c.a.a.a.i.d.f
            r1.<init>()
            r2 = 1
            r0[r2] = r1
            c.a.a.a.i.d.o$a r1 = c.a.a.a.i.d.o.a.SECURITYLEVEL_IE_MEDIUM
            if (r5 != r1) goto L_0x001d
            c.a.a.a.i.d.m r5 = new c.a.a.a.i.d.m
            r5.<init>()
            goto L_0x0022
        L_0x001d:
            c.a.a.a.i.d.i r5 = new c.a.a.a.i.d.i
            r5.<init>()
        L_0x0022:
            r1 = 2
            r0[r1] = r5
            r5 = 3
            c.a.a.a.i.d.h r1 = new c.a.a.a.i.d.h
            r1.<init>()
            r0[r5] = r1
            r5 = 4
            c.a.a.a.i.d.j r1 = new c.a.a.a.i.d.j
            r1.<init>()
            r0[r5] = r1
            r5 = 5
            c.a.a.a.i.d.e r1 = new c.a.a.a.i.d.e
            r1.<init>()
            r0[r5] = r1
            r5 = 6
            c.a.a.a.i.d.g r1 = new c.a.a.a.i.d.g
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r4.clone()
            java.lang.String[] r4 = (java.lang.String[]) r4
            goto L_0x004b
        L_0x0049:
            java.lang.String[] r4 = c.a.a.a.i.d.n.f851b
        L_0x004b:
            r1.<init>(r4)
            r0[r5] = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.d.n.<init>(java.lang.String[], c.a.a.a.i.d.o$a):void");
    }

    private static boolean b(String str) {
        return str != null && str.startsWith("\"") && str.endsWith("\"");
    }

    @Override // c.a.a.a.f.i
    public List<c> a(AbstractC0121e eVar, f fVar) {
        w wVar;
        d dVar;
        a.a(eVar, "Header");
        a.a(fVar, "Cookie origin");
        if (eVar.getName().equalsIgnoreCase("Set-Cookie")) {
            AbstractC0122f[] elements = eVar.getElements();
            boolean z = false;
            boolean z2 = false;
            for (AbstractC0122f fVar2 : elements) {
                if (fVar2.getParameterByName("version") != null) {
                    z2 = true;
                }
                if (fVar2.getParameterByName("expires") != null) {
                    z = true;
                }
            }
            if (!z && z2) {
                return a(elements, fVar);
            }
            v vVar = v.f860a;
            if (eVar instanceof AbstractC0120d) {
                AbstractC0120d dVar2 = (AbstractC0120d) eVar;
                dVar = dVar2.getBuffer();
                wVar = new w(dVar2.getValuePos(), dVar.length());
            } else {
                String value = eVar.getValue();
                if (value != null) {
                    dVar = new d(value.length());
                    dVar.a(value);
                    wVar = new w(0, dVar.length());
                } else {
                    throw new c.a.a.a.f.n("Header value is null");
                }
            }
            AbstractC0122f a2 = vVar.a(dVar, wVar);
            String name = a2.getName();
            String value2 = a2.getValue();
            if (name == null || name.isEmpty()) {
                throw new c.a.a.a.f.n("Cookie name may not be empty");
            }
            C0129d dVar3 = new C0129d(name, value2);
            dVar3.setPath(q.b(fVar));
            dVar3.setDomain(q.a(fVar));
            z[] parameters = a2.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                z zVar = parameters[length];
                String lowerCase = zVar.getName().toLowerCase(Locale.ROOT);
                dVar3.a(lowerCase, zVar.getValue());
                c.a.a.a.f.d a3 = a(lowerCase);
                if (a3 != null) {
                    a3.a(dVar3, zVar.getValue());
                }
            }
            if (z) {
                dVar3.setVersion(0);
            }
            return Collections.singletonList(dVar3);
        }
        throw new c.a.a.a.f.n("Unrecognized cookie header '" + eVar.toString() + "'");
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
            String name = cVar.getName();
            String value = cVar.getValue();
            if (cVar.getVersion() <= 0 || b(value)) {
                dVar.a(name);
                dVar.a("=");
                if (value != null) {
                    dVar.a(value);
                }
            } else {
                c.a.a.a.k.f.f919b.a(dVar, (AbstractC0122f) new c.a.a.a.k.c(name, value), false);
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
        return "compatibility";
    }
}
