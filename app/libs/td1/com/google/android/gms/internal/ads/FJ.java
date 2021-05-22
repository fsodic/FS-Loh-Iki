package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2331uv;

public final class FJ<AdT, AdapterT, ListenerT extends AbstractC2331uv> implements Sea<BJ<AdT, AdapterT, ListenerT>> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<BT> f1942a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<VW> f1943b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC1862oH<AdapterT, ListenerT>> f1944c;
    private final _ea<AbstractC2000qH<AdT, AdapterT, ListenerT>> d;

    private FJ(_ea<BT> _ea, _ea<VW> _ea2, _ea<AbstractC1862oH<AdapterT, ListenerT>> _ea3, _ea<AbstractC2000qH<AdT, AdapterT, ListenerT>> _ea4) {
        this.f1942a = _ea;
        this.f1943b = _ea2;
        this.f1944c = _ea3;
        this.d = _ea4;
    }

    public static <AdT, AdapterT, ListenerT extends AbstractC2331uv> FJ<AdT, AdapterT, ListenerT> a(_ea<BT> _ea, _ea<VW> _ea2, _ea<AbstractC1862oH<AdapterT, ListenerT>> _ea3, _ea<AbstractC2000qH<AdT, AdapterT, ListenerT>> _ea4) {
        return new FJ<>(_ea, _ea2, _ea3, _ea4);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BJ(this.f1942a.get(), this.f1943b.get(), this.f1944c.get(), this.d.get());
    }
}
