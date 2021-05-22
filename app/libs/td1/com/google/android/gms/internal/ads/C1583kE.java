package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kE  reason: case insensitive filesystem */
public final class C1583kE implements Sea<C2134sE> {
    public static C1583kE a() {
        return C1514jE.a();
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2134sE sEVar = new C2134sE("ttc", EnumC2563yT.SIGNALS, EnumC2563yT.RENDERER);
        Xea.a(sEVar, "Cannot return null from a non-@Nullable @Provides method");
        return sEVar;
    }
}
