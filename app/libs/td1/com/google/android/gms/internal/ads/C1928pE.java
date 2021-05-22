package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.pE  reason: case insensitive filesystem */
public final class C1928pE implements Sea<C1859oE> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<C2272uE> f5206a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f5207b;

    public C1928pE(_ea<C2272uE> _ea, _ea<Executor> _ea2) {
        this.f5206a = _ea;
        this.f5207b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1859oE(this.f5206a.get(), this.f5207b.get());
    }
}
