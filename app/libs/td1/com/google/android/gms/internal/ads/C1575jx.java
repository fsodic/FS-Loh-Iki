package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jx  reason: case insensitive filesystem */
public final class C1575jx implements Sea<Set<C0523Mx<AbstractC0650Ru>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4740a;

    private C1575jx(C1162dx dxVar) {
        this.f4740a = dxVar;
    }

    public static C1575jx a(C1162dx dxVar) {
        return new C1575jx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0650Ru>> c2 = this.f4740a.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
