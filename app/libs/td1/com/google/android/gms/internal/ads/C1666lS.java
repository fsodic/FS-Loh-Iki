package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lS  reason: case insensitive filesystem */
public final class C1666lS implements Sea<C1556jk> {

    /* renamed from: a  reason: collision with root package name */
    private final C1391hS f4855a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1184eS> f4856b;

    private C1666lS(C1391hS hSVar, _ea<C1184eS> _ea) {
        this.f4855a = hSVar;
        this.f4856b = _ea;
    }

    public static C1666lS a(C1391hS hSVar, _ea<C1184eS> _ea) {
        return new C1666lS(hSVar, _ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C1556jk jkVar = this.f4856b.get().f4213c;
        Xea.a(jkVar, "Cannot return null from a non-@Nullable @Provides method");
        return jkVar;
    }
}
