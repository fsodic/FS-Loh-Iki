package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Jr  reason: case insensitive filesystem */
public final class C0439Jr implements Fla {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f2362a;

    /* renamed from: b  reason: collision with root package name */
    private final d f2363b;

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f2364c;
    private long d = -1;
    private long e = -1;
    private Runnable f = null;
    private boolean g = false;

    public C0439Jr(ScheduledExecutorService scheduledExecutorService, d dVar) {
        this.f2362a = scheduledExecutorService;
        this.f2363b = dVar;
        q.f().a(this);
    }

    private final synchronized void a() {
        if (!this.g) {
            if (this.f2364c == null || this.f2364c.isDone()) {
                this.e = -1;
            } else {
                this.f2364c.cancel(true);
                this.e = this.d - this.f2363b.b();
            }
            this.g = true;
        }
    }

    private final synchronized void b() {
        if (this.g) {
            if (this.e > 0 && this.f2364c != null && this.f2364c.isCancelled()) {
                this.f2364c = this.f2362a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
            }
            this.g = false;
        }
    }

    public final synchronized void a(int i, Runnable runnable) {
        this.f = runnable;
        long j = (long) i;
        this.d = this.f2363b.b() + j;
        this.f2364c = this.f2362a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.Fla
    public final void a(boolean z) {
        if (z) {
            b();
        } else {
            a();
        }
    }
}
