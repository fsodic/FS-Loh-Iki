package com.google.android.gms.internal.ads;

public final class ZS implements Sea<VW> {
    public static ZS a() {
        return YS.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        VW vw;
        if (((Boolean) C2392voa.e().a(C2474x.Dd)).booleanValue()) {
            vw = C0875_l.f3757c;
        } else {
            vw = ((Boolean) C2392voa.e().a(C2474x.Cd)).booleanValue() ? C0875_l.f3755a : C0875_l.e;
        }
        Xea.a(vw, "Cannot return null from a non-@Nullable @Provides method");
        return vw;
    }
}
