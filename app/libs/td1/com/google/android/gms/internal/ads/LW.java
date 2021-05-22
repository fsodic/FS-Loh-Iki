package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public final class LW<V> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Future<V> f2497a;

    /* renamed from: b  reason: collision with root package name */
    private final GW<? super V> f2498b;

    LW(Future<V> future, GW<? super V> gw) {
        this.f2497a = future;
        this.f2498b = gw;
    }

    public final void run() {
        Throwable a2;
        Future<V> future = this.f2497a;
        if (!(future instanceof AbstractC1809nX) || (a2 = C1671lX.a((AbstractC1809nX) future)) == null) {
            try {
                this.f2498b.a(JW.a((Future) this.f2497a));
            } catch (ExecutionException e) {
                this.f2498b.a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f2498b.a(e2);
            }
        } else {
            this.f2498b.a(a2);
        }
    }

    public final String toString() {
        C1600kV a2 = C1463iV.a(this);
        a2.a(this.f2498b);
        return a2.toString();
    }
}
