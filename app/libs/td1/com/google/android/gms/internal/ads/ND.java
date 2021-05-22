package com.google.android.gms.internal.ads;

public final class ND implements Sea<C0895aE> {
    public static ND a() {
        return QD.f2908a;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0895aE aEVar = new C0895aE(Fma.REQUEST_WILL_BUILD_URL, Fma.REQUEST_DID_BUILD_URL, Fma.REQUEST_FAILED_TO_BUILD_URL);
        Xea.a(aEVar, "Cannot return null from a non-@Nullable @Provides method");
        return aEVar;
    }
}
