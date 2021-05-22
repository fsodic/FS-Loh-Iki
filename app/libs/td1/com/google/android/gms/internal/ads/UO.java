package com.google.android.gms.internal.ads;

public final class UO implements Sea<SO> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0613Qj> f3241a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f3242b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<String> f3243c;

    public UO(_ea<AbstractC0613Qj> _ea, _ea<VW> _ea2, _ea<String> _ea3) {
        this.f3241a = _ea;
        this.f3242b = _ea2;
        this.f3243c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new SO(this.f3241a.get(), this.f3242b.get(), this.f3243c.get());
    }
}
