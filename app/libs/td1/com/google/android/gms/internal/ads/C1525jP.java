package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jP  reason: case insensitive filesystem */
public final class C1525jP implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C1319gP f4667a;

    public C1525jP(C1319gP gPVar) {
        this.f4667a = gPVar;
    }

    public static String a(C1319gP gPVar) {
        String a2 = gPVar.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4667a);
    }
}
