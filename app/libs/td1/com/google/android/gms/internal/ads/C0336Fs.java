package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fs  reason: case insensitive filesystem */
public final class C0336Fs implements Sea<AbstractC1793nH<AbstractC0951as>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f1999a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2000b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<KH> f2001c;
    private final _ea<C2484xJ> d;

    public C0336Fs(_ea<BT> _ea, _ea<VW> _ea2, _ea<KH> _ea3, _ea<C2484xJ> _ea4) {
        this.f1999a = _ea;
        this.f2000b = _ea2;
        this.f2001c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        BJ bj = new BJ(this.f1999a.get(), this.f2000b.get(), this.d.get(), this.f2001c.get());
        Xea.a(bj, "Cannot return null from a non-@Nullable @Provides method");
        return bj;
    }
}
