package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

public final class KY extends AbstractC2429wX<NZ> {
    public KY() {
        super(NZ.class, new JY(CX.class));
    }

    /* access modifiers changed from: private */
    public static void b(TZ tz) {
        if (tz.n() >= 10) {
            int i = LY.f2502a[tz.o().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (tz.n() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (tz.n() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (tz.n() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ NZ a(Iba iba) {
        return NZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(NZ nz) {
        NZ nz2 = nz;
        C1746mba.a(nz2.n(), 0);
        if (nz2.o().size() >= 16) {
            b(nz2.p());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.SZ, com.google.android.gms.internal.ads.NZ>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, NZ> f() {
        return new MY(this, SZ.class);
    }
}
