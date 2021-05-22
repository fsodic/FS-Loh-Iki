package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.kF  reason: case insensitive filesystem */
public final class C1584kF implements Sea<SW<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1955pca> f4748a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f4749b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<VW> f4750c;

    private C1584kF(_ea<C1955pca> _ea, _ea<Context> _ea2, _ea<VW> _ea3) {
        this.f4748a = _ea;
        this.f4749b = _ea2;
        this.f4750c = _ea3;
    }

    public static C1584kF a(_ea<C1955pca> _ea, _ea<Context> _ea2, _ea<VW> _ea3) {
        return new C1584kF(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        SW a2 = this.f4750c.get().a(new CallableC1653lF(this.f4748a.get(), this.f4749b.get()));
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
