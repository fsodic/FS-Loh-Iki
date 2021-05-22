package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Dz  reason: case insensitive filesystem */
public final class C0291Dz implements Sea<AbstractC0891aA> {

    /* renamed from: a  reason: collision with root package name */
    private final C2680zz f1835a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2197sz> f1836b;

    public C0291Dz(C2680zz zzVar, _ea<C2197sz> _ea) {
        this.f1835a = zzVar;
        this.f1836b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C2197sz szVar = this.f1836b.get();
        Xea.a(szVar, "Cannot return null from a non-@Nullable @Provides method");
        return szVar;
    }
}
