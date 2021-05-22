package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ns  reason: case insensitive filesystem */
public final class C0544Ns implements Sea<AbstractC0631Rb> {

    /* renamed from: a  reason: collision with root package name */
    private final C0492Ls f2707a;

    public C0544Ns(C0492Ls ls) {
        this.f2707a = ls;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC0631Rb a2 = this.f2707a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
