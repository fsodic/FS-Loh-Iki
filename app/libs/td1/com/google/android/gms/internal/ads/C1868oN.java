package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC0905aO;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.oN  reason: case insensitive filesystem */
public final class C1868oN<S extends AbstractC0905aO<?>> implements AbstractC1180eO<S> {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1180eO<S> f5116a;

    /* renamed from: b  reason: collision with root package name */
    private final long f5117b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f5118c;

    public C1868oN(AbstractC1180eO<S> eOVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f5116a = eOVar;
        this.f5117b = j;
        this.f5118c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<S> a() {
        SW<S> a2 = this.f5116a.a();
        long j = this.f5117b;
        if (j > 0) {
            a2 = JW.a(a2, j, TimeUnit.MILLISECONDS, this.f5118c);
        }
        return JW.a(a2, Throwable.class, C2074rN.f5407a, C0875_l.f);
    }
}
