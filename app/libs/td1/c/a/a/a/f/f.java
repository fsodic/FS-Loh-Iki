package c.a.a.a.f;

import c.a.a.a.p.a;
import c.a.a.a.p.i;
import java.util.Locale;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f704a;

    /* renamed from: b  reason: collision with root package name */
    private final int f705b;

    /* renamed from: c  reason: collision with root package name */
    private final String f706c;
    private final boolean d;

    public f(String str, int i, String str2, boolean z) {
        a.b(str, "Host");
        a.a(i, "Port");
        a.a((Object) str2, "Path");
        this.f704a = str.toLowerCase(Locale.ROOT);
        this.f705b = i;
        if (!i.b(str2)) {
            this.f706c = str2;
        } else {
            this.f706c = "/";
        }
        this.d = z;
    }

    public String a() {
        return this.f704a;
    }

    public String b() {
        return this.f706c;
    }

    public int c() {
        return this.f705b;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.d) {
            sb.append("(secure)");
        }
        sb.append(this.f704a);
        sb.append(':');
        sb.append(Integer.toString(this.f705b));
        sb.append(this.f706c);
        sb.append(']');
        return sb.toString();
    }
}
