package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Cq  reason: case insensitive filesystem */
public final class C0256Cq implements Sea<AbstractC0996bf> {

    /* renamed from: a  reason: collision with root package name */
    private final C2602yq f1733a;

    public C0256Cq(C2602yq yqVar) {
        this.f1733a = yqVar;
    }

    public static AbstractC0996bf a(C2602yq yqVar) {
        AbstractC0996bf c2 = yqVar.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f1733a);
    }
}
