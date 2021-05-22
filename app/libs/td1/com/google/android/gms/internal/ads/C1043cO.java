package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.cO  reason: case insensitive filesystem */
public final class C1043cO implements Sea<VN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f3988a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f3989b;

    private C1043cO(_ea<VW> _ea, _ea<Context> _ea2) {
        this.f3988a = _ea;
        this.f3989b = _ea2;
    }

    public static VN a(VW vw, Context context) {
        return new VN(vw, context);
    }

    public static C1043cO a(_ea<VW> _ea, _ea<Context> _ea2) {
        return new C1043cO(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f3988a.get(), this.f3989b.get());
    }
}
