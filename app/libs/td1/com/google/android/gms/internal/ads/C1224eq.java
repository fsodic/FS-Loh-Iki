package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eq  reason: case insensitive filesystem */
final class C1224eq implements AbstractC0647Rr {

    /* renamed from: a  reason: collision with root package name */
    private C1162dx f4249a;

    /* renamed from: b  reason: collision with root package name */
    private C2537xu f4250b;

    /* renamed from: c  reason: collision with root package name */
    private BR f4251c;
    private C2353vQ d;
    private ZP e;
    private final /* synthetic */ C0749Vp f;

    private C1224eq(C0749Vp vp) {
        this.f = vp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0647Rr
    @Deprecated
    public final /* synthetic */ AbstractC0647Rr a(C0881_r _rVar) {
        Xea.a(_rVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0647Rr
    public final /* synthetic */ AbstractC0647Rr a(C1162dx dxVar) {
        Xea.a(dxVar);
        this.f4249a = dxVar;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC0569Or> a(BR br) {
        this.f4251c = br;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC0569Or> a(ZP zp) {
        this.e = zp;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC0569Or> a(C2353vQ vQVar) {
        this.d = vQVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0647Rr
    /* renamed from: b */
    public final AbstractC0569Or a() {
        Xea.a(this.f4249a, C1162dx.class);
        Xea.a(this.f4250b, C2537xu.class);
        return new C1155dq(this.f, new C0337Ft(), new ZR(), new C1710lu(), new DE(), this.f4249a, this.f4250b, new C1391hS(), this.f4251c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0647Rr
    public final /* synthetic */ AbstractC0647Rr c(C2537xu xuVar) {
        Xea.a(xuVar);
        this.f4250b = xuVar;
        return this;
    }
}
