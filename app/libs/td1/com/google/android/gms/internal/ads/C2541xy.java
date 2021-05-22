package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xy  reason: case insensitive filesystem */
public final class C2541xy implements Sea<Set<C0523Mx<AbstractC0520Mu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C2059qy f6044a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0836Yy> f6045b;

    private C2541xy(C2059qy qyVar, _ea<C0836Yy> _ea) {
        this.f6044a = qyVar;
        this.f6045b = _ea;
    }

    public static C2541xy a(C2059qy qyVar, _ea<C0836Yy> _ea) {
        return new C2541xy(qyVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0520Mu>> a2 = this.f6044a.a(this.f6045b.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
