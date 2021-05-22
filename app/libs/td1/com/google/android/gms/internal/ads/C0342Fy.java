package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Fy  reason: case insensitive filesystem */
public final class C0342Fy implements Sea<Set<C0523Mx<AbstractC0445Jx>>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C0888_y> f2004a;

    private C0342Fy(_ea<C0888_y> _ea) {
        this.f2004a = _ea;
    }

    public static C0342Fy a(_ea<C0888_y> _ea) {
        return new C0342Fy(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set singleton = Collections.singleton(C0523Mx.a(this.f2004a.get(), C0875_l.f));
        Xea.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
