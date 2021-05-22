package c.a.a.a.k;

import c.a.a.a.AbstractC0122f;
import c.a.a.a.p.a;
import c.a.a.a.p.h;
import c.a.a.a.z;

public class c implements AbstractC0122f, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f909a;

    /* renamed from: b  reason: collision with root package name */
    private final String f910b;

    /* renamed from: c  reason: collision with root package name */
    private final z[] f911c;

    public c(String str, String str2) {
        this(str, str2, null);
    }

    public c(String str, String str2, z[] zVarArr) {
        a.a((Object) str, "Name");
        this.f909a = str;
        this.f910b = str2;
        if (zVarArr != null) {
            this.f911c = zVarArr;
        } else {
            this.f911c = new z[0];
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0122f)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f909a.equals(cVar.f909a) && h.a(this.f910b, cVar.f910b) && h.a(this.f911c, cVar.f911c);
    }

    @Override // c.a.a.a.AbstractC0122f
    public String getName() {
        return this.f909a;
    }

    @Override // c.a.a.a.AbstractC0122f
    public z getParameter(int i) {
        return this.f911c[i];
    }

    @Override // c.a.a.a.AbstractC0122f
    public z getParameterByName(String str) {
        a.a((Object) str, "Name");
        z[] zVarArr = this.f911c;
        for (z zVar : zVarArr) {
            if (zVar.getName().equalsIgnoreCase(str)) {
                return zVar;
            }
        }
        return null;
    }

    @Override // c.a.a.a.AbstractC0122f
    public int getParameterCount() {
        return this.f911c.length;
    }

    @Override // c.a.a.a.AbstractC0122f
    public z[] getParameters() {
        return (z[]) this.f911c.clone();
    }

    @Override // c.a.a.a.AbstractC0122f
    public String getValue() {
        return this.f910b;
    }

    public int hashCode() {
        int a2 = h.a(h.a(17, this.f909a), this.f910b);
        for (z zVar : this.f911c) {
            a2 = h.a(a2, zVar);
        }
        return a2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f909a);
        if (this.f910b != null) {
            sb.append("=");
            sb.append(this.f910b);
        }
        z[] zVarArr = this.f911c;
        for (z zVar : zVarArr) {
            sb.append("; ");
            sb.append(zVar);
        }
        return sb.toString();
    }
}
