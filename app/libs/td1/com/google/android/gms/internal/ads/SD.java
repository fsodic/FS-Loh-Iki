package com.google.android.gms.internal.ads;

public final class SD implements Sea<C0895aE> {
    public static SD a() {
        return VD.f3315a;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0895aE aEVar = new C0895aE(Fma.REQUEST_WILL_MAKE_NETWORK_REQUEST, Fma.REQUEST_DID_RECEIVE_NETWORK_RESPONSE, Fma.REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST);
        Xea.a(aEVar, "Cannot return null from a non-@Nullable @Provides method");
        return aEVar;
    }
}
