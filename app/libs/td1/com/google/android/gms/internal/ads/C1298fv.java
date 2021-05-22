package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fv  reason: case insensitive filesystem */
public final class C1298fv implements Sea<C1160dv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC1229ev>>> f4352a;

    private C1298fv(_ea<Set<C0523Mx<AbstractC1229ev>>> _ea) {
        this.f4352a = _ea;
    }

    public static C1298fv a(_ea<Set<C0523Mx<AbstractC1229ev>>> _ea) {
        return new C1298fv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1160dv(this.f4352a.get());
    }
}
