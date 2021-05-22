package c.a.a.a.k;

import c.a.a.a.D;
import c.a.a.a.G;
import c.a.a.a.p.a;
import c.a.a.a.p.d;
import java.io.Serializable;

public class o implements G, Cloneable, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final D f938a;

    /* renamed from: b  reason: collision with root package name */
    private final int f939b;

    /* renamed from: c  reason: collision with root package name */
    private final String f940c;

    public o(D d, int i, String str) {
        a.a(d, "Version");
        this.f938a = d;
        a.a(i, "Status code");
        this.f939b = i;
        this.f940c = str;
    }

    @Override // java.lang.Object
    public Object clone() {
        return super.clone();
    }

    @Override // c.a.a.a.G
    public D getProtocolVersion() {
        return this.f938a;
    }

    @Override // c.a.a.a.G
    public String getReasonPhrase() {
        return this.f940c;
    }

    @Override // c.a.a.a.G
    public int getStatusCode() {
        return this.f939b;
    }

    public String toString() {
        return j.f926b.b((d) null, this).toString();
    }
}
