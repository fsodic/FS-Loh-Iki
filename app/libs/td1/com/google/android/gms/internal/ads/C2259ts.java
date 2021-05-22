package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ts  reason: case insensitive filesystem */
public final class C2259ts implements Sea<Set<C0523Mx<AbstractC1835nla>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5669a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0648Rs> f5670b;

    public C2259ts(C1433hs hsVar, _ea<C0648Rs> _ea) {
        this.f5669a = hsVar;
        this.f5670b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new C0523Mx(this.f5670b.get(), C0875_l.f));
        Xea.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
