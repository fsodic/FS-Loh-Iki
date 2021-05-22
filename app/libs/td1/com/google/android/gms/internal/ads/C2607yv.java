package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.yv  reason: case insensitive filesystem */
public final class C2607yv implements Sea<C2469wv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0261Cv>>> f6146a;

    private C2607yv(_ea<Set<C0523Mx<AbstractC0261Cv>>> _ea) {
        this.f6146a = _ea;
    }

    public static C2607yv a(_ea<Set<C0523Mx<AbstractC0261Cv>>> _ea) {
        return new C2607yv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2469wv(this.f6146a.get());
    }
}
