package b.c.b.a.d.d;

/* access modifiers changed from: package-private */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f331a = b();

    public static B a() {
        if (f331a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return B.f335b;
    }

    private static final B a(String str) {
        return (B) f331a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
