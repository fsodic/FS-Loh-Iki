package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bX  reason: case insensitive filesystem */
public final class C0983bX<V> extends DW<V> {
    private SW<V> h;
    private ScheduledFuture<?> i;

    private C0983bX(SW<V> sw) {
        C1945pV.a(sw);
        this.h = sw;
    }

    static <V> SW<V> a(SW<V> sw, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C0983bX bXVar = new C0983bX(sw);
        RunnableC1121dX dXVar = new RunnableC1121dX(bXVar);
        bXVar.i = scheduledExecutorService.schedule(dXVar, j, timeUnit);
        sw.a(dXVar, EnumC2566yW.INSTANCE);
        return bXVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final void b() {
        a((Future<?>) this.h);
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.h = null;
        this.i = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final String d() {
        SW<V> sw = this.h;
        ScheduledFuture<?> scheduledFuture = this.i;
        if (sw == null) {
            return null;
        }
        String valueOf = String.valueOf(sw);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
