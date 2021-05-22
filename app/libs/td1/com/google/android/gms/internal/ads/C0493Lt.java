package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

/* renamed from: com.google.android.gms.internal.ads.Lt  reason: case insensitive filesystem */
public final class C0493Lt implements Sea<C0821Yj> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<d> f2548a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1556jk> f2549b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f2550c;

    private C0493Lt(_ea<d> _ea, _ea<C1556jk> _ea2, _ea<GR> _ea3) {
        this.f2548a = _ea;
        this.f2549b = _ea2;
        this.f2550c = _ea3;
    }

    public static C0493Lt a(_ea<d> _ea, _ea<C1556jk> _ea2, _ea<GR> _ea3) {
        return new C0493Lt(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0821Yj a2 = this.f2549b.get().a(this.f2548a.get(), this.f2550c.get().f);
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
