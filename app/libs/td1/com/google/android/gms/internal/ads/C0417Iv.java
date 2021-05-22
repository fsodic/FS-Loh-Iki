package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Iv  reason: case insensitive filesystem */
public final class C0417Iv implements Sea<C0365Gv> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0391Hv>>> f2289a;

    private C0417Iv(_ea<Set<C0523Mx<AbstractC0391Hv>>> _ea) {
        this.f2289a = _ea;
    }

    public static C0417Iv a(_ea<Set<C0523Mx<AbstractC0391Hv>>> _ea) {
        return new C0417Iv(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0365Gv(this.f2289a.get());
    }
}
