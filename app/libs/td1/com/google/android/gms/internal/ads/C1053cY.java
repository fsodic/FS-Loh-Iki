package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1398hZ;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cY  reason: case insensitive filesystem */
final class C1053cY extends AbstractC2636zX<C1467iZ, C1398hZ> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0915aY f4000b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1053cY(C0915aY aYVar, Class cls) {
        super(cls);
        this.f4000b = aYVar;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ C1467iZ a(Iba iba) {
        return C1467iZ.a(iba, C1197eca.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ void a(C1467iZ iZVar) {
        C1467iZ iZVar2 = iZVar;
        C1746mba.a(iZVar2.n());
        if (iZVar2.o().n() != 12 && iZVar2.o().n() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ C1398hZ b(C1467iZ iZVar) {
        C1467iZ iZVar2 = iZVar;
        C1398hZ.a q = C1398hZ.q();
        q.a(Iba.a(C1677lba.a(iZVar2.n())));
        q.a(iZVar2.o());
        q.a(0);
        return (C1398hZ) q.j();
    }
}
