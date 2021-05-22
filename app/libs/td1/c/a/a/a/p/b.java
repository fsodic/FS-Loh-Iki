package c.a.a.a.p;

public class b {
    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str + " is null");
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
