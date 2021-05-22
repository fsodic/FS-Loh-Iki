package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.px  reason: case insensitive filesystem */
public final class C1989px implements Sea<Set<C0523Mx<AbstractC0391Hv>>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1162dx f5292a;

    private C1989px(C1162dx dxVar) {
        this.f5292a = dxVar;
    }

    public static C1989px a(C1162dx dxVar) {
        return new C1989px(dxVar);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Set<C0523Mx<AbstractC0391Hv>> i = this.f5292a.i();
        Xea.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
