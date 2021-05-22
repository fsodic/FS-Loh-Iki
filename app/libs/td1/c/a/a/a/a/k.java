package c.a.a.a.a;

import c.a.a.a.p.a;
import c.a.a.a.p.h;
import java.io.Serializable;
import java.security.Principal;

public final class k implements Principal, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f604a;

    public k(String str) {
        a.a((Object) str, "User name");
        this.f604a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && h.a(this.f604a, ((k) obj).f604a);
    }

    public String getName() {
        return this.f604a;
    }

    public int hashCode() {
        return h.a(17, this.f604a);
    }

    public String toString() {
        return "[principal: " + this.f604a + "]";
    }
}
