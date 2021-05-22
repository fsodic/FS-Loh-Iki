package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.Oma;

/* renamed from: com.google.android.gms.internal.ads.Qr  reason: case insensitive filesystem */
public final class C0621Qr implements Sea<Oma.a> {
    public static C0621Qr a() {
        return C0699Tr.f3211a;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Oma.a aVar = Oma.a.APP_OPEN;
        Xea.a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }
}
