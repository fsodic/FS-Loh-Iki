package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.uD  reason: case insensitive filesystem */
public final class C2271uD implements Sea<C1927pD> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Executor> f5691a;

    public C2271uD(_ea<Executor> _ea) {
        this.f5691a = _ea;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C1927pD(this.f5691a.get());
    }
}
