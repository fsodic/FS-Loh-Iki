package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

/* renamed from: com.google.android.gms.internal.ads.yA  reason: case insensitive filesystem */
public final class C2544yA implements Sea<View$OnClickListenerC2406wA> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1306gC> f6047a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<d> f6048b;

    public C2544yA(_ea<C1306gC> _ea, _ea<d> _ea2) {
        this.f6047a = _ea;
        this.f6048b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new View$OnClickListenerC2406wA(this.f6047a.get(), this.f6048b.get());
    }
}
