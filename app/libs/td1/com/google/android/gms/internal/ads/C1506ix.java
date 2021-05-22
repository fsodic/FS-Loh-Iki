package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ix  reason: case insensitive filesystem */
public final class C1506ix implements Sea<Set<C0523Mx<o>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f4626a;

    private C1506ix(C1162dx dxVar) {
        this.f4626a = dxVar;
    }

    public static C1506ix a(C1162dx dxVar) {
        return new C1506ix(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set emptySet = Collections.emptySet();
        Xea.a(emptySet, "Cannot return null from a non-@Nullable @Provides method");
        return emptySet;
    }
}
