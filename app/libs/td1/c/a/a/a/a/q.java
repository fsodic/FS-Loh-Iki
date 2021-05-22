package c.a.a.a.a;

import c.a.a.a.p.h;
import java.io.Serializable;
import java.security.Principal;

public class q implements n, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final r f608a;

    /* renamed from: b  reason: collision with root package name */
    private final String f609b;

    /* renamed from: c  reason: collision with root package name */
    private final String f610c;

    public String a() {
        this.f608a.a();
        throw null;
    }

    public String b() {
        this.f608a.b();
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.a(this.f608a, qVar.f608a) && h.a(this.f610c, qVar.f610c);
    }

    @Override // c.a.a.a.a.n
    public String getPassword() {
        return this.f609b;
    }

    @Override // c.a.a.a.a.n
    public Principal getUserPrincipal() {
        return this.f608a;
    }

    public int hashCode() {
        return h.a(h.a(17, this.f608a), this.f610c);
    }

    public String toString() {
        return "[principal: " + this.f608a + "][workstation: " + this.f610c + "]";
    }
}
