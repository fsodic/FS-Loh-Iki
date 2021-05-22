package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Os  reason: case insensitive filesystem */
public final class C0570Os implements Sea<Runnable> {

    /* renamed from: a  reason: collision with root package name */
    private final C0492Ls f2794a;

    public C0570Os(C0492Ls ls) {
        this.f2794a = ls;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Runnable b2 = this.f2794a.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
