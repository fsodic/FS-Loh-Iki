package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b.c.b.a.b.b;
import b.c.b.a.d.b.h;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.h  reason: case insensitive filesystem */
public final class C0182h implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final a f1367a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<f.b> f1368b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<f.b> f1369c = new ArrayList<>();
    private final ArrayList<f.c> d = new ArrayList<>();
    private volatile boolean e = false;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g = false;
    private final Handler h;
    private final Object i = new Object();

    /* renamed from: com.google.android.gms.common.internal.h$a */
    public interface a {
        Bundle F();

        boolean isConnected();
    }

    public C0182h(Looper looper, a aVar) {
        this.f1367a = aVar;
        this.h = new h(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void a(int i2) {
        r.a(this.h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            this.g = true;
            ArrayList arrayList = new ArrayList(this.f1368b);
            int i3 = this.f.get();
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                f.b bVar = (f.b) obj;
                if (!this.e || this.f.get() != i3) {
                    break;
                } else if (this.f1368b.contains(bVar)) {
                    bVar.onConnectionSuspended(i2);
                }
            }
            this.f1369c.clear();
            this.g = false;
        }
    }

    public final void a(Bundle bundle) {
        r.a(this.h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.i) {
            boolean z = true;
            r.b(!this.g);
            this.h.removeMessages(1);
            this.g = true;
            if (this.f1369c.size() != 0) {
                z = false;
            }
            r.b(z);
            ArrayList arrayList = new ArrayList(this.f1368b);
            int i2 = this.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f.b bVar = (f.b) obj;
                if (!this.e || !this.f1367a.isConnected() || this.f.get() != i2) {
                    break;
                } else if (!this.f1369c.contains(bVar)) {
                    bVar.onConnected(bundle);
                }
            }
            this.f1369c.clear();
            this.g = false;
        }
    }

    public final void a(b bVar) {
        r.a(this.h, "onConnectionFailure must only be called on the Handler thread");
        this.h.removeMessages(1);
        synchronized (this.i) {
            ArrayList arrayList = new ArrayList(this.d);
            int i2 = this.f.get();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                f.c cVar = (f.c) obj;
                if (this.e) {
                    if (this.f.get() == i2) {
                        if (this.d.contains(cVar)) {
                            cVar.onConnectionFailed(bVar);
                        }
                    }
                }
                return;
            }
        }
    }

    public final void a(f.b bVar) {
        r.a(bVar);
        synchronized (this.i) {
            if (this.f1368b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f1368b.add(bVar);
            }
        }
        if (this.f1367a.isConnected()) {
            Handler handler = this.h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    public final void a(f.c cVar) {
        r.a(cVar);
        synchronized (this.i) {
            if (this.d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.d.add(cVar);
            }
        }
    }

    public final void b() {
        this.e = true;
    }

    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            f.b bVar = (f.b) message.obj;
            synchronized (this.i) {
                if (this.e && this.f1367a.isConnected() && this.f1368b.contains(bVar)) {
                    bVar.onConnected(this.f1367a.F());
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i2);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
