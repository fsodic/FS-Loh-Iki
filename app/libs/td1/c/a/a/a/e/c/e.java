package c.a.a.a.e.c;

import c.a.a.a.p.a;
import c.a.a.a.p.h;
import java.util.Locale;

@Deprecated
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f673a;

    /* renamed from: b  reason: collision with root package name */
    private final j f674b;

    /* renamed from: c  reason: collision with root package name */
    private final int f675c;
    private final boolean d;
    private String e;

    public e(String str, int i, j jVar) {
        a.a((Object) str, "Scheme name");
        a.a(i > 0 && i <= 65535, "Port is invalid");
        a.a(jVar, "Socket factory");
        this.f673a = str.toLowerCase(Locale.ENGLISH);
        this.f675c = i;
        if (jVar instanceof f) {
            this.d = true;
        } else if (jVar instanceof b) {
            this.d = true;
            this.f674b = new g((b) jVar);
            return;
        } else {
            this.d = false;
        }
        this.f674b = jVar;
    }

    @Deprecated
    public e(String str, l lVar, int i) {
        a.a((Object) str, "Scheme name");
        a.a(lVar, "Socket factory");
        a.a(i > 0 && i <= 65535, "Port is invalid");
        this.f673a = str.toLowerCase(Locale.ENGLISH);
        if (lVar instanceof c) {
            this.f674b = new h((c) lVar);
            this.d = true;
        } else {
            this.f674b = new k(lVar);
            this.d = false;
        }
        this.f675c = i;
    }

    public final int a() {
        return this.f675c;
    }

    public final int a(int i) {
        return i <= 0 ? this.f675c : i;
    }

    public final String b() {
        return this.f673a;
    }

    public final j c() {
        return this.f674b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f673a.equals(eVar.f673a) && this.f675c == eVar.f675c && this.d == eVar.d;
    }

    public int hashCode() {
        return h.a(h.a(h.a(17, this.f675c), this.f673a), this.d);
    }

    public final String toString() {
        if (this.e == null) {
            this.e = this.f673a + ':' + Integer.toString(this.f675c);
        }
        return this.e;
    }
}
