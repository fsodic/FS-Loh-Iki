package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class JN implements Sea<GN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<VW> f2317a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f2318b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<String> f2319c;
    private final _ea<C1314gK> d;
    private final _ea<Context> e;
    private final _ea<GR> f;
    private final _ea<C1176eK> g;

    private JN(_ea<VW> _ea, _ea<ScheduledExecutorService> _ea2, _ea<String> _ea3, _ea<C1314gK> _ea4, _ea<Context> _ea5, _ea<GR> _ea6, _ea<C1176eK> _ea7) {
        this.f2317a = _ea;
        this.f2318b = _ea2;
        this.f2319c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
        this.f = _ea6;
        this.g = _ea7;
    }

    public static JN a(_ea<VW> _ea, _ea<ScheduledExecutorService> _ea2, _ea<String> _ea3, _ea<C1314gK> _ea4, _ea<Context> _ea5, _ea<GR> _ea6, _ea<C1176eK> _ea7) {
        return new JN(_ea, _ea2, _ea3, _ea4, _ea5, _ea6, _ea7);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new GN(this.f2317a.get(), this.f2318b.get(), this.f2319c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
