package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rq  reason: case insensitive filesystem */
final class C2119rq implements FC {

    /* renamed from: a  reason: collision with root package name */
    private C1162dx f5461a;

    /* renamed from: b  reason: collision with root package name */
    private C2537xu f5462b;

    /* renamed from: c  reason: collision with root package name */
    private BR f5463c;
    private C2353vQ d;
    private ZP e;
    private final /* synthetic */ C0749Vp f;

    private C2119rq(C0749Vp vp) {
        this.f = vp;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<CC> a(BR br) {
        this.f5463c = br;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<CC> a(ZP zp) {
        this.e = zp;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<CC> a(C2353vQ vQVar) {
        this.d = vQVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final /* synthetic */ FC c(C1162dx dxVar) {
        Xea.a(dxVar);
        this.f5461a = dxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.FC
    /* renamed from: d */
    public final CC a() {
        Xea.a(this.f5461a, C1162dx.class);
        Xea.a(this.f5462b, C2537xu.class);
        return new C2326uq(this.f, new C0337Ft(), new ZR(), new C1710lu(), new DE(), this.f5461a, this.f5462b, new C1391hS(), this.f5463c, this.d, this.e);
    }

    @Override // com.google.android.gms.internal.ads.FC
    public final /* synthetic */ FC d(C2537xu xuVar) {
        Xea.a(xuVar);
        this.f5462b = xuVar;
        return this;
    }
}
