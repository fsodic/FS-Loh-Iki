package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kR  reason: case insensitive filesystem */
public final class C1596kR implements Sea<BinderC1527jR> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VQ> f4767a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2560yQ> f4768b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AR> f4769c;

    public C1596kR(_ea<VQ> _ea, _ea<C2560yQ> _ea2, _ea<AR> _ea3) {
        this.f4767a = _ea;
        this.f4768b = _ea2;
        this.f4769c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC1527jR(this.f4767a.get(), this.f4768b.get(), this.f4769c.get());
    }
}
