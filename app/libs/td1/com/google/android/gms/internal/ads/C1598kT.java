package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.kT  reason: case insensitive filesystem */
public final class C1598kT<E, V> implements SW<V> {

    /* renamed from: a  reason: collision with root package name */
    private final E f4772a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4773b;

    /* renamed from: c  reason: collision with root package name */
    private final SW<V> f4774c;

    public C1598kT(E e, String str, SW<V> sw) {
        this.f4772a = e;
        this.f4773b = str;
        this.f4774c = sw;
    }

    public final E a() {
        return this.f4772a;
    }

    @Override // com.google.android.gms.internal.ads.SW
    public final void a(Runnable runnable, Executor executor) {
        this.f4774c.a(runnable, executor);
    }

    public final String b() {
        return this.f4773b;
    }

    public final boolean cancel(boolean z) {
        return this.f4774c.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f4774c.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        return this.f4774c.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.f4774c.isCancelled();
    }

    public final boolean isDone() {
        return this.f4774c.isDone();
    }

    public final String toString() {
        String str = this.f4773b;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
