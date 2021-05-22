package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Hw  reason: case insensitive filesystem */
public final class C0392Hw implements Sea<C0340Fw> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0366Gw>>> f2188a;

    private C0392Hw(_ea<Set<C0523Mx<AbstractC0366Gw>>> _ea) {
        this.f2188a = _ea;
    }

    public static C0392Hw a(_ea<Set<C0523Mx<AbstractC0366Gw>>> _ea) {
        return new C0392Hw(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0340Fw(this.f2188a.get());
    }
}
