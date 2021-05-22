package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.om  reason: case insensitive filesystem */
public class C1905om<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C1423hm<T> f5163a = new C1423hm<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f5164b = new AtomicInteger(0);

    public C1905om() {
        JW.a(this.f5163a, new C1836nm(this), C0875_l.f);
    }

    @Deprecated
    public final int a() {
        return this.f5164b.get();
    }

    @Deprecated
    public final void a(AbstractC1698lm<T> lmVar, AbstractC1560jm jmVar) {
        JW.a(this.f5163a, new C2043qm(this, lmVar, jmVar), C0875_l.f);
    }

    @Deprecated
    public final void a(T t) {
        this.f5163a.b(t);
    }

    @Deprecated
    public final void b() {
        this.f5163a.a(new Exception());
    }
}
