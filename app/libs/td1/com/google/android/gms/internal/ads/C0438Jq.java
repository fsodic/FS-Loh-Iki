package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Jq  reason: case insensitive filesystem */
public final class C0438Jq implements Sea<C1489il> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2361a;

    public C0438Jq(_ea<Context> _ea) {
        this.f2361a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1489il ilVar = new C1489il(this.f2361a.get());
        Xea.a(ilVar, "Cannot return null from a non-@Nullable @Provides method");
        return ilVar;
    }
}
