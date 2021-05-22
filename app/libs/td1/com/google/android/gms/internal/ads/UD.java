package com.google.android.gms.internal.ads;

public final class UD implements Sea<C0895aE> {
    public static UD a() {
        return XD.f3479a;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0895aE aEVar = new C0895aE(Fma.REQUEST_WILL_PROCESS_RESPONSE, Fma.REQUEST_DID_PROCESS_RESPONSE, Fma.REQUEST_FAILED_TO_PROCESS_RESPONSE);
        Xea.a(aEVar, "Cannot return null from a non-@Nullable @Provides method");
        return aEVar;
    }
}
