package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.sx  reason: case insensitive filesystem */
public final class C2195sx implements Sea<Set<C0523Mx<AbstractC0651Rv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5569a;

    private C2195sx(C1162dx dxVar) {
        this.f5569a = dxVar;
    }

    public static C2195sx a(C1162dx dxVar) {
        return new C2195sx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0651Rv>> j = this.f5569a.j();
        Xea.a(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }
}
