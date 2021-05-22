package b.d.a.a;

/* access modifiers changed from: package-private */
public class u {
    public static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " should not be null!");
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new AssertionError(str);
        }
    }
}
