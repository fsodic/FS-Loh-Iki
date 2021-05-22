package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class HO implements AbstractC1180eO<EO> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0743Vj f2125a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2126b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2127c;
    private final C0847Zj d;
    private final ScheduledExecutorService e;
    private final Executor f;

    public HO(AbstractC0743Vj vj, int i, Context context, C0847Zj zj, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f2125a = vj;
        this.f2126b = i;
        this.f2127c = context;
        this.d = zj;
        this.e = scheduledExecutorService;
        this.f = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ EO a(Exception exc) {
        this.d.a(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<EO> a() {
        return AW.c(JW.a(new GO(this), this.f)).a(JO.f2320a, this.f).a(((Long) C2392voa.e().a(C2474x.za)).longValue(), TimeUnit.MILLISECONDS, this.e).a(Exception.class, new IO(this), UW.a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ SW b() {
        return this.f2125a.a(this.f2127c, this.f2126b);
    }
}
