package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class YI<AdT> implements Sea<VI<AdT>> {
    public static <AdT> VI<AdT> a(BT bt, OI oi, C0598Pu pu, LT lt, AbstractC1021bt<AdT> btVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        return new VI<>(bt, oi, pu, lt, btVar, executor, scheduledExecutorService);
    }
}
