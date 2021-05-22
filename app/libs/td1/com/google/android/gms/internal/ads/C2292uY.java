package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.FZ;
import com.google.android.gms.internal.ads.GZ;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.uY  reason: case insensitive filesystem */
final class C2292uY extends AbstractC2636zX<BZ, FZ> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C2154sY f5729b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2292uY(C2154sY sYVar, Class cls) {
        super(cls);
        this.f5729b = sYVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ BZ a(Iba iba) {
        return BZ.a(iba, C1197eca.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ void a(BZ bz) {
        EY.a(bz.n());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ FZ b(BZ bz) {
        BZ bz2 = bz;
        KeyPair a2 = Uaa.a(Uaa.a(EY.a(bz2.n().n().n())));
        ECPoint w = ((ECPublicKey) a2.getPublic()).getW();
        GZ.a r = GZ.r();
        r.a(0);
        r.a(bz2.n());
        r.a(Iba.a(w.getAffineX().toByteArray()));
        r.b(Iba.a(w.getAffineY().toByteArray()));
        FZ.a q = FZ.q();
        q.a(0);
        q.a((GZ) r.j());
        q.a(Iba.a(((ECPrivateKey) a2.getPrivate()).getS().toByteArray()));
        return (FZ) q.j();
    }
}
