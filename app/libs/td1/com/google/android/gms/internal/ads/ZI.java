package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class ZI implements Sea<XI> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f3623a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f3624b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<CC> f3625c;

    public ZI(_ea<Context> _ea, _ea<Executor> _ea2, _ea<CC> _ea3) {
        this.f3623a = _ea;
        this.f3624b = _ea2;
        this.f3625c = _ea3;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new XI(this.f3623a.get(), this.f3624b.get(), this.f3625c.get());
    }
}
