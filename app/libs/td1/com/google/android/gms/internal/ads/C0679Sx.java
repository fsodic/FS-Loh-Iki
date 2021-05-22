package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Sx  reason: case insensitive filesystem */
public final class C0679Sx implements Sea<C0627Qx> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0757Vx>>> f3141a;

    private C0679Sx(_ea<Set<C0523Mx<AbstractC0757Vx>>> _ea) {
        this.f3141a = _ea;
    }

    public static C0679Sx a(_ea<Set<C0523Mx<AbstractC0757Vx>>> _ea) {
        return new C0679Sx(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0627Qx(this.f3141a.get());
    }
}
