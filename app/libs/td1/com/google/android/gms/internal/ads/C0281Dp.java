package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Dp  reason: case insensitive filesystem */
public final class C0281Dp implements Sea<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f1823a;

    public C0281Dp(C0203Ap ap) {
        this.f1823a = ap;
    }

    public static Context a(C0203Ap ap) {
        Context a2 = ap.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f1823a);
    }
}
