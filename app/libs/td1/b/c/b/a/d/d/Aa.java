package b.c.b.a.d.d;

final class Aa {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC0103ya f332a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final AbstractC0103ya f333b = new C0105za();

    static AbstractC0103ya a() {
        return f332a;
    }

    static AbstractC0103ya b() {
        return f333b;
    }

    private static AbstractC0103ya c() {
        try {
            return (AbstractC0103ya) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
