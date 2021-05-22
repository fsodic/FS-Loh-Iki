package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oq  reason: case insensitive filesystem */
final class C1913oq implements AbstractC0602Py {

    /* renamed from: a  reason: collision with root package name */
    private C1162dx f5180a;

    /* renamed from: b  reason: collision with root package name */
    private C2537xu f5181b;

    /* renamed from: c  reason: collision with root package name */
    private TJ f5182c;
    private BR d;
    private C2353vQ e;
    private ZP f;
    private final /* synthetic */ C0749Vp g;

    private C1913oq(C0749Vp vp) {
        this.g = vp;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC0524My> a(BR br) {
        this.d = br;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC0524My> a(ZP zp) {
        this.f = zp;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC0524My> a(C2353vQ vQVar) {
        this.e = vQVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0602Py
    public final /* synthetic */ AbstractC0602Py b(TJ tj) {
        Xea.a(tj);
        this.f5182c = tj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0602Py
    public final /* synthetic */ AbstractC0602Py d(C1162dx dxVar) {
        Xea.a(dxVar);
        this.f5180a = dxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0602Py
    public final /* synthetic */ AbstractC0602Py e(C2537xu xuVar) {
        Xea.a(xuVar);
        this.f5181b = xuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0602Py
    /* renamed from: f */
    public final AbstractC0524My a() {
        Xea.a(this.f5180a, C1162dx.class);
        Xea.a(this.f5181b, C2537xu.class);
        Xea.a(this.f5182c, TJ.class);
        return new C1844nq(this.g, new C0337Ft(), new ZR(), new C1710lu(), new DE(), this.f5180a, this.f5181b, new C1391hS(), this.f5182c, this.d, this.e, this.f);
    }
}
