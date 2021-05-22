package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1125daa;
import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

@Deprecated
public final class FX {
    @Deprecated
    public static final BX a(byte[] bArr) {
        try {
            C1125daa a2 = C1125daa.a(bArr, C1197eca.a());
            for (C1125daa.b bVar : a2.o()) {
                if (bVar.q().p() == WZ.a.UNKNOWN_KEYMATERIAL || bVar.q().p() == WZ.a.SYMMETRIC || bVar.q().p() == WZ.a.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return BX.a(a2);
        } catch (Bca unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
