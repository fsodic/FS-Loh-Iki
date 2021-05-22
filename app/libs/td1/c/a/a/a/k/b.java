package c.a.a.a.k;

import c.a.a.a.AbstractC0121e;
import c.a.a.a.AbstractC0122f;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.io.Serializable;

public class b implements AbstractC0121e, Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f907a;

    /* renamed from: b  reason: collision with root package name */
    private final String f908b;

    public b(String str, String str2) {
        a.a((Object) str, "Name");
        this.f907a = str;
        this.f908b = str2;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    @Override // c.a.a.a.AbstractC0121e
    public AbstractC0122f[] getElements() {
        String str = this.f908b;
        return str != null ? g.a(str, (t) null) : new AbstractC0122f[0];
    }

    @Override // c.a.a.a.AbstractC0121e
    public String getName() {
        return this.f907a;
    }

    @Override // c.a.a.a.AbstractC0121e
    public String getValue() {
        return this.f908b;
    }

    public String toString() {
        return j.f926b.a((d) null, this).toString();
    }
}
