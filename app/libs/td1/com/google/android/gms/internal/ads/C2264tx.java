package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.tx  reason: case insensitive filesystem */
public final class C2264tx implements Sea<Set<C0523Mx<AbstractC1835nla>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5678a;

    private C2264tx(C1162dx dxVar) {
        this.f5678a = dxVar;
    }

    public static C2264tx a(C1162dx dxVar) {
        return new C2264tx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
