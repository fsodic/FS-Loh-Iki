package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Ep  reason: case insensitive filesystem */
public final class C0307Ep implements Sea<C0847Zj> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f1909a;

    public C0307Ep(C0203Ap ap) {
        this.f1909a = ap;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0847Zj g = q.g();
        Xea.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
