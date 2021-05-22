package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b.c.b.a.b.b;
import b.c.b.a.b.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.C0182h;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import org.cocos2dx.lib.BuildConfig;

public final class K extends f implements AbstractC0149ga {

    /* renamed from: b  reason: collision with root package name */
    private final Lock f1221b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1222c;
    private final C0182h d;
    private AbstractC0147fa e = null;
    private final int f;
    private final Context g;
    private final Looper h;
    final Queue<AbstractC0140c<?, ?>> i = new LinkedList();
    private volatile boolean j;
    private long k;
    private long l;
    private final N m;
    private final e n;
    private C0143da o;
    final Map<a.c<?>, a.f> p;
    Set<Scope> q;
    private final C0177c r;
    private final Map<a<?>, Boolean> s;
    private final a.AbstractC0025a<? extends b.c.b.a.g.e, b.c.b.a.g.a> t;
    private final C0156k u;
    private final ArrayList<Ea> v;
    private Integer w;
    Set<pa> x;
    final sa y;
    private final C0182h.a z;

    public K(Context context, Lock lock, Looper looper, C0177c cVar, e eVar, a.AbstractC0025a<? extends b.c.b.a.g.e, b.c.b.a.g.a> aVar, Map<a<?>, Boolean> map, List<f.b> list, List<f.c> list2, Map<a.c<?>, a.f> map2, int i2, int i3, ArrayList<Ea> arrayList, boolean z2) {
        this.k = c.a() ? 10000 : 120000;
        this.l = 5000;
        this.q = new HashSet();
        this.u = new C0156k();
        this.w = null;
        this.x = null;
        this.z = new L(this);
        this.g = context;
        this.f1221b = lock;
        this.f1222c = false;
        this.d = new C0182h(looper, this.z);
        this.h = looper;
        this.m = new N(this, looper);
        this.n = eVar;
        this.f = i2;
        if (this.f >= 0) {
            this.w = Integer.valueOf(i3);
        }
        this.s = map;
        this.p = map2;
        this.v = arrayList;
        this.y = new sa(this.p);
        for (f.b bVar : list) {
            this.d.a(bVar);
        }
        for (f.c cVar2 : list2) {
            this.d.a(cVar2);
        }
        this.r = cVar;
        this.t = aVar;
    }

    public static int a(Iterable<a.f> iterable, boolean z2) {
        boolean z3 = false;
        boolean z4 = false;
        for (a.f fVar : iterable) {
            if (fVar.j()) {
                z3 = true;
            }
            if (fVar.b()) {
                z4 = true;
            }
        }
        if (z3) {
            return (!z4 || !z2) ? 1 : 2;
        }
        return 3;
    }

