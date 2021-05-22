package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Bq  reason: case insensitive filesystem */
public final class C0230Bq implements Sea<AbstractC1138dh> {

    /* renamed from: a  reason: collision with root package name */
    private final C2602yq f1658a;

    public C0230Bq(C2602yq yqVar) {
        this.f1658a = yqVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC1138dh b2 = this.f1658a.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
