package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yp  reason: case insensitive filesystem */
final class C0827Yp implements AbstractC1853nz {

    /* renamed from: a  reason: collision with root package name */
    private C1162dx f3598a;

    /* renamed from: b  reason: collision with root package name */
    private C2537xu f3599b;

    /* renamed from: c  reason: collision with root package name */
    private C1302fz f3600c;
    private BR d;
    private C2353vQ e;
    private ZP f;
    private final /* synthetic */ C0749Vp g;

    private C0827Yp(C0749Vp vp) {
        this.g = vp;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC1646kz> a(BR br) {
        this.d = br;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC1646kz> a(ZP zp) {
        this.f = zp;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC1646kz> a(C2353vQ vQVar) {
        this.e = vQVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1853nz
    public final /* synthetic */ AbstractC1853nz b(C1162dx dxVar) {
        Xea.a(dxVar);
        this.f3598a = dxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1853nz
    public final /* synthetic */ AbstractC1853nz b(C1302fz fzVar) {
        Xea.a(fzVar);
        this.f3600c = fzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1853nz
    public final /* synthetic */ AbstractC1853nz b(C2537xu xuVar) {
        Xea.a(xuVar);
        this.f3599b = xuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1853nz
    /* renamed from: c */
    public final AbstractC1646kz a() {
        Xea.a(this.f3598a, C1162dx.class);
        Xea.a(this.f3599b, C2537xu.class);
        Xea.a(this.f3600c, C1302fz.class);
        return new C0949aq(this.g, this.f3600c, new C0337Ft(), new ZR(), new C1710lu(), new DE(), this.f3598a, this.f3599b, new C1391hS(), this.d, this.e, this.f);
    }
}
