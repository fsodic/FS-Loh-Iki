package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.sY  reason: case insensitive filesystem */
public final class C2154sY extends IX<FZ, GZ> {
    C2154sY() {
        super(FZ.class, GZ.class, new C2361vY(AbstractC2222tX.class));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ AbstractC0993bda a(Iba iba) {
        return FZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(AbstractC0993bda bda) {
        FZ fz = (FZ) bda;
        if (!fz.o().isEmpty()) {
            C1746mba.a(fz.n(), 0);
            EY.a(fz.p().o());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<BZ, FZ> f() {
        return new C2292uY(this, BZ.class);
    }
}
