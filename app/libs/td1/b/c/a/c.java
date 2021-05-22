package b.c.a;

import com.google.android.gms.ads.f;

@Deprecated
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f252a = new c(-1, -2, "mb");

    /* renamed from: b  reason: collision with root package name */
    public static final c f253b = new c(320, 50, "mb");

    /* renamed from: c  reason: collision with root package name */
    public static final c f254c = new c(300, 250, "as");
    public static final c d = new c(468, 60, "as");
    public static final c e = new c(728, 90, "as");
    public static final c f = new c(160, 600, "as");
    private final f g;

    private c(int i, int i2, String str) {
        this(new f(i, i2));
    }

    public c(f fVar) {
        this.g = fVar;
    }

    public final int a() {
        return this.g.a();
    }

    public final int b() {
        return this.g.b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return this.g.equals(((c) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g.toString();
    }
}
