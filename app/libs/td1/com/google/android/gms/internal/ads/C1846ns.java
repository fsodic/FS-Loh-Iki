package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ns  reason: case insensitive filesystem */
public final class C1846ns implements Sea<AbstractC0804Xs> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5085a;

    public C1846ns(C1433hs hsVar) {
        this.f5085a = hsVar;
    }

    public static AbstractC0804Xs a(C1433hs hsVar) {
        AbstractC0804Xs c2 = hsVar.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5085a);
    }
}
