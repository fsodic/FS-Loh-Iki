package com.google.android.gms.internal.ads;

final class GJ implements AbstractC2538xv {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2024a = false;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1423hm f2025b;

    GJ(BJ bj, C1423hm hmVar) {
        this.f2025b = hmVar;
    }

    private final void b(int i, String str) {
        int i2 = YR.f3560a;
        if (((Boolean) C2392voa.e().a(C2474x.td)).booleanValue()) {
            i2 = YR.f3562c;
        }
        this.f2025b.a(new C2068rH(i2, i, str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2538xv
    public final synchronized void a() {
        this.f2025b.b(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2538xv
    public final synchronized void a(int i, String str) {
        this.f2024a = true;
        b(i, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2538xv
    public final void c(int i) {
        if (!this.f2024a) {
            b(i, null);
        }
    }
}
