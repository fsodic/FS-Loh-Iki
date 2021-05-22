package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.rJ  reason: case insensitive filesystem */
public final class C2070rJ implements Sea<C1313gJ> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5401a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f5402b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<GR> f5403c;
    private final _ea<Executor> d;
    private final _ea<CC> e;
    private final _ea<MC> f;

    public C2070rJ(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<GR> _ea3, _ea<Executor> _ea4, _ea<CC> _ea5, _ea<MC> _ea6) {
        this.f5401a = _ea;
        this.f5402b = _ea2;
        this.f5403c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1313gJ(this.f5401a.get(), this.f5402b.get(), this.f5403c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
