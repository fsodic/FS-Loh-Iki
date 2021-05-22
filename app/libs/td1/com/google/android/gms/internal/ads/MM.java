package com.google.android.gms.internal.ads;

import android.content.Context;

public final class MM implements Sea<IM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2576a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f2577b;

    private MM(_ea<Context> _ea, _ea<VW> _ea2) {
        this.f2576a = _ea;
        this.f2577b = _ea2;
    }

    public static IM a(Context context, VW vw) {
        return new IM(context, vw);
    }

    public static MM a(_ea<Context> _ea, _ea<VW> _ea2) {
        return new MM(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f2576a.get(), this.f2577b.get());
    }
}
