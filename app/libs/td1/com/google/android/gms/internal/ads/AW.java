package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AW<V> extends OW<V> {
    AW() {
    }

    public static <V> AW<V> c(SW<V> sw) {
        return sw instanceof AW ? (AW) sw : new CW(sw);
    }

    public final AW<V> a(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (AW) JW.a(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> AW<T> a(AbstractC1187eV<? super V, T> eVVar, Executor executor) {
        C1945pV.a(eVVar);
        C1532jW jWVar = new C1532jW(this, eVVar);
        a((Runnable) jWVar, UW.a(executor, jWVar));
        return jWVar;
    }

    public final <T> AW<T> a(AbstractC2221tW<? super V, T> tWVar, Executor executor) {
        C1945pV.a(executor);
        C1601kW kWVar = new C1601kW(this, tWVar);
        a((Runnable) kWVar, UW.a(executor, kWVar));
        return kWVar;
    }

    public final <X extends Throwable> AW<V> a(Class<X> cls, AbstractC1187eV<? super X, ? extends V> eVVar, Executor executor) {
        C1326gW gWVar = new C1326gW(this, cls, eVVar);
        a((Runnable) gWVar, UW.a(executor, gWVar));
        return gWVar;
    }

    public final <X extends Throwable> AW<V> a(Class<X> cls, AbstractC2221tW<? super X, ? extends V> tWVar, Executor executor) {
        C0913aW aWVar = new C0913aW(this, cls, tWVar);
        a((Runnable) aWVar, UW.a(executor, aWVar));
        return aWVar;
    }
}
