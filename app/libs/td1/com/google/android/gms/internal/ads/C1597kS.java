package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kS  reason: case insensitive filesystem */
public final class C1597kS implements Sea<AbstractC1901ok> {

    /* renamed from: a  reason: collision with root package name */
    private final C1391hS f4770a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1184eS> f4771b;

    private C1597kS(C1391hS hSVar, _ea<C1184eS> _ea) {
        this.f4770a = hSVar;
        this.f4771b = _ea;
    }

    public static C1597kS a(C1391hS hSVar, _ea<C1184eS> _ea) {
        return new C1597kS(hSVar, _ea);
    }

    public static AbstractC1901ok a(C1391hS hSVar, C1184eS eSVar) {
        AbstractC1901ok okVar = eSVar.f4212b;
        Xea.a(okVar, "Cannot return null from a non-@Nullable @Provides method");
        return okVar;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4770a, this.f4771b.get());
    }
}
