package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aT  reason: case insensitive filesystem */
public final class C0910aT implements Sea<VW> {
    public static C0910aT a() {
        return _S.a();
    }

    public static VW b() {
        VW vw = C0875_l.f3755a;
        Xea.a(vw, "Cannot return null from a non-@Nullable @Provides method");
        return vw;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b();
    }
}
