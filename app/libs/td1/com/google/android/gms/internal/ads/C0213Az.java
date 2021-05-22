package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Az  reason: case insensitive filesystem */
public final class C0213Az implements Sea<C0811Xz> {

    /* renamed from: a  reason: collision with root package name */
    private final C2680zz f1579a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0889_z> f1580b;

    public C0213Az(C2680zz zzVar, _ea<C0889_z> _ea) {
        this.f1579a = zzVar;
        this.f1580b = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        C0889_z _zVar = this.f1580b.get();
        Xea.a(_zVar, "Cannot return null from a non-@Nullable @Provides method");
        return _zVar;
    }
}
