package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ws  reason: case insensitive filesystem */
public final class C0778Ws implements Sea<C0729Uv> {

    /* renamed from: a  reason: collision with root package name */
    private final C0700Ts f3465a;

    public C0778Ws(C0700Ts ts) {
        this.f3465a = ts;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0729Uv a2 = this.f3465a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
