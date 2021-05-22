package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class FM implements AbstractC1180eO<CM> {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0996bf f1949a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f1950b;

    /* renamed from: c  reason: collision with root package name */
    private AbstractC1901ok f1951c;
    private ApplicationInfo d;
    GR e;

    public FM(AbstractC0996bf bfVar, ScheduledExecutorService scheduledExecutorService, AbstractC1901ok okVar, ApplicationInfo applicationInfo, GR gr) {
        this.f1949a = bfVar;
        this.f1950b = scheduledExecutorService;
        this.f1951c = okVar;
        this.d = applicationInfo;
        this.e = gr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<CM> a() {
        SW sw;
        if (C1261fa.f4299a.a().booleanValue() && this.f1951c.c()) {
            sw = JW.a(JW.a(this.f1949a.a(this.d), ((Long) C2392voa.e().a(C2474x.mc)).longValue(), TimeUnit.MILLISECONDS, this.f1950b), Throwable.class, GM.f2029a, C0875_l.f);
        } else {
            sw = JW.a((Object) null);
        }
        return JW.a(JW.a(sw, new HM(this), this.f1950b), EM.f1856a, C0875_l.f3755a);
    }
}
