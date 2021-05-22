package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class UW {
    public static VW a(ExecutorService executorService) {
        return executorService instanceof VW ? (VW) executorService : executorService instanceof ScheduledExecutorService ? new YW((ScheduledExecutorService) executorService) : new ZW(executorService);
    }

    public static Executor a() {
        return EnumC2566yW.INSTANCE;
    }

    static Executor a(Executor executor, C1120dW<?> dWVar) {
        C1945pV.a(executor);
        C1945pV.a(dWVar);
        return executor == EnumC2566yW.INSTANCE ? executor : new XW(executor, dWVar);
    }
}
