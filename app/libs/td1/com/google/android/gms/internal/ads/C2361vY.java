package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.ads.vY  reason: case insensitive filesystem */
final class C2361vY extends AbstractC2567yX<AbstractC2222tX, FZ> {
    C2361vY(Class cls) {
        super(cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC2567yX
    public final /* synthetic */ AbstractC2222tX a(FZ fz) {
        FZ fz2 = fz;
        CZ o = fz2.p().o();
        JZ n = o.n();
        Waa a2 = EY.a(n.n());
        byte[] a3 = fz2.o().a();
        return new Maa((ECPrivateKey) Xaa.i.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, a3), Uaa.a(a2))), n.p().a(), EY.a(n.o()), EY.a(o.p()), new GY(o.o().n()));
    }
}
