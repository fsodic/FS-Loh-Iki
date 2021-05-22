package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hq  reason: case insensitive filesystem */
final class C1431hq implements AbstractC0206As {

    /* renamed from: a  reason: collision with root package name */
    private C1162dx f4517a;

    /* renamed from: b  reason: collision with root package name */
    private C2537xu f4518b;

    /* renamed from: c  reason: collision with root package name */
    private TJ f4519c;
    private C0700Ts d;
    private C0881_r e;
    private C1302fz f;
    private BR g;
    private C2353vQ h;
    private ZP i;
    private final /* synthetic */ C0749Vp j;

    private C1431hq(C0749Vp vp) {
        this.j = vp;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    public final /* synthetic */ AbstractC0206As a(TJ tj) {
        Xea.a(tj);
        this.f4519c = tj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    public final /* synthetic */ AbstractC0206As a(C0700Ts ts) {
        Xea.a(ts);
        this.d = ts;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    public final /* synthetic */ AbstractC0206As a(C1302fz fzVar) {
        Xea.a(fzVar);
        this.f = fzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    public final /* synthetic */ AbstractC0206As a(C2537xu xuVar) {
        Xea.a(xuVar);
        this.f4518b = xuVar;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC2466ws> a(BR br) {
        this.g = br;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC2466ws> a(ZP zp) {
        this.i = zp;
        return this;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.uu' to match base method */
    @Override // com.google.android.gms.internal.ads.AbstractC2330uu
    public final /* synthetic */ AbstractC2330uu<AbstractC2466ws> a(C2353vQ vQVar) {
        this.h = vQVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    public final /* synthetic */ AbstractC0206As b(C0881_r _rVar) {
        Xea.a(_rVar);
        this.e = _rVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    public final /* synthetic */ AbstractC0206As e(C1162dx dxVar) {
        Xea.a(dxVar);
        this.f4517a = dxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0206As
    /* renamed from: e */
    public final AbstractC2466ws a() {
        Xea.a(this.f4517a, C1162dx.class);
        Xea.a(this.f4518b, C2537xu.class);
        Xea.a(this.f4519c, TJ.class);
        Xea.a(this.d, C0700Ts.class);
        Xea.a(this.e, C0881_r.class);
        Xea.a(this.f, C1302fz.class);
        return new C1637kq(this.j, this.e, this.f, new C0337Ft(), new ZR(), new C1710lu(), new DE(), this.f4517a, this.f4518b, new C1391hS(), this.f4519c, this.d, this.g, this.h, this.i);
    }
}
