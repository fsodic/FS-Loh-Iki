package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Jp  reason: case insensitive filesystem */
public final class C0437Jp implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2357a;

    public C0437Jp(C0203Ap ap) {
        this.f2357a = ap;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        String f = C2392voa.f();
        Xea.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
