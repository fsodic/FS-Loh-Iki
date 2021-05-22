package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sC  reason: case insensitive filesystem */
public final class C2132sC implements Sea<CallableC2063rC> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5482a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f5483b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<C1955pca> f5484c;
    private final _ea<C0823Yl> d;
    private final _ea<a> e;
    private final _ea<C2115ro> f;

    public C2132sC(_ea<Context> _ea, _ea<Executor> _ea2, _ea<C1955pca> _ea3, _ea<C0823Yl> _ea4, _ea<a> _ea5, _ea<C2115ro> _ea6) {
        this.f5482a = _ea;
        this.f5483b = _ea2;
        this.f5484c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new CallableC2063rC(this.f5482a.get(), this.f5483b.get(), this.f5484c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
