package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Qs  reason: case insensitive filesystem */
public final class C0622Qs implements Sea<C0388Hs> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0882_s> f2975a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC0631Rb> f2976b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Runnable> f2977c;
    private final _ea<Executor> d;

    public C0622Qs(_ea<C0882_s> _ea, _ea<AbstractC0631Rb> _ea2, _ea<Runnable> _ea3, _ea<Executor> _ea4) {
        this.f2975a = _ea;
        this.f2976b = _ea2;
        this.f2977c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0388Hs(this.f2975a.get(), this.f2976b.get(), this.f2977c.get(), this.d.get());
    }
}
