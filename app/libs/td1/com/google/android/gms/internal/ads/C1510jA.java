package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.jA  reason: case insensitive filesystem */
public final class C1510jA implements Sea<C2037qj> {

    /* renamed from: a  reason: collision with root package name */
    private final C1166eA f4629a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f4630b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f4631c;

    private C1510jA(C1166eA eAVar, _ea<Context> _ea, _ea<GR> _ea2) {
        this.f4629a = eAVar;
        this.f4630b = _ea;
        this.f4631c = _ea2;
    }

    public static C1510jA a(C1166eA eAVar, _ea<Context> _ea, _ea<GR> _ea2) {
        return new C1510jA(eAVar, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2037qj qjVar = new C2037qj(this.f4630b.get(), this.f4631c.get().f);
        Xea.a(qjVar, "Cannot return null from a non-@Nullable @Provides method");
        return qjVar;
    }
}
