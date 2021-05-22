package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ds  reason: case insensitive filesystem */
public final class C0284Ds implements Sea<String> {
    public static C0284Ds a() {
        return C0362Gs.f2083a;
    }

    public static String b() {
        Xea.a("banner", "Cannot return null from a non-@Nullable @Provides method");
        return "banner";
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
