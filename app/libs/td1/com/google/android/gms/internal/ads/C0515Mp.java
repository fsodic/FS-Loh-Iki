package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Mp  reason: case insensitive filesystem */
public final class C0515Mp implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C0203Ap f2621a;

    public C0515Mp(C0203Ap ap) {
        this.f2621a = ap;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        String d = this.f2621a.d();
        Xea.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
