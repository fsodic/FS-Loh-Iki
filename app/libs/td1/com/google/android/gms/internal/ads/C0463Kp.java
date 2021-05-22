package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Kp  reason: case insensitive filesystem */
public final class C0463Kp implements Sea<AbstractC0854Zq> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2436a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f2437b;

    public C0463Kp(C0203Ap ap, _ea<AbstractC0229Bp> _ea) {
        this.f2436a = ap;
        this.f2437b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC0229Bp bp = this.f2437b.get();
        Xea.a(bp, "Cannot return null from a non-@Nullable @Provides method");
        return bp;
    }
}
