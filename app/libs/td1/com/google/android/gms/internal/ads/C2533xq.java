package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xq  reason: case insensitive filesystem */
final class C2533xq implements UK {

    /* renamed from: a  reason: collision with root package name */
    private C2537xu f6030a;

    /* renamed from: b  reason: collision with root package name */
    private C1590kL f6031b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C0749Vp f6032c;

    private C2533xq(C0749Vp vp) {
        this.f6032c = vp;
    }

    @Override // com.google.android.gms.internal.ads.UK
    @Deprecated
    public final /* synthetic */ UK a(C1162dx dxVar) {
        Xea.a(dxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.UK
    public final /* synthetic */ UK a(C1590kL kLVar) {
        Xea.a(kLVar);
        this.f6031b = kLVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.UK
    public final /* synthetic */ UK a(C2537xu xuVar) {
        Xea.a(xuVar);
        this.f6030a = xuVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.UK
    public final VK a() {
        Xea.a(this.f6030a, C2537xu.class);
        Xea.a(this.f6031b, C1590kL.class);
        return new C2395vq(this.f6032c, this.f6031b, new C0337Ft(), new DE(), this.f6030a, new C1391hS());
    }
}
