package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.rY  reason: case insensitive filesystem */
public final class C2085rY extends AbstractC2429wX<C2364vaa> {
    C2085rY() {
        super(C2364vaa.class, new C2017qY(AbstractC1947pX.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ C2364vaa a(Iba iba) {
        return C2364vaa.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(C2364vaa vaa) {
        C2364vaa vaa2 = vaa;
        C1746mba.a(vaa2.n(), 0);
        if (vaa2.o().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.waa, com.google.android.gms.internal.ads.vaa>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, C2364vaa> f() {
        return new C2223tY(this, C2433waa.class);
    }
}
