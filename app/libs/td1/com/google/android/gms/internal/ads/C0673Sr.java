package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sr  reason: case insensitive filesystem */
public final class C0673Sr implements Sea<String> {
    public static C0673Sr a() {
        return C0751Vr.f3377a;
    }

    public static String b() {
        Xea.a("app_open_ad", "Cannot return null from a non-@Nullable @Provides method");
        return "app_open_ad";
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
