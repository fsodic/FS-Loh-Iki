package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.pz  reason: case insensitive filesystem */
public final class C1991pz implements Sea<Oma.a> {
    public static C1991pz a() {
        return C1922oz.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Oma.a aVar = Oma.a.AD_LOADER;
        Xea.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
