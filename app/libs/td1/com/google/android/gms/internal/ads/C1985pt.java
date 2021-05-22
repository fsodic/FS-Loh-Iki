package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pt  reason: case insensitive filesystem */
public final class C1985pt implements Sea<C1941pR> {

    /* renamed from: a  reason: collision with root package name */
    private final C2054qt f5288a;

    private C1985pt(C2054qt qtVar) {
        this.f5288a = qtVar;
    }

    public static C1985pt a(C2054qt qtVar) {
        return new C1985pt(qtVar);
    }

    public static C1941pR b(C2054qt qtVar) {
        C1941pR b2 = qtVar.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f5288a);
    }
}
