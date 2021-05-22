package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Nx  reason: case insensitive filesystem */
public final class C0549Nx implements Sea<C0419Ix> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0445Jx>>> f2712a;

    private C0549Nx(_ea<Set<C0523Mx<AbstractC0445Jx>>> _ea) {
        this.f2712a = _ea;
    }

    public static C0549Nx a(_ea<Set<C0523Mx<AbstractC0445Jx>>> _ea) {
        return new C0549Nx(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0419Ix(this.f2712a.get());
    }
}
