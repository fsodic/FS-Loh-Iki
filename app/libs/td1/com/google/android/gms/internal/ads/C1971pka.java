package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pka  reason: case insensitive filesystem */
public final class C1971pka {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f5261a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerC2108rka<? extends AbstractC2040qka> f5262b;

    /* renamed from: c  reason: collision with root package name */
    private IOException f5263c;

    public C1971pka(String str) {
        this.f5261a = Jka.a(str);
    }

    public final <T extends AbstractC2040qka> long a(T t, AbstractC1902oka<T> oka, int i) {
        Looper myLooper = Looper.myLooper();
        C2453wka.b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC2108rka(this, myLooper, t, oka, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    public final void a(int i) {
        IOException iOException = this.f5263c;
        if (iOException == null) {
            HandlerC2108rka<? extends AbstractC2040qka> rka = this.f5262b;
            if (rka != null) {
                rka.a(rka.f5453c);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(Runnable runnable) {
        HandlerC2108rka<? extends AbstractC2040qka> rka = this.f5262b;
        if (rka != null) {
            rka.a(true);
        }
        this.f5261a.execute(runnable);
        this.f5261a.shutdown();
    }

    public final boolean a() {
        return this.f5262b != null;
    }

    public final void b() {
        this.f5262b.a(false);
    }
}
