package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rz  reason: case insensitive filesystem */
public final class C2128rz implements Sea<String> {
    public static C2128rz a() {
        return C2060qz.a();
    }

    public static String b() {
        Xea.a("native", "Cannot return null from a non-@Nullable @Provides method");
        return "native";
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
