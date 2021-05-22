package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ay  reason: case insensitive filesystem */
public final class C0212Ay implements Sea<C2037qj> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f1576a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f1577b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f1578c;

    private C0212Ay(C2059qy qyVar, _ea<Context> _ea, _ea<GR> _ea2) {
        this.f1576a = qyVar;
        this.f1577b = _ea;
        this.f1578c = _ea2;
    }

    public static C0212Ay a(C2059qy qyVar, _ea<Context> _ea, _ea<GR> _ea2) {
        return new C0212Ay(qyVar, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2037qj qjVar = new C2037qj(this.f1577b.get(), this.f1578c.get().f);
        Xea.a(qjVar, "Cannot return null from a non-@Nullable @Provides method");
        return qjVar;
    }
}
