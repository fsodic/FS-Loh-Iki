package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ks  reason: case insensitive filesystem */
public final class C1639ks implements Sea<C1872oR> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f4817a;

    public C1639ks(C1433hs hsVar) {
        this.f4817a = hsVar;
    }

    public static C1872oR a(C1433hs hsVar) {
        C1872oR d = hsVar.d();
        Xea.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4817a);
    }
}
