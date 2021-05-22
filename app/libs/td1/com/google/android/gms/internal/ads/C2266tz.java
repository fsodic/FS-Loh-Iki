package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C2537xu;

/* renamed from: com.google.android.gms.internal.ads.tz  reason: case insensitive filesystem */
public final class C2266tz implements Sea<AbstractC1021bt<AbstractC0951as>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f5682a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2537xu.a> f5683b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1162dx> f5684c;
    private final _ea<C1302fz> d;
    private final _ea<C0729Uv> e;

    public C2266tz(_ea<AbstractC0229Bp> _ea, _ea<C2537xu.a> _ea2, _ea<C1162dx> _ea3, _ea<C1302fz> _ea4, _ea<C0729Uv> _ea5) {
        this.f5682a = _ea;
        this.f5683b = _ea2;
        this.f5684c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC0206As h = this.f5682a.get().h();
        h.a(this.f5683b.get().a());
        h.e(this.f5684c.get());
        h.a(this.d.get());
        h.a(new TJ(null));
        h.a(new C0700Ts(this.e.get()));
        h.b(new C0881_r(null));
        AbstractC1021bt<AbstractC0951as> c2 = h.e().c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
