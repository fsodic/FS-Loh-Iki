package com.google.android.gms.internal.ads;

public final class VG implements Sea<TG> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<RG> f3320a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f3321b;

    private VG(_ea<RG> _ea, _ea<VW> _ea2) {
        this.f3320a = _ea;
        this.f3321b = _ea2;
    }

    public static VG a(_ea<RG> _ea, _ea<VW> _ea2) {
        return new VG(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new TG(this.f3320a.get(), this.f3321b.get());
    }
}
