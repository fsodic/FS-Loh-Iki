package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class SH implements Sea<NH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3066a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3067b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC0524My> f3068c;
    private final _ea<C1803nR> d;

    public SH(_ea<Context> _ea, _ea<Executor> _ea2, _ea<AbstractC0524My> _ea3, _ea<C1803nR> _ea4) {
        this.f3066a = _ea;
        this.f3067b = _ea2;
        this.f3068c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new NH(this.f3066a.get(), this.f3067b.get(), this.f3068c.get(), this.d.get());
    }
}
