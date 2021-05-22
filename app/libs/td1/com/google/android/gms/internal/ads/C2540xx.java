package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.s;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xx  reason: case insensitive filesystem */
public final class C2540xx implements Sea<Set<C0523Mx<s.a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f6043a;

    private C2540xx(C1162dx dxVar) {
        this.f6043a = dxVar;
    }

    public static C2540xx a(C1162dx dxVar) {
        return new C2540xx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
