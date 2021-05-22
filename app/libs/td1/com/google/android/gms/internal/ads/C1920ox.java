package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ox  reason: case insensitive filesystem */
public final class C1920ox implements Sea<Set<C0523Mx<AbstractC0520Mu>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5193a;

    private C1920ox(C1162dx dxVar) {
        this.f5193a = dxVar;
    }

    public static C1920ox a(C1162dx dxVar) {
        return new C1920ox(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0520Mu>> a2 = this.f5193a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
