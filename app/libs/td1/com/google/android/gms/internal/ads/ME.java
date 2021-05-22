package com.google.android.gms.internal.ads;

public final class ME implements Sea<NE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BE> f2564a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<AbstractC0229Bp> f2565b;

    private ME(_ea<BE> _ea, _ea<AbstractC0229Bp> _ea2) {
        this.f2564a = _ea;
        this.f2565b = _ea2;
    }

    public static ME a(_ea<BE> _ea, _ea<AbstractC0229Bp> _ea2) {
        return new ME(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new NE(this.f2564a.get(), this.f2565b.get());
    }
}
