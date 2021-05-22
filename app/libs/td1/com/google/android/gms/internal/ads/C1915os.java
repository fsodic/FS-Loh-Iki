package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.os  reason: case insensitive filesystem */
public final class C1915os implements Sea<Set<C0523Mx<AbstractC0261Cv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5184a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0648Rs> f5185b;

    public C1915os(C1433hs hsVar, _ea<C0648Rs> _ea) {
        this.f5184a = hsVar;
        this.f5185b = _ea;
    }

    public static Set<C0523Mx<AbstractC0261Cv>> a(C1433hs hsVar, C0648Rs rs) {
        Set<C0523Mx<AbstractC0261Cv>> singleton = Collections.singleton(new C0523Mx(rs, C0875_l.f));
        Xea.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5184a, this.f5185b.get());
    }
}
