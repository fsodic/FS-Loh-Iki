package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Eq  reason: case insensitive filesystem */
public final class C0308Eq implements Sea<AbstractC1899oj> {

    /* renamed from: a  reason: collision with root package name */
    private final C2602yq f1913a;

    public C0308Eq(C2602yq yqVar) {
        this.f1913a = yqVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        AbstractC1899oj a2 = this.f1913a.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
