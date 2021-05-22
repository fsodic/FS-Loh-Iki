package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ww  reason: case insensitive filesystem */
public final class C0782Ww implements Sea<C0652Rw> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0860Zw>>> f3469a;

    private C0782Ww(_ea<Set<C0523Mx<AbstractC0860Zw>>> _ea) {
        this.f3469a = _ea;
    }

    public static C0782Ww a(_ea<Set<C0523Mx<AbstractC0860Zw>>> _ea) {
        return new C0782Ww(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0652Rw(this.f3469a.get());
    }
}