    private final void b(int i2) {
        Integer num = this.w;
        if (num == null) {
            this.w = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String c2 = c(i2);
            String c3 = c(this.w.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 51 + String.valueOf(c3).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c2);
            sb.append(". Mode was already set to ");
            sb.append(c3);
            throw new IllegalStateException(sb.toString());
        }
        if (this.e == null) {
            boolean z2 = false;
            boolean z3 = false;
            for (a.f fVar : this.p.values()) {
                if (fVar.j()) {
                    z2 = true;
                }
                if (fVar.b()) {
                    z3 = true;
                }
            }
            int intValue = this.w.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    if (z2) {
                        if (this.f1222c) {
                            this.e = new La(this.g, this.f1221b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this, true);
                            return;
                        } else {
                            this.e = Ga.a(this.g, this, this.f1221b, this.h, this.n, this.p, this.r, this.s, this.t, this.v);
                            return;
                        }
                    }
                }
            } else if (!z2) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z3) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f1222c || z3) {
                this.e = new Q(this.g, this, this.f1221b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this);
            } else {
                this.e = new La(this.g, this.f1221b, this.h, this.n, this.p, this.r, this.s, this.t, this.v, this, false);
            }
        }
    }

    private static String c(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* access modifiers changed from: private */
    public final void j() {
        this.f1221b.lock();
        try {
            if (this.j) {
                k();
            }
        } finally {
            this.f1221b.unlock();
        }
    }

    private final void k() {
        this.d.b();
        this.e.connect();
    }

    /* access modifiers changed from: private */
    public final void l() {
        this.f1221b.lock();
        try {
            if (g()) {
                k();
            }
        } finally {
            this.f1221b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final <C extends a.f> C a(a.c<C> cVar) {
        C c2 = (C) this.p.get(cVar);
        r.a(c2, "Appropriate Api was not requested.");
        return c2;
    }

    @Override // com.google.android.gms.common.api.f
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t2) {
        r.a(t2.h() != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.p.containsKey(t2.h());
        String b2 = t2.g() != null ? t2.g().b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b2);
        sb.append(" required for this call.");
        r.a(containsKey, sb.toString());
        this.f1221b.lock();
        try {
            if (this.e != null) {
                if (this.j) {
                    this.i.add(t2);
                    while (!this.i.isEmpty()) {
                        AbstractC0140c<?, ?> remove = this.i.remove();
                        this.y.a(remove);
                        remove.a(Status.f1177c);
                    }
                } else {
                    t2 = (T) this.e.a(t2);
                }
                return t2;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } finally {
            this.f1221b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void a() {
        this.f1221b.lock();
        try {
            boolean z2 = false;
            if (this.f >= 0) {
                if (this.w != null) {
                    z2 = true;
                }
                r.b(z2, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.w == null) {
                this.w = Integer.valueOf(a((Iterable<a.f>) this.p.values(), false));
            } else if (this.w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.w.intValue());
        } finally {
            this.f1221b.unlock();
        }
    }

    public final void a(int i2) {
        this.f1221b.lock();
        boolean z2 = true;
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z2 = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i2);
            r.a(z2, sb.toString());
            b(i2);
            k();
        } finally {
            this.f1221b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(int i2, boolean z2) {
        if (i2 == 1 && !z2 && !this.j) {
            this.j = true;
            if (this.o == null && !c.a()) {
                this.o = this.n.a(this.g.getApplicationContext(), new O(this));
            }
            N n2 = this.m;
            n2.sendMessageDelayed(n2.obtainMessage(1), this.k);
            N n3 = this.m;
            n3.sendMessageDelayed(n3.obtainMessage(2), this.l);
        }
        this.y.b();
        this.d.a(i2);
        this.d.a();
        if (i2 == 2) {
            k();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(Bundle bundle) {
        while (!this.i.isEmpty()) {
            a(this.i.remove());
        }
        this.d.a(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(b bVar) {
        if (!this.n.b(this.g, bVar.L())) {
            g();
        }
        if (!this.j) {
            this.d.a(bVar);
            this.d.a();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final void a(pa paVar) {
        String str;
        Exception exc;
        this.f1221b.lock();
        try {
            if (this.x == null) {
                str = "Attempted to remove pending transform when no transforms are registered.";
                exc = new Exception();
            } else if (!this.x.remove(paVar)) {
                str = "Failed to remove pending transform - this may lead to memory leaks!";
                exc = new Exception();
            } else {
                if (!h()) {
                    this.e.b();
                }
            }
            Log.wtf("GoogleApiClientImpl", str, exc);
        } finally {
            this.f1221b.unlock();
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.g);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.j);
        printWriter.append(" mWorkQueue.size()=").print(this.i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.y.f1295c.size());
        AbstractC0147fa faVar = this.e;
        if (faVar != null) {
            faVar.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean a(a<?> aVar) {
        return this.p.containsKey(aVar.a());
    }

    @Override // com.google.android.gms.common.api.f
    public final void b() {
        this.f1221b.lock();
        try {
            this.y.a();
            if (this.e != null) {
                this.e.a();
            }
            this.u.a();
            for (AbstractC0140c<?, ?> cVar : this.i) {
                cVar.a((va) null);
                cVar.a();
            }
            this.i.clear();
            if (this.e != null) {
                g();
                this.d.a();
            }
        } finally {
            this.f1221b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean b(a<?> aVar) {
        a.f fVar;
        return d() && (fVar = this.p.get(aVar.a())) != null && fVar.isConnected();
    }

    @Override // com.google.android.gms.common.api.f
    public final Looper c() {
        return this.h;
    }

    @Override // com.google.android.gms.common.api.f
    public final boolean d() {
        AbstractC0147fa faVar = this.e;
        return faVar != null && faVar.isConnected();
    }

    @Override // com.google.android.gms.common.api.f
    public final void e() {
        b();
        a();
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (!this.j) {
            return false;
        }
        this.j = false;
        this.m.removeMessages(2);
        this.m.removeMessages(1);
        C0143da daVar = this.o;
        if (daVar != null) {
            daVar.a();
            this.o = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final boolean h() {
        this.f1221b.lock();
        try {
            if (this.x == null) {
                this.f1221b.unlock();
                return false;
            }
            boolean z2 = !this.x.isEmpty();
            this.f1221b.unlock();
            return z2;
        } catch (Throwable th) {
            this.f1221b.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String i() {
        StringWriter stringWriter = new StringWriter();
        a(BuildConfig.FLAVOR, null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
}
