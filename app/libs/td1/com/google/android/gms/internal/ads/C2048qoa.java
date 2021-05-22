package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.internal.ads.qoa  reason: case insensitive filesystem */
public final class C2048qoa extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final BlockingQueue<AbstractC0959b<?>> f5362a;

    /* renamed from: b  reason: collision with root package name */
    private final Poa f5363b;

    /* renamed from: c  reason: collision with root package name */
    private final Sha f5364c;
    private final AbstractC0763Wd d;
    private volatile boolean e = false;

    public C2048qoa(BlockingQueue<AbstractC0959b<?>> blockingQueue, Poa poa, Sha sha, AbstractC0763Wd wd) {
        this.f5362a = blockingQueue;
        this.f5363b = poa;
        this.f5364c = sha;
        this.d = wd;
    }

    private final void b() {
        AbstractC0959b<?> take = this.f5362a.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.a(3);
        try {
            take.a("network-queue-take");
            take.d();
            TrafficStats.setThreadStatsTag(take.e());
            C1912opa a2 = this.f5363b.a(take);
            take.a("network-http-complete");
            if (!a2.e || !take.m()) {
                C0191Ad<?> a3 = take.a(a2);
                take.a("network-parse-complete");
                if (take.i() && a3.f1526b != null) {
                    this.f5364c.a(take.f(), a3.f1526b);
                    take.a("network-cache-written");
                }
                take.l();
                this.d.a(take, a3);
                take.a(a3);
                take.a(4);
                return;
            }
            take.b("not-modified");
            take.n();
        } catch (C0713Uf e2) {
            e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.d.a(take, e2);
            take.n();
        } catch (Exception e3) {
            C0558Og.a(e3, "Unhandled exception %s", e3.toString());
            C0713Uf uf = new C0713Uf(e3);
            uf.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.d.a(take, uf);
            take.n();
        } finally {
            take.a(4);
        }
    }

    public final void a() {
        this.e = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C0558Og.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
