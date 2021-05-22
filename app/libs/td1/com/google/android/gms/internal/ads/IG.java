package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class IG implements Sea<BinderC2067rG> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f2203a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<Executor> f2204b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC1346gi> f2205c;
    private final _ea<AbstractC0854Zq> d;
    private final _ea<AbstractC1483ii> e;
    private final _ea<HashMap<String, HG>> f;

    private IG(_ea<Context> _ea, _ea<Executor> _ea2, _ea<AbstractC1346gi> _ea3, _ea<AbstractC0854Zq> _ea4, _ea<AbstractC1483ii> _ea5, _ea<HashMap<String, HG>> _ea6) {
        this.f2203a = _ea;
        this.f2204b = _ea2;
        this.f2205c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
    }

    public static IG a(_ea<Context> _ea, _ea<Executor> _ea2, _ea<AbstractC1346gi> _ea3, _ea<AbstractC0854Zq> _ea4, _ea<AbstractC1483ii> _ea5, _ea<HashMap<String, HG>> _ea6) {
        return new IG(_ea, _ea2, _ea3, _ea4, _ea5, _ea6);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new BinderC2067rG(this.f2203a.get(), this.f2204b.get(), this.f2205c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
