package com.google.android.gms.internal.ads;

public final class WB implements Sea<XB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f3389a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0525Mz> f3390b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0707Tz> f3391c;

    private WB(_ea<String> _ea, _ea<C0525Mz> _ea2, _ea<C0707Tz> _ea3) {
        this.f3389a = _ea;
        this.f3390b = _ea2;
        this.f3391c = _ea3;
    }

    public static WB a(_ea<String> _ea, _ea<C0525Mz> _ea2, _ea<C0707Tz> _ea3) {
        return new WB(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new XB(this.f3389a.get(), this.f3390b.get(), this.f3391c.get());
    }
}
