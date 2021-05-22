package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Uv  reason: case insensitive filesystem */
public final class C0729Uv extends C0834Yw<AbstractC0833Yv> {

    /* renamed from: b  reason: collision with root package name */
    private final ScheduledExecutorService f3302b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3303c;
    private long d = -1;
    private long e = -1;
    private boolean f = false;
    private ScheduledFuture<?> g;

    public C0729Uv(ScheduledExecutorService scheduledExecutorService, d dVar) {
        super(Collections.emptySet());
        this.f3302b = scheduledExecutorService;
        this.f3303c = dVar;
    }

    /* access modifiers changed from: private */
    public final void R() {
        a(C0703Tv.f3216a);
    }

    private final synchronized void a(long j) {
        if (this.g != null && !this.g.isDone()) {
            this.g.cancel(true);
        }
        this.d = this.f3303c.b() + j;
        this.g = this.f3302b.schedule(new RunnableC0755Vv(this), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void Q() {
        this.f = false;
        a(0);
    }

    public final synchronized void b(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.f) {
                if (this.e <= 0 || millis >= this.e) {
                    millis = this.e;
                }
                this.e = millis;
                return;
            }
            if (this.f3303c.b() > this.d || this.d - this.f3303c.b() > millis) {
                a(millis);
            }
        }
    }

    public final synchronized void onPause() {
        if (!this.f) {
            if (this.g == null || this.g.isCancelled()) {
                this.e = -1;
            } else {
                this.g.cancel(true);
                this.e = this.d - this.f3303c.b();
            }
            this.f = true;
        }
    }

    public final synchronized void onResume() {
        if (this.f) {
            if (this.e > 0 && this.g.isCancelled()) {
                a(this.e);
            }
            this.f = false;
        }
    }
}
