package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Mr  reason: case insensitive filesystem */
public final class C0517Mr implements Sea<Set<C0523Mx<AbstractC1835nla>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C0491Lr f2623a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0648Rs> f2624b;

    public C0517Mr(C0491Lr lr, _ea<C0648Rs> _ea) {
        this.f2623a = lr;
        this.f2624b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(new C0523Mx(this.f2624b.get(), C0875_l.f));
        Xea.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
