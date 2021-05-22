package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.NZ;
import java.security.GeneralSecurityException;

final class MY extends AbstractC2636zX<SZ, NZ> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ KY f2598b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MY(KY ky, Class cls) {
        super(cls);
        this.f2598b = ky;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ SZ a(Iba iba) {
        return SZ.a(iba, C1197eca.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ void a(SZ sz) {
        SZ sz2 = sz;
        if (sz2.n() >= 16) {
            KY.a(sz2.o());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ NZ b(SZ sz) {
        SZ sz2 = sz;
        NZ.a q = NZ.q();
        q.a(0);
        q.a(sz2.o());
        q.a(Iba.a(C1677lba.a(sz2.n())));
        return (NZ) q.j();
    }
}
