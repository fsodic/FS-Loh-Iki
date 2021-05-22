package com.google.android.gms.internal.ads;

public final class SL implements Sea<QL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f3074a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f3075b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1789nD> f3076c;

    private SL(_ea<String> _ea, _ea<VW> _ea2, _ea<C1789nD> _ea3) {
        this.f3074a = _ea;
        this.f3075b = _ea2;
        this.f3076c = _ea3;
    }

    public static SL a(_ea<String> _ea, _ea<VW> _ea2, _ea<C1789nD> _ea3) {
        return new SL(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new QL(this.f3074a.get(), this.f3075b.get(), this.f3076c.get());
    }
}
