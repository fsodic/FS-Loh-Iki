package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hx  reason: case insensitive filesystem */
public final class C1438hx implements Sea<Set<C0523Mx<AbstractC0366Gw>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4532a;

    private C1438hx(C1162dx dxVar) {
        this.f4532a = dxVar;
    }

    public static C1438hx a(C1162dx dxVar) {
        return new C1438hx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
