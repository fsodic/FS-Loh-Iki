package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

public final class FY extends AbstractC2429wX<SY> {
    FY() {
        super(SY.class, new IY(CX.class));
    }

    /* access modifiers changed from: private */
    public static void b(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    /* access modifiers changed from: private */
    public static void b(WY wy) {
        if (wy.n() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (wy.n() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ SY a(Iba iba) {
        return SY.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(SY sy) {
        SY sy2 = sy;
        C1746mba.a(sy2.n(), 0);
        b(sy2.o().size());
        b(sy2.p());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.TY, com.google.android.gms.internal.ads.SY>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, SY> f() {
        return new HY(this, TY.class);
    }
}
