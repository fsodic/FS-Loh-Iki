package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.vE  reason: case insensitive filesystem */
public final class C2341vE implements Sea<C2203tE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1721mE> f5786a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Set<C2134sE>> f5787b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<d> f5788c;

    private C2341vE(_ea<C1721mE> _ea, _ea<Set<C2134sE>> _ea2, _ea<d> _ea3) {
        this.f5786a = _ea;
        this.f5787b = _ea2;
        this.f5788c = _ea3;
    }

    public static C2341vE a(_ea<C1721mE> _ea, _ea<Set<C2134sE>> _ea2, _ea<d> _ea3) {
        return new C2341vE(_ea, _ea2, _ea3);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2203tE(this.f5786a.get(), this.f5787b.get(), this.f5788c.get());
    }
}
