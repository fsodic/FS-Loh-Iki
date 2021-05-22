package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.sO  reason: case insensitive filesystem */
public final class C2144sO implements AbstractC1180eO<C1938pO> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0743Vj f5508a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5509b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f5510c;
    private final Executor d;

    public C2144sO(AbstractC0743Vj vj, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f5508a = vj;
        this.f5509b = context;
        this.f5510c = scheduledExecutorService;
        this.d = executor;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<C1938pO> a() {
        if (!((Boolean) C2392voa.e().a(C2474x.ya)).booleanValue()) {
            return JW.a((Throwable) new Exception("Did not ad Ad ID into query param."));
        }
        return AW.c((SW) this.f5508a.a(this.f5509b)).a(C2075rO.f5408a, this.d).a(((Long) C2392voa.e().a(C2474x.za)).longValue(), TimeUnit.MILLISECONDS, this.f5510c).a(Throwable.class, new C2282uO(this), this.d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C1938pO a(Throwable th) {
        C2392voa.a();
        return new C1938pO(null, C0459Kl.b(this.f5509b));
    }
}
