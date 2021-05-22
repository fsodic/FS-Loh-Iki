package c.a.a.a.a;

import c.a.a.a.p.a;
import c.a.a.a.p.h;
import java.io.Serializable;
import java.security.Principal;

public class s implements n, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final k f611a;

    /* renamed from: b  reason: collision with root package name */
    private final String f612b;

    public s(String str) {
        String str2;
        a.a((Object) str, "Username:password string");
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.f611a = new k(str.substring(0, indexOf));
            str2 = str.substring(indexOf + 1);
        } else {
            this.f611a = new k(str);
            str2 = null;
        }
        this.f612b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && h.a(this.f611a, ((s) obj).f611a);
    }

    @Override // c.a.a.a.a.n
    public String getPassword() {
        return this.f612b;
    }

    @Override // c.a.a.a.a.n
    public Principal getUserPrincipal() {
        return this.f611a;
    }

    public int hashCode() {
        return this.f611a.hashCode();
    }

    public String toString() {
        return this.f611a.toString();
    }
}
