package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oF  reason: case insensitive filesystem */
public final class C1860oF implements Sea<List<String>> {
    public static C1860oF a() {
        return C2066rF.a();
    }

    public static List<String> b() {
        List<String> a2 = C2474x.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
