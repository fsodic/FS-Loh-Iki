package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class Tia extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3200a = C0558Og.f2767b;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<AbstractC0959b<?>> f3201b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<AbstractC0959b<?>> f3202c;
    private final Sha d;
    private final AbstractC0763Wd e;
    private volatile boolean f = false;
    private final Uja g;

    public Tia(BlockingQueue<AbstractC0959b<?>> blockingQueue, BlockingQueue<AbstractC0959b<?>> blockingQueue2, Sha sha, AbstractC0763Wd wd) {
        this.f3201b = blockingQueue;
        this.f3202c = blockingQueue2;
        this.d = sha;
        this.e = wd;
        this.g = new Uja(this);
    }

    private final void b() {
        AbstractC0763Wd wd;
        AbstractC0959b<?> take = this.f3201b.take();
        take.a("cache-queue-take");
        take.a(1);
        try {
            take.d();
            C2244tja a2 = this.d.a(take.f());
            if (a2 == null) {
                take.a("cache-miss");
                if (!(this.g.b(take))) {
                    this.f3202c.put(take);
                }
            } else if (a2.a()) {
                take.a("cache-hit-expired");
                take.a(a2);
                if (!(this.g.b(take))) {
                    this.f3202c.put(take);
                }
                take.a(2);
            } else {
                take.a("cache-hit");
                C0191Ad<?> a3 = take.a(new C1912opa(a2.f5643a, a2.g));
                take.a("cache-hit-parsed");
                if (!(a2.f < System.currentTimeMillis())) {
                    wd = this.e;
                } else {
                    take.a("cache-hit-refresh-needed");
                    take.a(a2);
                    a3.d = true;
                    if (!(this.g.b(take))) {
                        this.e.a(take, a3, new RunnableC2315uka(this, take));
                        take.a(2);
                    }
                    wd = this.e;
                }
                wd.a(take, a3);
                take.a(2);
            }
        } finally {
            take.a(2);
        }
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    public final void run() {
        if (f3200a) {
            C0558Og.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.H();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0558Og.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
