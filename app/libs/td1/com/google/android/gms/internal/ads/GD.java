package com.google.android.gms.internal.ads;

public final class GD implements Sea<C0895aE> {
    public static GD a() {
        return FD.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0895aE aEVar = new C0895aE(Fma.REQUEST_WILL_RENDER, Fma.REQUEST_DID_RENDER, Fma.REQUEST_FAILED_TO_RENDER);
        Xea.a(aEVar, "Cannot return null from a non-@Nullable @Provides method");
        return aEVar;
    }
}
