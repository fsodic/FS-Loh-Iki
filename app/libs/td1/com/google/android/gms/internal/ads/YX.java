package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C0916aZ;

/* access modifiers changed from: package-private */
public final class YX extends AbstractC2636zX<C1123dZ, C0916aZ> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ WX f3566b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YX(WX wx, Class cls) {
        super(cls);
        this.f3566b = wx;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ C1123dZ a(Iba iba) {
        return C1123dZ.a(iba, C1197eca.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ void a(C1123dZ dZVar) {
        C1123dZ dZVar2 = dZVar;
        C1746mba.a(dZVar2.n());
        WX wx = this.f3566b;
        WX.a((WX) dZVar2.o());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ C0916aZ b(C1123dZ dZVar) {
        C1123dZ dZVar2 = dZVar;
        C0916aZ.a q = C0916aZ.q();
        q.a(dZVar2.o());
        q.a(Iba.a(C1677lba.a(dZVar2.n())));
        q.a(0);
        return (C0916aZ) q.j();
    }
}
