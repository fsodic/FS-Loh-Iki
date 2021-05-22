package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.aY  reason: case insensitive filesystem */
public final class C0915aY extends AbstractC2429wX<C1398hZ> {
    C0915aY() {
        super(C1398hZ.class, new _X(AbstractC1947pX.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ C1398hZ a(Iba iba) {
        return C1398hZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(C1398hZ hZVar) {
        C1398hZ hZVar2 = hZVar;
        C1746mba.a(hZVar2.n(), 0);
        C1746mba.a(hZVar2.o().size());
        if (hZVar2.p().n() != 12 && hZVar2.p().n() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.iZ, com.google.android.gms.internal.ads.hZ>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, C1398hZ> f() {
        return new C1053cY(this, C1467iZ.class);
    }
}
