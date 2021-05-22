package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class GH implements Sea<C2482xH> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC2466ws> f2018a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Context> f2019b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Executor> f2020c;
    private final _ea<MC> d;
    private final _ea<GR> e;
    private final _ea<AbstractC1187eV<C1941pR, C0536Nk>> f;

    public GH(_ea<AbstractC2466ws> _ea, _ea<Context> _ea2, _ea<Executor> _ea3, _ea<MC> _ea4, _ea<GR> _ea5, _ea<AbstractC1187eV<C1941pR, C0536Nk>> _ea6) {
        this.f2018a = _ea;
        this.f2019b = _ea2;
        this.f2020c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C2482xH(this.f2018a.get(), this.f2019b.get(), this.f2020c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
