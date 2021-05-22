package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.nT  reason: case insensitive filesystem */
public abstract class AbstractC1805nT<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final SW<?> f5044a = JW.a((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final VW f5045b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f5046c;
    private final AbstractC2632zT<E> d;

    public AbstractC1805nT(VW vw, ScheduledExecutorService scheduledExecutorService, AbstractC2632zT<E> zTVar) {
        this.f5045b = vw;
        this.f5046c = scheduledExecutorService;
        this.d = zTVar;
    }

    public final C1943pT a(E e, SW<?>... swArr) {
        return new C1943pT(this, e, Arrays.asList(swArr));
    }

    public final C2080rT a(E e) {
        return new C2080rT(this, e);
    }

    public final <I> C2218tT<I> a(E e, SW<I> sw) {
        return new C2218tT<>(this, e, sw, Collections.singletonList(sw), sw);
    }

    /* access modifiers changed from: protected */
    public abstract String b(E e);
}
