package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wx  reason: case insensitive filesystem */
public final class C2471wx implements Sea<Set<C0523Mx<AbstractC0757Vx>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5938a;

    private C2471wx(C1162dx dxVar) {
        this.f5938a = dxVar;
    }

    public static C2471wx a(C1162dx dxVar) {
        return new C2471wx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
