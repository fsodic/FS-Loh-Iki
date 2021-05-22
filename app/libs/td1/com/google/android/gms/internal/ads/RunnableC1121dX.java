package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.dX  reason: case insensitive filesystem */
public final class RunnableC1121dX<V> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private C0983bX<V> f4106a;

    RunnableC1121dX(C0983bX<V> bXVar) {
        this.f4106a = bXVar;
    }

    public final void run() {
        SW<? extends V> sw;
        C0983bX<V> bXVar = this.f4106a;
        if (bXVar != null && (sw = bXVar.h) != null) {
            this.f4106a = null;
            if (sw.isDone()) {
                bXVar.a((SW) sw);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = bXVar.i;
                ((C0983bX) bXVar).i = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            StringBuilder sb = new StringBuilder(str.length() + 66);
                            sb.append(str);
                            sb.append(" (timeout delayed by ");
                            sb.append(abs);
                            sb.append(" ms after scheduled time)");
                            str = sb.toString();
                        }
                    } catch (Throwable th) {
                        bXVar.a((Throwable) new C1327gX(str));
                        throw th;
                    }
                }
                String valueOf = String.valueOf(str);
                String valueOf2 = String.valueOf(sw);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                sb2.append(valueOf);
                sb2.append(": ");
                sb2.append(valueOf2);
                bXVar.a((Throwable) new C1327gX(sb2.toString()));
            } finally {
                sw.cancel(true);
            }
        }
    }
}
