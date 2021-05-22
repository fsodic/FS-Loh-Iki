package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.hm  reason: case insensitive filesystem */
public class C1423hm<T> implements SW<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C1052cX<T> f4509a = C1052cX.h();

    private static boolean a(boolean z) {
        if (!z) {
            q.g().b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.SW
    public void a(Runnable runnable, Executor executor) {
        this.f4509a.a(runnable, executor);
    }

    public final boolean a(Throwable th) {
        boolean a2 = this.f4509a.a(th);
        a(a2);
        return a2;
    }

    public final boolean b(T t) {
        boolean a2 = this.f4509a.a(t);
        a(a2);
        return a2;
    }

    public boolean cancel(boolean z) {
        return this.f4509a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return this.f4509a.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) {
        return this.f4509a.get(j, timeUnit);
    }

    public boolean isCancelled() {
        return this.f4509a.isCancelled();
    }

    public boolean isDone() {
        return this.f4509a.isDone();
    }
}
