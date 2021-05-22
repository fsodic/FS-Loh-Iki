package com.google.android.gms.internal.ads;

import java.util.Set;

public final class KT implements Sea<AT> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<IT>>> f2399a;

    private KT(_ea<Set<C0523Mx<IT>>> _ea) {
        this.f2399a = _ea;
    }

    public static KT a(_ea<Set<C0523Mx<IT>>> _ea) {
        return new KT(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new AT(this.f2399a.get());
    }
}
