package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.lx  reason: case insensitive filesystem */
public final class C1713lx implements Sea<Set<C0523Mx<AbstractC1229ev>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4917a;

    private C1713lx(C1162dx dxVar) {
        this.f4917a = dxVar;
    }

    public static C1713lx a(C1162dx dxVar) {
        return new C1713lx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC1229ev>> h = this.f4917a.h();
        Xea.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }
}
