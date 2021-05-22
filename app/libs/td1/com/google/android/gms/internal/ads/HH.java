package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class HH implements Sea<FH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2110a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<C0823Yl> f2111b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC2466ws> f2112c;
    private final _ea<Executor> d;

    public HH(_ea<Context> _ea, _ea<C0823Yl> _ea2, _ea<AbstractC2466ws> _ea3, _ea<Executor> _ea4) {
        this.f2110a = _ea;
        this.f2111b = _ea2;
        this.f2112c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new FH(this.f2110a.get(), this.f2111b.get(), this.f2112c.get(), this.d.get());
    }
}
