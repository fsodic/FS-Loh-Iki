package b.c.b.a.d.d;

/* renamed from: b.c.b.a.d.d.oa  reason: case insensitive filesystem */
final class C0084oa {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC0080ma f442a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final AbstractC0080ma f443b = new C0082na();

    static AbstractC0080ma a() {
        return f442a;
    }

    static AbstractC0080ma b() {
        return f443b;
    }

    private static AbstractC0080ma c() {
        try {
            return (AbstractC0080ma) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
