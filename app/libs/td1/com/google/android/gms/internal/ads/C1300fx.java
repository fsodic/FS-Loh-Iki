package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.fx  reason: case insensitive filesystem */
public final class C1300fx implements Sea<Set<C0523Mx<AbstractC0261Cv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4354a;

    private C1300fx(C1162dx dxVar) {
        this.f4354a = dxVar;
    }

    public static C1300fx a(C1162dx dxVar) {
        return new C1300fx(dxVar);
    }

    public static Set<C0523Mx<AbstractC0261Cv>> b(C1162dx dxVar) {
        Set<C0523Mx<AbstractC0261Cv>> emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f4354a);
    }
}
