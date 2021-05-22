package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

public final class RR<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Deque<SW<T>> f3012a = new LinkedBlockingDeque();

    /* renamed from: b  reason: collision with root package name */
    private final Callable<T> f3013b;

    /* renamed from: c  reason: collision with root package name */
    private final VW f3014c;

    public RR(Callable<T> callable, VW vw) {
        this.f3013b = callable;
        this.f3014c = vw;
    }

    public final synchronized SW<T> a() {
        a(1);
        return this.f3012a.poll();
    }

    public final synchronized void a(int i) {
        int size = i - this.f3012a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3012a.add(this.f3014c.a(this.f3013b));
        }
    }

    public final synchronized void a(SW<T> sw) {
        this.f3012a.addFirst(sw);
    }
}
