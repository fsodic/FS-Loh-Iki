package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;

public final class VX extends AbstractC2429wX<XY> {
    VX() {
        super(XY.class, new UX(AbstractC1947pX.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ XY a(Iba iba) {
        return XY.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(XY xy) {
        C1746mba.a(xy.n(), 0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads._Y, com.google.android.gms.internal.ads.XY>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, XY> f() {
        return new XX(this, _Y.class);
    }
}
