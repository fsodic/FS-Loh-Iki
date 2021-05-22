package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xN  reason: case insensitive filesystem */
public final class C2488xN implements Sea<C2350vN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f5976a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Bundle> f5977b;

    private C2488xN(_ea<VW> _ea, _ea<Bundle> _ea2) {
        this.f5976a = _ea;
        this.f5977b = _ea2;
    }

    public static C2488xN a(_ea<VW> _ea, _ea<Bundle> _ea2) {
        return new C2488xN(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2350vN(this.f5976a.get(), this.f5977b.get());
    }
}
