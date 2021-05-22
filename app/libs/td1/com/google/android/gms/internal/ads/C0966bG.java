package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.bG  reason: case insensitive filesystem */
public final class C0966bG implements Sea<C1035cG> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3879a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2243tj> f3880b;

    private C0966bG(_ea<Context> _ea, _ea<C2243tj> _ea2) {
        this.f3879a = _ea;
        this.f3880b = _ea2;
    }

    public static C0966bG a(_ea<Context> _ea, _ea<C2243tj> _ea2) {
        return new C0966bG(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1035cG(this.f3879a.get(), this.f3880b.get());
    }
}
