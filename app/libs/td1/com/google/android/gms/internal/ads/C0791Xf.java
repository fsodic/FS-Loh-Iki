package com.google.android.gms.internal.ads;

import b.c.a.a;
import b.c.a.b;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Xf  reason: case insensitive filesystem */
public final class C0791Xf {
    public static int a(a aVar) {
        int i = C0843Zf.f3652b[aVar.ordinal()];
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static com.google.ads.mediation.a a(Zna zna, boolean z) {
        List<String> list = zna.e;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zna.f3678b);
        int i = zna.d;
        return new com.google.ads.mediation.a(date, i != 1 ? i != 2 ? b.UNKNOWN : b.FEMALE : b.MALE, hashSet, z, zna.k);
    }
}
