package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Hp  reason: case insensitive filesystem */
public final class C0385Hp implements Sea<AbstractC1862oH<SR, YH>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2179a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1789nD> f2180b;

    public C0385Hp(C0203Ap ap, _ea<C1789nD> _ea) {
        this.f2179a = ap;
        this.f2180b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1382hJ hJVar = new C1382hJ(this.f2180b.get());
        Xea.a(hJVar, "Cannot return null from a non-@Nullable @Provides method");
        return hJVar;
    }
}
