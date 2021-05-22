package c.a.a.a.k;

import c.a.a.a.p.a;
import c.a.a.a.p.h;
import c.a.a.a.z;
import java.io.Serializable;

public class m implements z, Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f933a;

    /* renamed from: b  reason: collision with root package name */
    private final String f934b;

    public m(String str, String str2) {
        a.a((Object) str, "Name");
        this.f933a = str;
        this.f934b = str2;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f933a.equals(mVar.f933a) && h.a(this.f934b, mVar.f934b);
    }

    @Override // c.a.a.a.z
    public String getName() {
        return this.f933a;
    }

    @Override // c.a.a.a.z
    public String getValue() {
        return this.f934b;
    }

    public int hashCode() {
        return h.a(h.a(17, this.f933a), this.f934b);
    }

    public String toString() {
        if (this.f934b == null) {
            return this.f933a;
        }
        StringBuilder sb = new StringBuilder(this.f933a.length() + 1 + this.f934b.length());
        sb.append(this.f933a);
        sb.append("=");
        sb.append(this.f934b);
        return sb.toString();
    }
}
