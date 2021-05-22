package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Kw  reason: case insensitive filesystem */
public final class C0470Kw implements Sea<C0444Jw> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0548Nw>>> f2446a;

    private C0470Kw(_ea<Set<C0523Mx<AbstractC0548Nw>>> _ea) {
        this.f2446a = _ea;
    }

    public static C0470Kw a(_ea<Set<C0523Mx<AbstractC0548Nw>>> _ea) {
        return new C0470Kw(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0444Jw(this.f2446a.get());
    }
}
