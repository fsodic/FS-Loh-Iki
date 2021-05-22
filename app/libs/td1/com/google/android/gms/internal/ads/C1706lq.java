package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lq  reason: case insensitive filesystem */
public final class C1706lq {

    /* renamed from: a  reason: collision with root package name */
    private C0203Ap f4909a;

    /* renamed from: b  reason: collision with root package name */
    private C2602yq f4910b;

    /* renamed from: c  reason: collision with root package name */
    private JT f4911c;
    private C0386Hq d;
    private XR e;

    private C1706lq() {
    }

    public final AbstractC0229Bp a() {
        Xea.a(this.f4909a, C0203Ap.class);
        Xea.a(this.f4910b, C2602yq.class);
        if (this.f4911c == null) {
            this.f4911c = new JT();
        }
        if (this.d == null) {
            this.d = new C0386Hq();
        }
        if (this.e == null) {
            this.e = new XR();
        }
        return new C0749Vp(this.f4909a, this.f4910b, this.f4911c, this.d, this.e);
    }

    public final C1706lq a(C0203Ap ap) {
        Xea.a(ap);
        this.f4909a = ap;
        return this;
    }

    public final C1706lq a(C2602yq yqVar) {
        Xea.a(yqVar);
        this.f4910b = yqVar;
        return this;
    }
}
