package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;

/* renamed from: com.google.android.gms.internal.ads.xY  reason: case insensitive filesystem */
final class C2499xY extends AbstractC2429wX<GZ> {
    public C2499xY() {
        super(GZ.class, new C2430wY(AbstractC2153sX.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ GZ a(Iba iba) {
        return GZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(GZ gz) {
        GZ gz2 = gz;
        C1746mba.a(gz2.n(), 0);
        EY.a(gz2.o());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.ASYMMETRIC_PUBLIC;
    }
}
