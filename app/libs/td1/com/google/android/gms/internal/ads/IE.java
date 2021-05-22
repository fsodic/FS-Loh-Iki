package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class IE implements Sea<Set<C0523Mx<Ona>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f2197a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f2198b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f2199c;

    private IE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f2197a = de;
        this.f2198b = _ea;
        this.f2199c = _ea2;
    }

    public static IE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new IE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<Ona>> g = DE.g(this.f2198b.get(), this.f2199c.get());
        Xea.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
