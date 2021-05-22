package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class CE implements Sea<Set<C0523Mx<AbstractC0520Mu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f1675a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f1676b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f1677c;

    private CE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f1675a = de;
        this.f1676b = _ea;
        this.f1677c = _ea2;
    }

    public static CE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new CE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0520Mu>> e = DE.e(this.f1676b.get(), this.f1677c.get());
        Xea.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
