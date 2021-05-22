package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.dP  reason: case insensitive filesystem */
public final class C1113dP implements Sea<C0906aP> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<AbstractC0996bf> f4071a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<ScheduledExecutorService> f4072b;

    /* renamed from: c  reason: collision with root package name */
    private final _ea<Boolean> f4073c;
    private final _ea<ApplicationInfo> d;

    public C1113dP(_ea<AbstractC0996bf> _ea, _ea<ScheduledExecutorService> _ea2, _ea<Boolean> _ea3, _ea<ApplicationInfo> _ea4) {
        this.f4071a = _ea;
        this.f4072b = _ea2;
        this.f4073c = _ea3;
        this.d = _ea4;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return new C0906aP(this.f4071a.get(), this.f4072b.get(), this.f4073c.get().booleanValue(), this.d.get());
    }
}
