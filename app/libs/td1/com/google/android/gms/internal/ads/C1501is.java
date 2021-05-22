package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.is  reason: case insensitive filesystem */
public final class C1501is implements Sea<C2469wv> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f4618a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0261Cv>>> f4619b;

    public C1501is(C1433hs hsVar, _ea<Set<C0523Mx<AbstractC0261Cv>>> _ea) {
        this.f4618a = hsVar;
        this.f4619b = _ea;
    }

    public static C2469wv a(C1433hs hsVar, Set<C0523Mx<AbstractC0261Cv>> set) {
        C2469wv a2 = hsVar.a(set);
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4618a, this.f4619b.get());
    }
}
