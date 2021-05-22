package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;

/* renamed from: com.google.android.gms.internal.ads.bY  reason: case insensitive filesystem */
public final class C0984bY extends AbstractC2429wX<C1742mZ> {
    C0984bY() {
        super(C1742mZ.class, new C1190eY(AbstractC1947pX.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ C1742mZ a(Iba iba) {
        return C1742mZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(C1742mZ mZVar) {
        C1742mZ mZVar2 = mZVar;
        C1746mba.a(mZVar2.n(), 0);
        C1746mba.a(mZVar2.o().size());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.rZ, com.google.android.gms.internal.ads.mZ>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, C1742mZ> f() {
        return new C1122dY(this, C2086rZ.class);
    }
}
