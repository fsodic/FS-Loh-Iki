package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1125daa;
import com.google.android.gms.internal.ads.C1331gaa;
import com.google.android.gms.internal.ads.WZ;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* access modifiers changed from: package-private */
public final class QX {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f2941a = Charset.forName("UTF-8");

    public static C1331gaa a(C1125daa daa) {
        C1331gaa.b n = C1331gaa.n();
        n.a(daa.n());
        for (C1125daa.b bVar : daa.o()) {
            C1331gaa.a.C0036a n2 = C1331gaa.a.n();
            n2.a(bVar.q().n());
            n2.a(bVar.n());
            n2.a(bVar.o());
            n2.a(bVar.r());
            n.a((C1331gaa.a) n2.j());
        }
        return (C1331gaa) n.j();
    }

    public static void b(C1125daa daa) {
        int n = daa.n();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (C1125daa.b bVar : daa.o()) {
            if (bVar.n() == XZ.ENABLED) {
                if (!bVar.p()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bVar.r())));
                } else if (bVar.o() == EnumC1951paa.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bVar.r())));
                } else if (bVar.n() != XZ.UNKNOWN_STATUS) {
                    if (bVar.r() == n) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (bVar.q().p() != WZ.a.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bVar.r())));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
