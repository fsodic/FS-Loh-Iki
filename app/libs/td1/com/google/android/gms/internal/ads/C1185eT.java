package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eT  reason: case insensitive filesystem */
public final class C1185eT implements Sea<VW> {
    public static C1185eT a() {
        return C1117dT.a();
    }

    public static VW b() {
        VW vw = C0875_l.f3756b;
        Xea.a(vw, "Cannot return null from a non-@Nullable @Provides method");
        return vw;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
