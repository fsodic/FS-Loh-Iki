package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Yu  reason: case insensitive filesystem */
public final class C0832Yu implements Sea<C0806Xu> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Set<C0523Mx<AbstractC0884_u>>> f3606a;

    private C0832Yu(_ea<Set<C0523Mx<AbstractC0884_u>>> _ea) {
        this.f3606a = _ea;
    }

    public static C0832Yu a(_ea<Set<C0523Mx<AbstractC0884_u>>> _ea) {
        return new C0832Yu(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0806Xu(this.f3606a.get());
    }
}
