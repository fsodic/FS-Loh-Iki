package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.aX  reason: case insensitive filesystem */
final class ScheduledFutureC0914aX<V> extends HW<V> implements SW<V>, ScheduledFuture<V> {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledFuture<?> f3816b;

    public ScheduledFutureC0914aX(SW<V> sw, ScheduledFuture<?> scheduledFuture) {
        super(sw);
        this.f3816b = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.FW
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f3816b.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f3816b.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f3816b.getDelay(timeUnit);
    }
}
