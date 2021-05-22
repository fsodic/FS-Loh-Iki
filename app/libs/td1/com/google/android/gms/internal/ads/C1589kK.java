package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.kK  reason: case insensitive filesystem */
public final class C1589kK implements Sea<C1314gK> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f4757a;

    public C1589kK(_ea<Executor> _ea) {
        this.f4757a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1314gK(this.f4757a.get());
    }
}
