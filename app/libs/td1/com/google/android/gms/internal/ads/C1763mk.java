package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.mk  reason: case insensitive filesystem */
public final class C1763mk extends C0745Vl {
    public static boolean a() {
        return C0745Vl.a(2) && C1950pa.f5237a.a().booleanValue();
    }

    public static void e(String str, Throwable th) {
        if (a()) {
            Log.v("Ads", str, th);
        }
    }

    public static void f(String str) {
        if (a()) {
            Log.v("Ads", str);
        }
    }
}
