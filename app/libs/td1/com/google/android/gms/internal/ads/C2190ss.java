package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ss  reason: case insensitive filesystem */
public final class C2190ss implements Sea<C2037qj> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5560a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f5561b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f5562c;

    public C2190ss(C1433hs hsVar, _ea<Context> _ea, _ea<GR> _ea2) {
        this.f5560a = hsVar;
        this.f5561b = _ea;
        this.f5562c = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2037qj qjVar = new C2037qj(this.f5561b.get(), this.f5562c.get().f);
        Xea.a(qjVar, "Cannot return null from a non-@Nullable @Provides method");
        return qjVar;
    }
}
