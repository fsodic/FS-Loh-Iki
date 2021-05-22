package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ty  reason: case insensitive filesystem */
public final class C0706Ty implements Sea<String> {
    public static C0706Ty a() {
        return C0680Sy.a();
    }

    public static String b() {
        Xea.a("interstitial", "Cannot return null from a non-@Nullable @Provides method");
        return "interstitial";
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
