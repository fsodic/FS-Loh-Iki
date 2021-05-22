package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.z  reason: case insensitive filesystem */
public final class C2612z {
    public static boolean a(String str) {
        return a((String) C2392voa.e().a(C2474x.nd), str);
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                q.g().a(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
