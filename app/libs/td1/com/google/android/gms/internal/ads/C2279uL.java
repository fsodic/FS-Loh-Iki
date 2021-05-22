package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uL  reason: case insensitive filesystem */
public final class C2279uL implements Sea<C2141sL> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f5707a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C2549yF> f5708b;

    public C2279uL(_ea<Executor> _ea, _ea<C2549yF> _ea2) {
        this.f5707a = _ea;
        this.f5708b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2141sL(this.f5707a.get(), this.f5708b.get());
    }
}
