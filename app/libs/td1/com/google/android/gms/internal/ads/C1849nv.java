package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nv  reason: case insensitive filesystem */
public final class C1849nv implements Sea<C1367gv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC1436hv>>> f5091a;

    private C1849nv(_ea<Set<C0523Mx<AbstractC1436hv>>> _ea) {
        this.f5091a = _ea;
    }

    public static C1849nv a(_ea<Set<C0523Mx<AbstractC1436hv>>> _ea) {
        return new C1849nv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1367gv(this.f5091a.get());
    }
}
