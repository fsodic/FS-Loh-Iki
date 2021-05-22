package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dE  reason: case insensitive filesystem */
public final class C1102dE implements Sea<C1170eE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C1721mE> f4054a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2272uE> f4055b;

    private C1102dE(_ea<C1721mE> _ea, _ea<C2272uE> _ea2) {
        this.f4054a = _ea;
        this.f4055b = _ea2;
    }

    public static C1102dE a(_ea<C1721mE> _ea, _ea<C2272uE> _ea2) {
        return new C1102dE(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1170eE(this.f4054a.get(), this.f4055b.get());
    }
}
