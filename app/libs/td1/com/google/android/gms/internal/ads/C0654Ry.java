package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.Ry  reason: case insensitive filesystem */
public final class C0654Ry implements Sea<Oma.a> {
    public static C0654Ry a() {
        return C0628Qy.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Oma.a aVar = Oma.a.INTERSTITIAL;
        Xea.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
