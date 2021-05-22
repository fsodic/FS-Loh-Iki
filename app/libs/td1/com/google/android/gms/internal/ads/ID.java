package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public final class ID implements Sea<Set<C0523Mx<IT>>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f2195a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ZD> f2196b;

    private ID(_ea<Executor> _ea, _ea<ZD> _ea2) {
        this.f2195a = _ea;
        this.f2196b = _ea2;
    }

    public static ID a(_ea<Executor> _ea, _ea<ZD> _ea2) {
        return new ID(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Executor executor = this.f2195a.get();
        Set singleton = ((Boolean) C2392voa.e().a(C2474x.Wc)).booleanValue() ? Collections.singleton(new C0523Mx(this.f2196b.get(), executor)) : Collections.emptySet();
        Xea.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }
}
