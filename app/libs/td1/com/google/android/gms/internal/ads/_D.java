package com.google.android.gms.internal.ads;

import java.util.Map;

public final class _D implements Sea<ZD> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Dma> f3696a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Map<EnumC2563yT, C0895aE>> f3697b;

    private _D(_ea<Dma> _ea, _ea<Map<EnumC2563yT, C0895aE>> _ea2) {
        this.f3696a = _ea;
        this.f3697b = _ea2;
    }

    public static _D a(_ea<Dma> _ea, _ea<Map<EnumC2563yT, C0895aE>> _ea2) {
        return new _D(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new ZD(this.f3696a.get(), this.f3697b.get());
    }
}
