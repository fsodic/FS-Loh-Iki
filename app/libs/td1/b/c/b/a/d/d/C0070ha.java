package b.c.b.a.d.d;

import b.c.b.a.d.d.M;

/* renamed from: b.c.b.a.d.d.ha  reason: case insensitive filesystem */
final class C0070ha implements Ga {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC0088qa f427a = new C0072ia();

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0088qa f428b;

    public C0070ha() {
        this(new C0074ja(L.a(), a()));
    }

    private C0070ha(AbstractC0088qa qaVar) {
        O.a((Object) qaVar, "messageInfoFactory");
        this.f428b = qaVar;
    }

    private static AbstractC0088qa a() {
        try {
            return (AbstractC0088qa) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f427a;
        }
    }

    private static boolean a(AbstractC0086pa paVar) {
        return paVar.r() == M.d.i;
    }

    @Override // b.c.b.a.d.d.Ga
    public final <T> Fa<T> a(Class<T> cls) {
        Ha.a((Class<?>) cls);
        AbstractC0086pa b2 = this.f428b.b(cls);
        return b2.s() ? M.class.isAssignableFrom(cls) ? C0099wa.a(Ha.c(), E.a(), b2.t()) : C0099wa.a(Ha.a(), E.b(), b2.t()) : M.class.isAssignableFrom(cls) ? a(b2) ? C0097va.a(cls, b2, Aa.b(), AbstractC0060ca.b(), Ha.c(), E.a(), C0084oa.b()) : C0097va.a(cls, b2, Aa.b(), AbstractC0060ca.b(), Ha.c(), null, C0084oa.b()) : a(b2) ? C0097va.a(cls, b2, Aa.a(), AbstractC0060ca.a(), Ha.a(), E.b(), C0084oa.a()) : C0097va.a(cls, b2, Aa.a(), AbstractC0060ca.a(), Ha.b(), null, C0084oa.a());
    }
}
