package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.pda  reason: case insensitive filesystem */
public final class C1957pda {

    /* renamed from: a  reason: collision with root package name */
    private static final C1957pda f5251a = new C1957pda();

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2646zda f5252b = new Tca();

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, AbstractC2439wda<?>> f5253c = new ConcurrentHashMap();

    private C1957pda() {
    }

    public static C1957pda a() {
        return f5251a;
    }

    public final <T> AbstractC2439wda<T> a(Class<T> cls) {
        C2230tca.a((Object) cls, "messageType");
        AbstractC2439wda<T> wda = (AbstractC2439wda<T>) this.f5253c.get(cls);
        if (wda != null) {
            return wda;
        }
        AbstractC2439wda<T> a2 = this.f5252b.a(cls);
        C2230tca.a((Object) cls, "messageType");
        C2230tca.a((Object) a2, "schema");
        AbstractC2439wda<T> wda2 = (AbstractC2439wda<T>) this.f5253c.putIfAbsent(cls, a2);
        return wda2 != null ? wda2 : a2;
    }

    public final <T> AbstractC2439wda<T> a(T t) {
        return a((Class) t.getClass());
    }
}
