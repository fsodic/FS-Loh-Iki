package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.jI  reason: case insensitive filesystem */
public final class C1518jI implements Sea<C1381hI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4654a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f4655b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC0524My> f4656c;
    private final _ea<Executor> d;

    public C1518jI(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<AbstractC0524My> _ea3, _ea<Executor> _ea4) {
        this.f4654a = _ea;
        this.f4655b = _ea2;
        this.f4656c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1381hI(this.f4654a.get(), this.f4655b.get(), this.f4656c.get(), this.d.get());
    }
}
