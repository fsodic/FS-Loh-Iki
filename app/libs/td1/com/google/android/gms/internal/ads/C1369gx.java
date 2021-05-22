package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.gx  reason: case insensitive filesystem */
public final class C1369gx implements Sea<Set<C0523Mx<AbstractC1436hv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4443a;

    private C1369gx(C1162dx dxVar) {
        this.f4443a = dxVar;
    }

    public static C1369gx a(C1162dx dxVar) {
        return new C1369gx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
