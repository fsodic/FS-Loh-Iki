package b.c.b.a.d.d;

final class E {

    /* renamed from: a  reason: collision with root package name */
    private static final C<?> f340a = new D();

    /* renamed from: b  reason: collision with root package name */
    private static final C<?> f341b = c();

    static C<?> a() {
        return f340a;
    }

    static C<?> b() {
        C<?> c2 = f341b;
        if (c2 != null) {
            return c2;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static C<?> c() {
        try {
            return (C) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
