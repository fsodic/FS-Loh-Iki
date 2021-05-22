package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.yJ  reason: case insensitive filesystem */
public final class C2553yJ implements Sea<C2002qJ> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f6067a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f6068b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<CC> f6069c;

    public C2553yJ(_ea<Context> _ea, _ea<Executor> _ea2, _ea<CC> _ea3) {
        this.f6067a = _ea;
        this.f6068b = _ea2;
        this.f6069c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2002qJ(this.f6067a.get(), this.f6068b.get(), this.f6069c.get());
    }
}
