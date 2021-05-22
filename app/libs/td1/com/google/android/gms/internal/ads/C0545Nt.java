package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

/* renamed from: com.google.android.gms.internal.ads.Nt  reason: case insensitive filesystem */
public final class C0545Nt implements Sea<C0467Kt> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<d> f2708a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0821Yj> f2709b;

    private C0545Nt(_ea<d> _ea, _ea<C0821Yj> _ea2) {
        this.f2708a = _ea;
        this.f2709b = _ea2;
    }

    public static C0545Nt a(_ea<d> _ea, _ea<C0821Yj> _ea2) {
        return new C0545Nt(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0467Kt(this.f2708a.get(), this.f2709b.get());
    }
}
