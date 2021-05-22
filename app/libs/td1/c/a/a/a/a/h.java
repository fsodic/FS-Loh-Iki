package c.a.a.a.a;

import c.a.a.a.o;
import c.a.a.a.p.a;
import java.util.Locale;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f598a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f599b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final String f600c = null;
    public static final h d = new h(f598a, -1, f599b, f600c);
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final o i;

    public h(o oVar, String str, String str2) {
        a.a(oVar, "Host");
        this.g = oVar.d().toLowerCase(Locale.ROOT);
        this.h = oVar.e() < 0 ? -1 : oVar.e();
        this.f = str == null ? f599b : str;
        this.e = str2 == null ? f600c : str2.toUpperCase(Locale.ROOT);
        this.i = oVar;
    }

    public h(String str, int i2) {
        this(str, i2, f599b, f600c);
    }

    public h(String str, int i2, String str2, String str3) {
        this.g = str == null ? f598a : str.toLowerCase(Locale.ROOT);
        this.h = i2 < 0 ? -1 : i2;
        this.f = str2 == null ? f599b : str2;
        this.e = str3 == null ? f600c : str3.toUpperCase(Locale.ROOT);
        this.i = null;
    }

    public int a(h hVar) {
        int i2;
        if (c.a.a.a.p.h.a(this.e, hVar.e)) {
            i2 = 1;
        } else {
            String str = this.e;
            String str2 = f600c;
            if (str != str2 && hVar.e != str2) {
                return -1;
            }
            i2 = 0;
        }
        if (c.a.a.a.p.h.a(this.f, hVar.f)) {
            i2 += 2;
        } else {
            String str3 = this.f;
            String str4 = f599b;
            if (!(str3 == str4 || hVar.f == str4)) {
                return -1;
            }
        }
        int i3 = this.h;
        int i4 = hVar.h;
        if (i3 == i4) {
            i2 += 4;
        } else if (!(i3 == -1 || i4 == -1)) {
            return -1;
        }
        if (c.a.a.a.p.h.a(this.g, hVar.g)) {
            return i2 + 8;
        }
        String str5 = this.g;
        String str6 = f598a;
        if (str5 == str6 || hVar.g == str6) {
            return i2;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        return c.a.a.a.p.h.a(this.g, hVar.g) && this.h == hVar.h && c.a.a.a.p.h.a(this.f, hVar.f) && c.a.a.a.p.h.a(this.e, hVar.e);
    }

    public int hashCode() {
        return c.a.a.a.p.h.a(c.a.a.a.p.h.a(c.a.a.a.p.h.a(c.a.a.a.p.h.a(17, this.g), this.h), this.f), this.e);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.e;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(' ');
        }
        if (this.f != null) {
            sb.append('\'');
            sb.append(this.f);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        if (this.g != null) {
            sb.append('@');
            sb.append(this.g);
            if (this.h >= 0) {
                sb.append(':');
                sb.append(this.h);
            }
        }
        return sb.toString();
    }
}
