package com.google.android.gms.internal.ads;

public final class YB implements Sea<ZB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<String> f3533a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0525Mz> f3534b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0707Tz> f3535c;

    private YB(_ea<String> _ea, _ea<C0525Mz> _ea2, _ea<C0707Tz> _ea3) {
        this.f3533a = _ea;
        this.f3534b = _ea2;
        this.f3535c = _ea3;
    }

    public static YB a(_ea<String> _ea, _ea<C0525Mz> _ea2, _ea<C0707Tz> _ea3) {
        return new YB(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new ZB(this.f3533a.get(), this.f3534b.get(), this.f3535c.get());
    }
}
