package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.wF  reason: case insensitive filesystem */
public final class C2411wF implements Sea<String> {
    public static C2411wF a() {
        return C2342vF.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        q.c();
        String a2 = C2452wk.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
