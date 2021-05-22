package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.fP  reason: case insensitive filesystem */
public final class C1250fP implements AbstractC1180eO<C0975bP> {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC1206eh f4290a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f4291b;

    /* renamed from: c  reason: collision with root package name */
    private Context f4292c;

    public C1250fP(AbstractC1206eh ehVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.f4290a = ehVar;
        this.f4291b = scheduledExecutorService;
        this.f4292c = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C0975bP> a() {
        return JW.a(JW.a(this.f4290a.a(this.f4292c), ((Long) C2392voa.e().a(C2474x.uc)).longValue(), TimeUnit.MILLISECONDS, this.f4291b), C1181eP.f4209a, C0875_l.f3755a);
    }
}
