package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cz  reason: case insensitive filesystem */
public final class C0265Cz implements Sea<C1306gC> {

    /* renamed from: a  reason: collision with root package name */
    private final C2680zz f1747a;

    public C0265Cz(C2680zz zzVar) {
        this.f1747a = zzVar;
    }

    public static C1306gC a(C2680zz zzVar) {
        C1306gC b2 = zzVar.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f1747a);
    }
}
