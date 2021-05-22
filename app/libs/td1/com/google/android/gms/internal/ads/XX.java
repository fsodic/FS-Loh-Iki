package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.XY;

final class XX extends AbstractC2636zX<_Y, XY> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ VX f3502b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    XX(VX vx, Class cls) {
        super(cls);
        this.f3502b = vx;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.bda' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ _Y a(Iba iba) {
        return _Y.a(iba, C1197eca.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ void a(_Y _y) {
        _Y _y2 = _y;
        new WX().f().a(_y2.n());
        new KY().f().a(_y2.o());
        C1746mba.a(_y2.n().n());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.bda] */
    @Override // com.google.android.gms.internal.ads.AbstractC2636zX
    public final /* synthetic */ XY b(_Y _y) {
        _Y _y2 = _y;
        XY.a q = XY.q();
        q.a(new WX().f().b(_y2.n()));
        q.a(new KY().f().b(_y2.o()));
        q.a(0);
        return (XY) q.j();
    }
}
