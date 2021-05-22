package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jS  reason: case insensitive filesystem */
public final class C1528jS implements Sea<C1184eS> {

    /* renamed from: a  reason: collision with root package name */
    private final C1391hS f4674a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1047cS> f4675b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<String> f4676c;

    private C1528jS(C1391hS hSVar, _ea<C1047cS> _ea, _ea<String> _ea2) {
        this.f4674a = hSVar;
        this.f4675b = _ea;
        this.f4676c = _ea2;
    }

    public static C1528jS a(C1391hS hSVar, _ea<C1047cS> _ea, _ea<String> _ea2) {
        return new C1528jS(hSVar, _ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1184eS a2 = this.f4675b.get().a(this.f4676c.get());
        Xea.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
