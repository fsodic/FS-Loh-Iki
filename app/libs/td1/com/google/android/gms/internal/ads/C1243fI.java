package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fI  reason: case insensitive filesystem */
public final class C1243fI implements Sea<C0899aI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f4280a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f4281b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f4282c;
    private final _ea<Executor> d;
    private final _ea<AbstractC0524My> e;
    private final _ea<MC> f;

    public C1243fI(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<GR> _ea3, _ea<Executor> _ea4, _ea<AbstractC0524My> _ea5, _ea<MC> _ea6) {
        this.f4280a = _ea;
        this.f4281b = _ea2;
        this.f4282c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0899aI(this.f4280a.get(), this.f4281b.get(), this.f4282c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
