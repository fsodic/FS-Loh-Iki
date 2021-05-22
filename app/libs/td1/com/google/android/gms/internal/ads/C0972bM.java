package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.bM  reason: case insensitive filesystem */
public final class C0972bM implements Sea<C0903aM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f3888a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0847Zj> f3889b;

    private C0972bM(_ea<Executor> _ea, _ea<C0847Zj> _ea2) {
        this.f3888a = _ea;
        this.f3889b = _ea2;
    }

    public static C0903aM a(Executor executor, C0847Zj zj) {
        return new C0903aM(executor, zj);
    }

    public static C0972bM a(_ea<Executor> _ea, _ea<C0847Zj> _ea2) {
        return new C0972bM(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f3888a.get(), this.f3889b.get());
    }
}
