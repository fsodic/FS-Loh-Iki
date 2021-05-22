package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.PW;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class JW extends NW {
    @SafeVarargs
    public static <V> KW<V> a(SW<? extends V>... swArr) {
        return new KW<>(false, AV.a((Object[]) swArr), null);
    }

    public static <V> SW<V> a(SW<V> sw, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return sw.isDone() ? sw : C0983bX.a(sw, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> SW<O> a(SW<I> sw, AbstractC1187eV<? super I, ? extends O> eVVar, Executor executor) {
        return AbstractRunnableC1395hW.a(sw, eVVar, executor);
    }

    public static <I, O> SW<O> a(SW<I> sw, AbstractC2221tW<? super I, ? extends O> tWVar, Executor executor) {
        return AbstractRunnableC1395hW.a(sw, tWVar, executor);
    }

    public static <V, X extends Throwable> SW<V> a(SW<? extends V> sw, Class<X> cls, AbstractC2221tW<? super X, ? extends V> tWVar, Executor executor) {
        return AbstractRunnableC0982bW.a(sw, cls, tWVar, executor);
    }

    public static <O> SW<O> a(AbstractC2083rW<O> rWVar, Executor executor) {
        RunnableFutureC1258fX fXVar = new RunnableFutureC1258fX(rWVar);
        executor.execute(fXVar);
        return fXVar;
    }

    public static <V> SW<List<V>> a(Iterable<? extends SW<? extends V>> iterable) {
        return new C2359vW(AV.a((Iterable) iterable), true);
    }

    public static <V> SW<V> a(V v) {
        return v == null ? (SW<V>) PW.f2833a : new PW(v);
    }

    public static <V> SW<V> a(Throwable th) {
        C1945pV.a(th);
        return new PW.a(th);
    }

    public static <V> V a(Future<V> future) {
        if (future.isDone()) {
            return (V) C1533jX.a(future);
        }
        throw new IllegalStateException(C2014qV.a("Future was expected to be done: %s", future));
    }

    public static <V> void a(SW<V> sw, GW<? super V> gw, Executor executor) {
        C1945pV.a(gw);
        sw.a(new LW(sw, gw), executor);
    }

    public static <V> KW<V> b(Iterable<? extends SW<? extends V>> iterable) {
        return new KW<>(false, AV.a((Iterable) iterable), null);
    }

    @SafeVarargs
    public static <V> KW<V> b(SW<? extends V>... swArr) {
        return new KW<>(true, AV.a((Object[]) swArr), null);
    }

    public static <V> V b(Future<V> future) {
        C1945pV.a(future);
        try {
            return (V) C1533jX.a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new BW((Error) cause);
            }
            throw new C1602kX(cause);
        }
    }

    public static <V> KW<V> c(Iterable<? extends SW<? extends V>> iterable) {
        return new KW<>(true, AV.a((Iterable) iterable), null);
    }
}
