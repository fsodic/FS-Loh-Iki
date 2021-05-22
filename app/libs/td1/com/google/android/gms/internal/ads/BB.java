package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class BB implements Sea<C2476xB> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f1585a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C1374hB> f1586b;

    public BB(_ea<Executor> _ea, _ea<C1374hB> _ea2) {
        this.f1585a = _ea;
        this.f1586b = _ea2;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2476xB(this.f1585a.get(), this.f1586b.get());
    }
}
