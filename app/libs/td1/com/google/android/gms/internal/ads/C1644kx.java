package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.kx  reason: case insensitive filesystem */
public final class C1644kx implements Sea<Set<C0523Mx<Ona>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4824a;

    private C1644kx(C1162dx dxVar) {
        this.f4824a = dxVar;
    }

    public static C1644kx a(C1162dx dxVar) {
        return new C1644kx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<Ona>> g = this.f4824a.g();
        Xea.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
