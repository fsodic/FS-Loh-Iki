package b.c.b.a.d.d;

import b.c.b.a.d.d.M;

/* access modifiers changed from: package-private */
public final class L implements AbstractC0088qa {

    /* renamed from: a  reason: collision with root package name */
    private static final L f367a = new L();

    private L() {
    }

    public static L a() {
        return f367a;
    }

    @Override // b.c.b.a.d.d.AbstractC0088qa
    public final boolean a(Class<?> cls) {
        return M.class.isAssignableFrom(cls);
    }

    @Override // b.c.b.a.d.d.AbstractC0088qa
    public final AbstractC0086pa b(Class<?> cls) {
        if (!M.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (AbstractC0086pa) M.a(cls.asSubclass(M.class)).a(M.d.f375c, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
