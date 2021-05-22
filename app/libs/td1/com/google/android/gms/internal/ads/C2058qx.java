package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.g.a;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.qx  reason: case insensitive filesystem */
public final class C2058qx implements Sea<Set<C0523Mx<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5380a;

    private C2058qx(C1162dx dxVar) {
        this.f5380a = dxVar;
    }

    public static C2058qx a(C1162dx dxVar) {
        return new C2058qx(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<a>> e = this.f5380a.e();
        Xea.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
