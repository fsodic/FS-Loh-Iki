package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iO  reason: case insensitive filesystem */
public final class C1456iO<T> implements Sea<C1112dO<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f4562a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Set<AbstractC1180eO<? extends AbstractC0905aO<T>>>> f4563b;

    private C1456iO(_ea<Executor> _ea, _ea<Set<AbstractC1180eO<? extends AbstractC0905aO<T>>>> _ea2) {
        this.f4562a = _ea;
        this.f4563b = _ea2;
    }

    public static <T> C1112dO<T> a(Executor executor, Set<AbstractC1180eO<? extends AbstractC0905aO<T>>> set) {
        return new C1112dO<>(executor, set);
    }

    public static <T> C1456iO<T> a(_ea<Executor> _ea, _ea<Set<AbstractC1180eO<? extends AbstractC0905aO<T>>>> _ea2) {
        return new C1456iO<>(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4562a.get(), this.f4563b.get());
    }
}
