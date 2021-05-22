package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class JY extends AbstractC2567yX<CX, NZ> {
    JY(Class cls) {
        super(cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2567yX
    public final /* synthetic */ CX a(NZ nz) {
        NZ nz2 = nz;
        LZ o = nz2.p().o();
        SecretKeySpec secretKeySpec = new SecretKeySpec(nz2.o().a(), "HMAC");
        int n = nz2.p().n();
        int i = LY.f2502a[o.ordinal()];
        if (i == 1) {
            return new C1539jba("HMACSHA1", secretKeySpec, n);
        }
        if (i == 2) {
            return new C1539jba("HMACSHA256", secretKeySpec, n);
        }
        if (i == 3) {
            return new C1539jba("HMACSHA512", secretKeySpec, n);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
