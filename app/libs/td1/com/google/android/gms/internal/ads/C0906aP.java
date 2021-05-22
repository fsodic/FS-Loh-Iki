package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.aP  reason: case insensitive filesystem */
public final class C0906aP implements AbstractC1180eO<YO> {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0996bf f3803a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f3804b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3805c;
    private ApplicationInfo d;

    public C0906aP(AbstractC0996bf bfVar, ScheduledExecutorService scheduledExecutorService, boolean z, ApplicationInfo applicationInfo) {
        this.f3803a = bfVar;
        this.f3804b = scheduledExecutorService;
        this.f3805c = z;
        this.d = applicationInfo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<YO> a() {
        if (!C1261fa.f4300b.a().booleanValue()) {
            return JW.a((Throwable) new Exception("Auto Collect Location by gms is disabled."));
        }
        if (!this.f3805c) {
            return JW.a((Throwable) new Exception("Auto Collect Location is false."));
        }
        return JW.a(JW.a(this.f3803a.a(this.d), ((Long) C2392voa.e().a(C2474x.mc)).longValue(), TimeUnit.MILLISECONDS, this.f3804b), _O.f3714a, C0875_l.f3755a);
    }
}
