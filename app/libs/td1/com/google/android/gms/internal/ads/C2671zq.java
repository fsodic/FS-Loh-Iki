package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.zq  reason: case insensitive filesystem */
public final class C2671zq implements Sea<Z> {

    /* renamed from: a  reason: collision with root package name */
    private final C2602yq f6215a;

    public C2671zq(C2602yq yqVar) {
        this.f6215a = yqVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        Z d = this.f6215a.d();
        Xea.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
