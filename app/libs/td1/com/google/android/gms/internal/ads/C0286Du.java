package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Du  reason: case insensitive filesystem */
public final class C0286Du implements Sea<String> {

    /* renamed from: a  reason: collision with root package name */
    private final C2537xu f1832a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0467Kt> f1833b;

    private C0286Du(C2537xu xuVar, _ea<C0467Kt> _ea) {
        this.f1832a = xuVar;
        this.f1833b = _ea;
    }

    public static C0286Du a(C2537xu xuVar, _ea<C0467Kt> _ea) {
        return new C0286Du(xuVar, _ea);
    }

    public static String a(C2537xu xuVar, C0467Kt kt) {
        String c2 = kt.c();
        Xea.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f1832a, this.f1833b.get());
    }
}
