package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.Bs  reason: case insensitive filesystem */
public final class C0232Bs implements Sea<Oma.a> {
    public static C0232Bs a() {
        return C0310Es.f1916a;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Oma.a aVar = Oma.a.BANNER;
        Xea.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
