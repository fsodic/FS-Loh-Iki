package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cs  reason: case insensitive filesystem */
public final class C0258Cs implements Sea<AbstractC1793nH<AbstractC0951as>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Boolean> f1737a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<II> f1738b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<BJ<AbstractC0951as, SR, ZH>> f1739c;

    public C0258Cs(_ea<Boolean> _ea, _ea<II> _ea2, _ea<BJ<AbstractC0951as, SR, ZH>> _ea3) {
        this.f1737a = _ea;
        this.f1738b = _ea2;
        this.f1739c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        boolean booleanValue = this.f1737a.get().booleanValue();
        II ii = this.f1738b.get();
        BJ<AbstractC0951as, SR, ZH> bj = this.f1739c.get();
        if (!booleanValue) {
            ii = bj;
        }
        Xea.a(ii, "Cannot return null from a non-@Nullable @Provides method");
        return ii;
    }
}
