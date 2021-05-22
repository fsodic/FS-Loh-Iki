package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.a.a;
import java.util.Set;
import java.util.concurrent.Executor;

public final class JE implements Sea<Set<C0523Mx<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final DE f2301a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<NE> f2302b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f2303c;

    private JE(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        this.f2301a = de;
        this.f2302b = _ea;
        this.f2303c = _ea2;
    }

    public static JE a(DE de, _ea<NE> _ea, _ea<Executor> _ea2) {
        return new JE(de, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<a>> b2 = DE.b(this.f2302b.get(), this.f2303c.get());
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
