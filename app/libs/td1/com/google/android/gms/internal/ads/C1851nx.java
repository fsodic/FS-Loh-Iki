package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.nx  reason: case insensitive filesystem */
public final class C1851nx implements Sea<Set<C0523Mx<AbstractC0261Cv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5093a;

    private C1851nx(C1162dx dxVar) {
        this.f5093a = dxVar;
    }

    public static C1851nx a(C1162dx dxVar) {
        return new C1851nx(dxVar);
    }

    public static Set<C0523Mx<AbstractC0261Cv>> b(C1162dx dxVar) {
        Set<C0523Mx<AbstractC0261Cv>> b2 = dxVar.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f5093a);
    }
}
