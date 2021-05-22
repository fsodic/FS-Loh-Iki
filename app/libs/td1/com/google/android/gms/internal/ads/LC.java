package com.google.android.gms.internal.ads;

public final class LC implements Sea<String> {
    public static LC a() {
        return KC.a();
    }

    public static String b() {
        Xea.a("rewarded", "Cannot return null from a non-@Nullable @Provides method");
        return "rewarded";
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
