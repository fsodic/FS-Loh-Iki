package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Tt  reason: case insensitive filesystem */
public final class C0701Tt implements Sea<C0882_s> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BR> f3213a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1941pR> f3214b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1367gv> f3215c;
    private final _ea<C2469wv> d;
    private final _ea<AbstractC2009qQ> e;
    private final _ea<BinderC0390Hu> f;
    private final _ea<C0955aw> g;

    private C0701Tt(_ea<BR> _ea, _ea<C1941pR> _ea2, _ea<C1367gv> _ea3, _ea<C2469wv> _ea4, _ea<AbstractC2009qQ> _ea5, _ea<BinderC0390Hu> _ea6, _ea<C0955aw> _ea7) {
        this.f3213a = _ea;
        this.f3214b = _ea2;
        this.f3215c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
    }

    public static C0701Tt a(_ea<BR> _ea, _ea<C1941pR> _ea2, _ea<C1367gv> _ea3, _ea<C2469wv> _ea4, _ea<AbstractC2009qQ> _ea5, _ea<BinderC0390Hu> _ea6, _ea<C0955aw> _ea7) {
        return new C0701Tt(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0882_s(this.f3213a.get(), this.f3214b.get(), this.f3215c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
