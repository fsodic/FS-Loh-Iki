package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.iS  reason: case insensitive filesystem */
public final class C1460iS implements Sea<C1047cS> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4566a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f4567b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C0847Zj> f4568c;

    public C1460iS(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<C0847Zj> _ea3) {
        this.f4566a = _ea;
        this.f4567b = _ea2;
        this.f4568c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1047cS(this.f4566a.get(), this.f4567b.get(), this.f4568c.get());
    }
}
