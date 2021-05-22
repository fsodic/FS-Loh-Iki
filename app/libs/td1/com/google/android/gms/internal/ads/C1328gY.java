package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gY  reason: case insensitive filesystem */
public final class C1328gY extends AbstractC2429wX<C2155sZ> {
    C1328gY() {
        super(C2155sZ.class, new C1259fY(AbstractC1947pX.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ C2155sZ a(Iba iba) {
        return C2155sZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(C2155sZ sZVar) {
        C2155sZ sZVar2 = sZVar;
        C1746mba.a(sZVar2.n(), 0);
        if (sZVar2.o().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.vZ, com.google.android.gms.internal.ads.sZ>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, C2155sZ> f() {
        return new C1466iY(this, C2362vZ.class);
    }
}
