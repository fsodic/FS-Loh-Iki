package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.AbstractC0176b;

/* renamed from: com.google.android.gms.internal.ads.gma  reason: case insensitive filesystem */
public final class C1355gma {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f4422a = new RunnableC1561jma(this);

    /* renamed from: b  reason: collision with root package name */
    private final Object f4423b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private C1975pma f4424c;
    private Context d;
    private AbstractC2319uma e;

    private final synchronized C1975pma a(AbstractC0176b.a aVar, AbstractC0176b.AbstractC0028b bVar) {
        return new C1975pma(this.d, q.q().b(), aVar, bVar);
    }

    /* access modifiers changed from: private */
    public final void b() {
        synchronized (this.f4423b) {
            if (this.d != null) {
                if (this.f4424c == null) {
                    this.f4424c = a(new C1699lma(this), new C1630kma(this));
                    this.f4424c.l();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c() {
        synchronized (this.f4423b) {
            if (this.f4424c != null) {
                if (this.f4424c.isConnected() || this.f4424c.c()) {
                    this.f4424c.a();
                }
                this.f4424c = null;
                this.e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final C1837nma a(C1906oma oma) {
        synchronized (this.f4423b) {
            if (this.e == null) {
                return new C1837nma();
            }
            try {
                return this.e.a(oma);
            } catch (RemoteException e2) {
                C0745Vl.b("Unable to call into cache service.", e2);
                return new C1837nma();
            }
        }
    }

    public final void a() {
        if (((Boolean) C2392voa.e().a(C2474x.Ac)).booleanValue()) {
            synchronized (this.f4423b) {
                b();
                q.c();
                C2452wk.f5921a.removeCallbacks(this.f4422a);
                q.c();
                C2452wk.f5921a.postDelayed(this.f4422a, ((Long) C2392voa.e().a(C2474x.Bc)).longValue());
            }
        }
    }

    public final void a(Context context) {
        if (context != null) {
            synchronized (this.f4423b) {
                if (this.d == null) {
                    this.d = context.getApplicationContext();
                    if (((Boolean) C2392voa.e().a(C2474x.zc)).booleanValue()) {
                        b();
                    } else {
                        if (((Boolean) C2392voa.e().a(C2474x.yc)).booleanValue()) {
                            q.f().a(new C1492ima(this));
                        }
                    }
                }
            }
        }
    }
}
