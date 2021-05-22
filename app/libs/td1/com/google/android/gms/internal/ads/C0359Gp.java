package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Gp  reason: case insensitive filesystem */
public final class C0359Gp implements Sea<WeakReference<Context>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2078a;

    public C0359Gp(C0203Ap ap) {
        this.f2078a = ap;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        WeakReference<Context> b2 = this.f2078a.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
