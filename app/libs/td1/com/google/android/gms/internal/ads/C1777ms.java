package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ms  reason: case insensitive filesystem */
public final class C1777ms implements Sea<AbstractC0951as> {

    /* renamed from: a  reason: collision with root package name */
    private final C1433hs f5004a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1089cs> f5005b;

    public C1777ms(C1433hs hsVar, _ea<C1089cs> _ea) {
        this.f5004a = hsVar;
        this.f5005b = _ea;
    }

    public static AbstractC0951as a(C1433hs hsVar, Object obj) {
        C1089cs csVar = (C1089cs) obj;
        Xea.a(csVar, "Cannot return null from a non-@Nullable @Provides method");
        return csVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5004a, this.f5005b.get());
    }
}
