package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Ey  reason: case insensitive filesystem */
public final class C0316Ey implements Sea<C0523Mx<AbstractC0366Gw>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f1922a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f1923b;

    private C0316Ey(C2059qy qyVar, _ea<Executor> _ea) {
        this.f1922a = qyVar;
        this.f1923b = _ea;
    }

    public static C0316Ey a(C2059qy qyVar, _ea<Executor> _ea) {
        return new C0316Ey(qyVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0523Mx<AbstractC0366Gw> a2 = this.f1922a.a(this.f1923b.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
