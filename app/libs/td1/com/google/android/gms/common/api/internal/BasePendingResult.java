package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import b.c.b.a.d.b.h;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.AbstractC0187m;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends i> extends g<R> {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<Boolean> f1198a = new Da();

    /* renamed from: b  reason: collision with root package name */
    private final Object f1199b;

    /* renamed from: c  reason: collision with root package name */
    private final a<R> f1200c;
    private final WeakReference<f> d;
    private final CountDownLatch e;
    private final ArrayList<g.a> f;
    private j<? super R> g;
    private final AtomicReference<va> h;
    private R i;
    private Status j;
    private volatile boolean k;
    private boolean l;
    private boolean m;
    @KeepName
    private b mResultGuardian;
    private AbstractC0187m n;
    private volatile pa<R> o;
    private boolean p;

    public static class a<R extends i> extends h {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(j<? super R> jVar, R r) {
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.gms.common.api.j */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                j jVar = (j) pair.first;
                i iVar = (i) pair.second;
                try {
                    jVar.a(iVar);
                } catch (RuntimeException e) {
                    BasePendingResult.b(iVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).c(Status.d);
            }
        }
    }

    /* access modifiers changed from: private */
    public final class b {
        private b() {
        }

        /* synthetic */ b(BasePendingResult basePendingResult, Da da) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.b(BasePendingResult.this.i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f1199b = new Object();
        this.e = new CountDownLatch(1);
        this.f = new ArrayList<>();
        this.h = new AtomicReference<>();
        this.p = false;
        this.f1200c = new a<>(Looper.getMainLooper());
        this.d = new WeakReference<>(null);
    }

    protected BasePendingResult(f fVar) {
        this.f1199b = new Object();
        this.e = new CountDownLatch(1);
        this.f = new ArrayList<>();
        this.h = new AtomicReference<>();
        this.p = false;
        this.f1200c = new a<>(fVar != null ? fVar.c() : Looper.getMainLooper());
        this.d = new WeakReference<>(fVar);
    }

    public static void b(i iVar) {
        if (iVar instanceof com.google.android.gms.common.api.h) {
            try {
                ((com.google.android.gms.common.api.h) iVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    private final void c(R r) {
        this.i = r;
        this.n = null;
        this.e.countDown();
        this.j = this.i.E();
        if (this.l) {
            this.g = null;
        } else if (this.g != null) {
            this.f1200c.removeMessages(2);
            this.f1200c.a(this.g, g());
        } else if (this.i instanceof com.google.android.gms.common.api.h) {
            this.mResultGuardian = new b(this, null);
        }
        ArrayList<g.a> arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            g.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.j);
        }
        this.f.clear();
    }

    private final R g() {
        R r;
        synchronized (this.f1199b) {
            r.b(!this.k, "Result has already been consumed.");
            r.b(c(), "Result is not ready.");
            r = this.i;
            this.i = null;
            this.g = null;
            this.k = true;
        }
        va andSet = this.h.getAndSet(null);
        if (andSet != null) {
            andSet.a(this);
        }
        return r;
    }

    public void a() {
        synchronized (this.f1199b) {
            if (!this.l) {
                if (!this.k) {
                    if (this.n != null) {
                        try {
                            this.n.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                    b(this.i);
                    this.l = true;
                    c(b(Status.e));
                }
            }
        }
    }

    public final void a(g.a aVar) {
        r.a(aVar != null, "Callback cannot be null.");
        synchronized (this.f1199b) {
            if (c()) {
                aVar.a(this.j);
            } else {
                this.f.add(aVar);
            }
        }
    }

    public final void a(R r) {
        synchronized (this.f1199b) {
            if (this.m || this.l) {
                b(r);
                return;
            }
            c();
            boolean z = true;
            r.b(!c(), "Results have already been set");
            if (this.k) {
                z = false;
            }
            r.b(z, "Result has already been consumed");
            c(r);
        }
    }

    public final void a(va vaVar) {
        this.h.set(vaVar);
    }

    public final void a(j<? super R> jVar) {
        synchronized (this.f1199b) {
            if (jVar == null) {
                this.g = null;
                return;
            }
            boolean z = true;
            r.b(!this.k, "Result has already been consumed.");
            if (this.o != null) {
                z = false;
            }
            r.b(z, "Cannot set callbacks if then() has been called.");
            if (!b()) {
                if (c()) {
                    this.f1200c.a(jVar, g());
                } else {
                    this.g = jVar;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract R b(Status status);

    public boolean b() {
        boolean z;
        synchronized (this.f1199b) {
            z = this.l;
        }
        return z;
    }

    public final void c(Status status) {
        synchronized (this.f1199b) {
            if (!c()) {
                a(b(status));
                this.m = true;
            }
        }
    }

    public final boolean c() {
        return this.e.getCount() == 0;
    }

    public final Integer d() {
        return null;
    }

    public final boolean e() {
        boolean b2;
        synchronized (this.f1199b) {
            if (this.d.get() == null || !this.p) {
                a();
            }
            b2 = b();
        }
        return b2;
    }

    public final void f() {
        this.p = this.p || f1198a.get().booleanValue();
    }
}
