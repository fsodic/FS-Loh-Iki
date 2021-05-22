package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fp  reason: case insensitive filesystem */
public final class C0333Fp implements Sea<C1955pca> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f1990a;

    public C0333Fp(C0203Ap ap) {
        this.f1990a = ap;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1955pca e = this.f1990a.e();
        Xea.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
