package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fu  reason: case insensitive filesystem */
public final class C0338Fu implements Sea<GR> {

    /* renamed from: a  reason: collision with root package name */
    private final C2537xu f2002a;

    private C0338Fu(C2537xu xuVar) {
        this.f2002a = xuVar;
    }

    public static C0338Fu a(C2537xu xuVar) {
        return new C0338Fu(xuVar);
    }

    public static GR b(C2537xu xuVar) {
        GR b2 = xuVar.b();
        Xea.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return b(this.f2002a);
    }
}
