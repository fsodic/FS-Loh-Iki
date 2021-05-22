package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b.c.b.a.b.b;
import b.c.b.a.b.f;
import b.c.b.a.g.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* access modifiers changed from: package-private */
public final class Ga implements AbstractC0147fa {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1213a;

    /* renamed from: b  reason: collision with root package name */
    private final K f1214b;

    /* renamed from: c  reason: collision with root package name */
    private final Looper f1215c;
    private final Q d;
    private final Q e;
    private final Map<a.c<?>, Q> f;
    private final Set<AbstractC0160m> g = Collections.newSetFromMap(new WeakHashMap());
    private final a.f h;
    private Bundle i;
    private b j = null;
    private b k = null;
    private boolean l = false;
    private final Lock m;
    private int n = 0;

    private Ga(Context context, K k2, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, Map<a.c<?>, a.f> map2, C0177c cVar, a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar, a.f fVar2, ArrayList<Ea> arrayList, ArrayList<Ea> arrayList2, Map<a<?>, Boolean> map3, Map<a<?>, Boolean> map4) {
        this.f1213a = context;
        this.f1214b = k2;
        this.m = lock;
        this.f1215c = looper;
        this.h = fVar2;
        this.d = new Q(context, this.f1214b, lock, looper, fVar, map2, null, map4, null, arrayList2, new Ia(this, null));
        this.e = new Q(context, this.f1214b, lock, looper, fVar, map, cVar, map3, aVar, arrayList, new Ja(this, null));
        a.c.b bVar = new a.c.b();
        for (a.c<?> cVar2 : map2.keySet()) {
            bVar.put(cVar2, this.d);
        }
        for (a.c<?> cVar3 : map.keySet()) {
            bVar.put(cVar3, this.e);
        }
        this.f = Collections.unmodifiableMap(bVar);
    }

    public static Ga a(Context context, K k2, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, C0177c cVar, Map<a<?>, Boolean> map2, a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar, ArrayList<Ea> arrayList) {
        a.c.b bVar = new a.c.b();
        a.c.b bVar2 = new a.c.b();
        a.f fVar2 = null;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a.f value = entry.getValue();
            if (value.b()) {
                fVar2 = value;
            }
            if (value.j()) {
                bVar.put(entry.getKey(), value);
            } else {
                bVar2.put(entry.getKey(), value);
            }
        }
        r.b(!bVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        a.c.b bVar3 = new a.c.b();
        a.c.b bVar4 = new a.c.b();
        for (a<?> aVar2 : map2.keySet()) {
            a.c<?> a2 = aVar2.a();
            if (bVar.containsKey(a2)) {
                bVar3.put(aVar2, map2.get(aVar2));
            } else if (bVar2.containsKey(a2)) {
                bVar4.put(aVar2, map2.get(aVar2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Ea ea = arrayList.get(i2);
            i2++;
            Ea ea2 = ea;
            if (bVar3.containsKey(ea2.f1207a)) {
                arrayList2.add(ea2);
            } else if (bVar4.containsKey(ea2.f1207a)) {
                arrayList3.add(ea2);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new Ga(context, k2, lock, looper, fVar, bVar, bVar2, cVar, aVar, fVar2, arrayList2, arrayList3, bVar3, bVar4);
    }

    /* access modifiers changed from: private */
    public final void a(int i2, boolean z) {
        this.f1214b.a(i2, z);
        this.k = null;
        this.j = null;
    }

    /* access modifiers changed from: private */
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.i;
        if (bundle2 == null) {
            this.i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    private final void a(b bVar) {
        int i2 = this.n;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.n = 0;
            }
            this.f1214b.a(bVar);
        }
        e();
        this.n = 0;
    }

    private static boolean b(b bVar) {
        return bVar != null && bVar.P();
    }

    private final boolean b(AbstractC0140c<? extends i, ? extends a.b> cVar) {
        a.c<? extends a.b> h2 = cVar.h();
        r.a(this.f.containsKey(h2), "GoogleApiClient is not configured to use the API required for this call.");
        return this.f.get(h2).equals(this.e);
    }

    private final PendingIntent c() {
        if (this.h == null) {
            return null;
        }
        Context context = this.f1213a;
        System.identityHashCode(this.f1214b);
        this.h.i();
        throw null;
    }

    /* access modifiers changed from: private */
    public final void d() {
        b bVar;
        if (b(this.j)) {
            if (b(this.k) || f()) {
                int i2 = this.n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        this.n = 0;
                        return;
                    }
                    this.f1214b.a(this.i);
                }
                e();
                this.n = 0;
                return;
            }
            b bVar2 = this.k;
            if (bVar2 == null) {
                return;
            }
            if (this.n == 1) {
                e();
                return;
            }
            a(bVar2);
            this.d.a();
        } else if (this.j == null || !b(this.k)) {
            b bVar3 = this.j;
            if (bVar3 != null && (bVar = this.k) != null) {
                if (this.e.m < this.d.m) {
                    bVar3 = bVar;
                }
                a(bVar3);
            }
        } else {
            this.e.a();
            a(this.j);
        }
    }

    private final void e() {
        for (AbstractC0160m mVar : this.g) {
            mVar.a();
        }
        this.g.clear();
    }

    private final boolean f() {
        b bVar = this.k;
        return bVar != null && bVar.L() == 4;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        if (!b(t)) {
            return (T) this.d.a(t);
        }
        if (!f()) {
            return (T) this.e.a(t);
        }
        t.a(new Status(4, null, c()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void a() {
        this.k = null;
        this.j = null;
        this.n = 0;
        this.d.a();
        this.e.a();
        e();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.e.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.d.a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void b() {
        this.d.b();
        this.e.b();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void connect() {
        this.n = 2;
        this.l = false;
        this.k = null;
        this.j = null;
        this.d.connect();
        this.e.connect();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final boolean isConnected() {
        this.m.lock();
        try {
            boolean z = true;
            if (!this.d.isConnected() || (!this.e.isConnected() && !f() && this.n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.m.unlock();
        }
    }
}
