package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lA  reason: case insensitive filesystem */
public final class C1648lA implements Sea<C0707Tz> {

    /* renamed from: a  reason: collision with root package name */
    private final C1166eA f4826a;

    private C1648lA(C1166eA eAVar) {
        this.f4826a = eAVar;
    }

    public static C1648lA a(C1166eA eAVar) {
        return new C1648lA(eAVar);
    }

    public static C0707Tz b(C1166eA eAVar) {
        C0707Tz a2 = eAVar.a();
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f4826a);
    }
}
