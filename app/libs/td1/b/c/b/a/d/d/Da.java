package b.c.b.a.d.d;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
public final class Da {

    /* renamed from: a  reason: collision with root package name */
    private static final Da f337a = new Da();

    /* renamed from: b  reason: collision with root package name */
    private final Ga f338b = new C0070ha();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, Fa<?>> f339c = new ConcurrentHashMap();

    private Da() {
    }

    public static Da a() {
        return f337a;
    }

    public final <T> Fa<T> a(Class<T> cls) {
        O.a((Object) cls, "messageType");
        Fa<T> fa = (Fa<T>) this.f339c.get(cls);
        if (fa != null) {
            return fa;
        }
        Fa<T> a2 = this.f338b.a(cls);
        O.a((Object) cls, "messageType");
        O.a((Object) a2, "schema");
        Fa<T> fa2 = (Fa<T>) this.f339c.putIfAbsent(cls, a2);
        return fa2 != null ? fa2 : a2;
    }

    public final <T> Fa<T> a(T t) {
        return a((Class) t.getClass());
    }
}
