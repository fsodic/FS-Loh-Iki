package com.google.android.gms.internal.ads;

public final class UB implements Sea<TB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0525Mz> f3224a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0707Tz> f3225b;

    private UB(_ea<C0525Mz> _ea, _ea<C0707Tz> _ea2) {
        this.f3224a = _ea;
        this.f3225b = _ea2;
    }

    public static UB a(_ea<C0525Mz> _ea, _ea<C0707Tz> _ea2) {
        return new UB(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new TB(this.f3224a.get(), this.f3225b.get());
    }
}
