package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

public final class G {
    public static J a(L l) {
        if (l == null) {
            return null;
        }
        return l.a(q.j().b());
    }

    public static boolean a(L l, J j, String... strArr) {
        if (l == null || j == null || !l.f2452a || j == null) {
            return false;
        }
        return l.a(j, q.j().b(), strArr);
    }
}
