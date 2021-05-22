package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Lp  reason: case insensitive filesystem */
public final class C0489Lp implements Sea<C0823Yl> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2540a;

    public C0489Lp(C0203Ap ap) {
        this.f2540a = ap;
    }

    public static C0823Yl a(C0203Ap ap) {
        C0823Yl c2 = ap.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f2540a);
    }
}
