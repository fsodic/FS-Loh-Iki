package b.c.b.a.d.d;

/* access modifiers changed from: package-private */
/* renamed from: b.c.b.a.d.d.g  reason: case insensitive filesystem */
public final class C0067g {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f423a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f424b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a() {
        return f423a != null && !f424b;
    }

    static Class<?> b() {
        return f423a;
    }
}
