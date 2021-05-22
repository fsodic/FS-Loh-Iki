package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.fT  reason: case insensitive filesystem */
public final class C1254fT implements Sea<ThreadFactory> {
    public static C1254fT a() {
        return C1529jT.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        SS ss = new SS();
        Xea.a(ss, "Cannot return null from a non-@Nullable @Provides method");
        return ss;
    }
}
