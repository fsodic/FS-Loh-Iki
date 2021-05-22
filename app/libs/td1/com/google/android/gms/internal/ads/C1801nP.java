package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nP  reason: case insensitive filesystem */
public final class C1801nP implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C1319gP f5038a;

    public C1801nP(C1319gP gPVar) {
        this.f5038a = gPVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        String g = this.f5038a.g();
        Xea.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
