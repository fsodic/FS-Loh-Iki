package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.mx  reason: case insensitive filesystem */
public final class C1782mx implements Sea<Set<C0523Mx<AbstractC0884_u>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5013a;

    private C1782mx(C1162dx dxVar) {
        this.f5013a = dxVar;
    }

    public static C1782mx a(C1162dx dxVar) {
        return new C1782mx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0884_u>> d = this.f5013a.d();
        Xea.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
