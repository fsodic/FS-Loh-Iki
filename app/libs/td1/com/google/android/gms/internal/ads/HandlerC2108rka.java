package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2040qka;
import java.io.IOException;

/* access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.internal.ads.rka  reason: case insensitive filesystem */
public final class HandlerC2108rka<T extends AbstractC2040qka> extends Handler implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final T f5451a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1902oka<T> f5452b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5453c;
    private final long d;
    private IOException e;
    private int f;
    private volatile Thread g;
    private volatile boolean h;
    private final /* synthetic */ C1971pka i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC2108rka(C1971pka pka, Looper looper, T t, AbstractC1902oka<T> oka, int i2, long j) {
        super(looper);
        this.i = pka;
        this.f5451a = t;
        this.f5452b = oka;
        this.f5453c = i2;
        this.d = j;
    }

    private final void a() {
        this.e = null;
        this.i.f5261a.execute(this.i.f5262b);
    }

    private final void b() {
        this.i.f5262b = null;
    }

    public final void a(int i2) {
        IOException iOException = this.e;
        if (iOException != null && this.f > i2) {
            throw iOException;
        }
    }

    public final void a(long j) {
        C2453wka.b(this.i.f5262b == null);
        this.i.f5262b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            a();
        }
    }

    public final void a(boolean z) {
        this.h = z;
        this.e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            this.f5451a.b();
            if (this.g != null) {
                this.g.interrupt();
            }
        }
        if (z) {
            b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f5452b.a((AbstractC2040qka) this.f5451a, elapsedRealtime, elapsedRealtime - this.d, true);
        }
    }

    public final void handleMessage(Message message) {
        if (!this.h) {
            int i2 = message.what;
            if (i2 == 0) {
                a();
            } else if (i2 != 4) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.d;
                if (this.f5451a.a()) {
                    this.f5452b.a((AbstractC2040qka) this.f5451a, elapsedRealtime, j, false);
                    return;
                }
                int i3 = message.what;
                if (i3 == 1) {
                    this.f5452b.a((AbstractC2040qka) this.f5451a, elapsedRealtime, j, false);
                } else if (i3 == 2) {
                    this.f5452b.a(this.f5451a, elapsedRealtime, j);
                } else if (i3 == 3) {
                    this.e = (IOException) message.obj;
                    int a2 = this.f5452b.a(this.f5451a, elapsedRealtime, j, this.e);
                    if (a2 == 3) {
                        this.i.f5263c = this.e;
                    } else if (a2 != 2) {
                        this.f = a2 == 1 ? 1 : this.f + 1;
                        a((long) Math.min((this.f - 1) * 1000, 5000));
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        try {
            this.g = Thread.currentThread();
            if (!this.f5451a.a()) {
                String valueOf = String.valueOf(this.f5451a.getClass().getSimpleName());
                Kka.a(valueOf.length() != 0 ? "load:".concat(valueOf) : new String("load:"));
                try {
                    this.f5451a.c();
                } finally {
                    Kka.a();
                }
            }
            if (!this.h) {
                sendEmptyMessage(2);
            }
        } catch (IOException e2) {
            if (!this.h) {
                obtainMessage(3, e2).sendToTarget();
            }
        } catch (InterruptedException unused) {
            C2453wka.b(this.f5451a.a());
            if (!this.h) {
                sendEmptyMessage(2);
            }
        } catch (Exception e3) {
            Log.e("LoadTask", "Unexpected exception loading stream", e3);
            if (!this.h) {
                obtainMessage(3, new C2246tka(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e4);
            if (!this.h) {
                obtainMessage(3, new C2246tka(e4)).sendToTarget();
            }
        } catch (Error e5) {
            Log.e("LoadTask", "Unexpected error loading stream", e5);
            if (!this.h) {
                obtainMessage(4, e5).sendToTarget();
            }
            throw e5;
        }
    }
}
