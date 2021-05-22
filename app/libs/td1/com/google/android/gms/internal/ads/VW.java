package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public interface VW extends ExecutorService {
    SW<?> a(Runnable runnable);

    <T> SW<T> a(Callable<T> callable);
}
