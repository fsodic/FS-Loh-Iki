package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.dS  reason: case insensitive filesystem */
public final class C1116dS implements Sea<C0909aS> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4078a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1556jk> f4079b;

    private C1116dS(_ea<Context> _ea, _ea<C1556jk> _ea2) {
        this.f4078a = _ea;
        this.f4079b = _ea2;
    }

    public static C1116dS a(_ea<Context> _ea, _ea<C1556jk> _ea2) {
        return new C1116dS(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0909aS(this.f4078a.get(), this.f4079b.get());
    }
}
