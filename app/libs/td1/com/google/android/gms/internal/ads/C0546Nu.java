package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Nu  reason: case insensitive filesystem */
public final class C0546Nu implements Sea<C0494Lu> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<Ona>>> f2710a;

    private C0546Nu(_ea<Set<C0523Mx<Ona>>> _ea) {
        this.f2710a = _ea;
    }

    public static C0546Nu a(_ea<Set<C0523Mx<Ona>>> _ea) {
        return new C0546Nu(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0494Lu(this.f2710a.get());
    }
}
