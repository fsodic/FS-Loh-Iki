package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yH  reason: case insensitive filesystem */
public final class C2551yH implements Sea<C2206tH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0569Or> f6061a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f6062b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f6063c;
    private final _ea<MC> d;
    private final _ea<GR> e;

    public C2551yH(_ea<AbstractC0569Or> _ea, _ea<Context> _ea2, _ea<Executor> _ea3, _ea<MC> _ea4, _ea<GR> _ea5) {
        this.f6061a = _ea;
        this.f6062b = _ea2;
        this.f6063c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2206tH(this.f6061a.get(), this.f6062b.get(), this.f6063c.get(), this.d.get(), this.e.get());
    }
}
