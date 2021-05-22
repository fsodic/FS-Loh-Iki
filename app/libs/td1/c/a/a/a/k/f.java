package c.a.a.a.k;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import c.a.a.a.z;

public class f implements s {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final f f918a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final f f919b = new f();

    /* access modifiers changed from: protected */
    public int a(AbstractC0122f fVar) {
        if (fVar == null) {
            return 0;
        }
        int length = fVar.getName().length();
        String value = fVar.getValue();
        if (value != null) {
            length += value.length() + 3;
        }
        int parameterCount = fVar.getParameterCount();
        if (parameterCount > 0) {
            for (int i = 0; i < parameterCount; i++) {
                length += a(fVar.getParameter(i)) + 2;
            }
        }
        return length;
    }

    /* access modifiers changed from: protected */
    public int a(z zVar) {
        if (zVar == null) {
            return 0;
        }
        int length = zVar.getName().length();
        String value = zVar.getValue();
        return value != null ? length + value.length() + 3 : length;
    }

    /* access modifiers changed from: protected */
    public int a(z[] zVarArr) {
        if (zVarArr == null || zVarArr.length < 1) {
            return 0;
        }
        int length = (zVarArr.length - 1) * 2;
        for (z zVar : zVarArr) {
            length += a(zVar);
        }
        return length;
    }

    public d a(d dVar, AbstractC0122f fVar, boolean z) {
        a.a(fVar, "Header element");
        int a2 = a(fVar);
        if (dVar == null) {
            dVar = new d(a2);
        } else {
            dVar.a(a2);
        }
        dVar.a(fVar.getName());
        String value = fVar.getValue();
        if (value != null) {
            dVar.append('=');
            a(dVar, value, z);
        }
        int parameterCount = fVar.getParameterCount();
        if (parameterCount > 0) {
            for (int i = 0; i < parameterCount; i++) {
                dVar.a("; ");
                a(dVar, fVar.getParameter(i), z);
            }
        }
        return dVar;
    }

    public d a(d dVar, z zVar, boolean z) {
        a.a(zVar, "Name / value pair");
        int a2 = a(zVar);
        if (dVar == null) {
            dVar = new d(a2);
        } else {
            dVar.a(a2);
        }
        dVar.a(zVar.getName());
        String value = zVar.getValue();
        if (value != null) {
            dVar.append('=');
            a(dVar, value, z);
        }
        return dVar;
    }

    public d a(d dVar, z[] zVarArr, boolean z) {
        a.a(zVarArr, "Header parameter array");
        int a2 = a(zVarArr);
        if (dVar == null) {
            dVar = new d(a2);
        } else {
            dVar.a(a2);
        }
        for (int i = 0; i < zVarArr.length; i++) {
            if (i > 0) {
                dVar.a("; ");
            }
            a(dVar, zVarArr[i], z);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void a(d dVar, String str, boolean z) {
        if (!z) {
            boolean z2 = z;
            for (int i = 0; i < str.length() && !z2; i++) {
                z2 = a(str.charAt(i));
            }
            z = z2;
        }
        if (z) {
            dVar.append('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (b(charAt)) {
                dVar.append('\\');
            }
            dVar.append(charAt);
        }
        if (z) {
            dVar.append('\"');
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(char c2) {
        return " ;,:@()<>\\\"/[]?={}\t".indexOf(c2) >= 0;
    }

    /* access modifiers changed from: protected */
    public boolean b(char c2) {
        return "\"\\".indexOf(c2) >= 0;
    }
}
