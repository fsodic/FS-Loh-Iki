package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.WZ;
import java.security.GeneralSecurityException;

public final class WX extends AbstractC2429wX<C0916aZ> {
    WX() {
        super(C0916aZ.class, new ZX(AbstractC1333gba.class));
    }

    /* access modifiers changed from: private */
    public static void a(C1191eZ eZVar) {
        if (eZVar.n() < 12 || eZVar.n() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ C0916aZ a(Iba iba) {
        return C0916aZ.a(iba, C1197eca.a());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final /* synthetic */ void a(C0916aZ aZVar) {
        C0916aZ aZVar2 = aZVar;
        C1746mba.a(aZVar2.n(), 0);
        C1746mba.a(aZVar2.o().size());
        a(aZVar2.p());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final WZ.a c() {
        return WZ.a.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.zX<com.google.android.gms.internal.ads.dZ, com.google.android.gms.internal.ads.aZ>' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2429wX
    public final AbstractC2636zX<?, C0916aZ> f() {
        return new YX(this, C1123dZ.class);
    }
}
