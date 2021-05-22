package com.google.android.gms.internal.ads;

public final class ED implements Sea<C0895aE> {
    public static ED a() {
        return DD.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0895aE aEVar = new C0895aE(Fma.REQUEST_WILL_UPDATE_SIGNALS, Fma.REQUEST_DID_UPDATE_SIGNALS, Fma.REQUEST_FAILED_TO_UPDATE_SIGNALS);
        Xea.a(aEVar, "Cannot return null from a non-@Nullable @Provides method");
        return aEVar;
    }
}
