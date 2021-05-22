package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

public final class JM implements Sea<FM> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0996bf> f2314a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f2315b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<AbstractC1901ok> f2316c;
    private final _ea<ApplicationInfo> d;
    private final _ea<GR> e;

    private JM(_ea<AbstractC0996bf> _ea, _ea<ScheduledExecutorService> _ea2, _ea<AbstractC1901ok> _ea3, _ea<ApplicationInfo> _ea4, _ea<GR> _ea5) {
        this.f2314a = _ea;
        this.f2315b = _ea2;
        this.f2316c = _ea3;
        this.d = _ea4;
        this.e = _ea5;
    }

    public static JM a(_ea<AbstractC0996bf> _ea, _ea<ScheduledExecutorService> _ea2, _ea<AbstractC1901ok> _ea3, _ea<ApplicationInfo> _ea4, _ea<GR> _ea5) {
        return new JM(_ea, _ea2, _ea3, _ea4, _ea5);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new FM(this.f2314a.get(), this.f2315b.get(), this.f2316c.get(), this.d.get(), this.e.get());
    }
}
