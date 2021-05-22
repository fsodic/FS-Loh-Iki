package c.a.a.a.i.d;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.f.b;
import c.a.a.a.f.c;
import c.a.a.a.f.d;
import c.a.a.a.f.f;
import c.a.a.a.f.n;
import c.a.a.a.k.q;
import c.a.a.a.p.a;
import c.a.a.a.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class G extends z {
    public G() {
        this((String[]) null, false);
    }

    G(boolean z, b... bVarArr) {
        super(z, bVarArr);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public G(java.lang.String[] r4, boolean r5) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.i.d.G.<init>(java.lang.String[], boolean):void");
    }

    private List<c> b(AbstractC0122f[] fVarArr, f fVar) {
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (AbstractC0122f fVar2 : fVarArr) {
            String name = fVar2.getName();
            String value = fVar2.getValue();
            if (name == null || name.isEmpty()) {
                throw new n("Cookie name may not be empty");
            }
            C0128c cVar = new C0128c(name, value);
            cVar.setPath(q.b(fVar));
            cVar.setDomain(q.a(fVar));
            cVar.setPorts(new int[]{fVar.c()});
            z[] parameters = fVar2.getParameters();
            HashMap hashMap = new HashMap(parameters.length);
            for (int length = parameters.length - 1; length >= 0; length--) {
                z zVar = parameters[length];
                hashMap.put(zVar.getName().toLowerCase(Locale.ROOT), zVar);
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                z zVar2 = (z) entry.getValue();
                String lowerCase = zVar2.getName().toLowerCase(Locale.ROOT);
                cVar.a(lowerCase, zVar2.getValue());
                d a2 = a(lowerCase);
                if (a2 != null) {
                    a2.a(cVar, zVar2.getValue());
                }
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    private static f c(f fVar) {
        String a2 = fVar.a();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= a2.length()) {
                z = true;
                break;
            }
            char charAt = a2.charAt(i);
            if (charAt == '.' || charAt == ':') {
                break;
            }
            i++;
        }
        if (!z) {
            return fVar;
        }
        return new f(a2 + ".local", fVar.c(), fVar.b(), fVar.d());
    }

    @Override // c.a.a.a.i.d.z, c.a.a.a.f.i
    public List<c> a(AbstractC0121e eVar, f fVar) {
        a.a(eVar, "Header");
        a.a(fVar, "Cookie origin");
        if (eVar.getName().equalsIgnoreCase("Set-Cookie2")) {
            return b(eVar.getElements(), c(fVar));
        }
        throw new n("Unrecognized cookie header '" + eVar.toString() + "'");
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.d.q
    public List<c> a(AbstractC0122f[] fVarArr, f fVar) {
        return b(fVarArr, c(fVar));
    }

    @Override // c.a.a.a.i.d.z, c.a.a.a.i.d.q, c.a.a.a.f.i
    public void a(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        super.a(cVar, c(fVar));
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.d.z
    public void a(c.a.a.a.p.d dVar, c cVar, int i) {
        String attribute;
        int[] ports;
        super.a(dVar, cVar, i);
        if ((cVar instanceof c.a.a.a.f.a) && (attribute = ((c.a.a.a.f.a) cVar).getAttribute("port")) != null) {
            dVar.a("; $Port");
            dVar.a("=\"");
            if (!attribute.trim().isEmpty() && (ports = cVar.getPorts()) != null) {
                int length = ports.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        dVar.a(",");
                    }
                    dVar.a(Integer.toString(ports[i2]));
                }
            }
            dVar.a("\"");
        }
    }

    @Override // c.a.a.a.i.d.q, c.a.a.a.f.i
    public boolean b(c cVar, f fVar) {
        a.a(cVar, "Cookie");
        a.a(fVar, "Cookie origin");
        return super.b(cVar, c(fVar));
    }

    @Override // c.a.a.a.i.d.z, c.a.a.a.f.i
    public int getVersion() {
        return 1;
    }

    @Override // c.a.a.a.i.d.z, c.a.a.a.f.i
    public AbstractC0121e getVersionHeader() {
        c.a.a.a.p.d dVar = new c.a.a.a.p.d(40);
        dVar.a("Cookie2");
        dVar.a(": ");
        dVar.a("$Version=");
        dVar.a(Integer.toString(getVersion()));
        return new q(dVar);
    }

    @Override // c.a.a.a.i.d.z
    public String toString() {
        return "rfc2965";
    }
}
