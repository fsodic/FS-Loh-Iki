package c.a.a.a.k;

import c.a.a.a.D;
import c.a.a.a.F;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.io.Serializable;

public class n implements F, Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final D f935a;

    /* renamed from: b  reason: collision with root package name */
    private final String f936b;

    /* renamed from: c  reason: collision with root package name */
    private final String f937c;

    public n(String str, String str2, D d) {
        a.a((Object) str, "Method");
        this.f936b = str;
        a.a((Object) str2, "URI");
        this.f937c = str2;
        a.a(d, "Version");
        this.f935a = d;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    @Override // c.a.a.a.F
    public String getMethod() {
        return this.f936b;
    }

    @Override // c.a.a.a.F
    public D getProtocolVersion() {
        return this.f935a;
    }

    @Override // c.a.a.a.F
    public String getUri() {
        return this.f937c;
    }

    public String toString() {
        return j.f926b.a((d) null, this).toString();
    }
}
