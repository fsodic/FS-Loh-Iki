package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import b.c.b.a.b.b;
import b.c.b.a.b.f;
import b.c.b.a.g.a.k;
import b.c.b.a.g.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.AbstractC0186l;
import com.google.android.gms.common.internal.C0177c;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: com.google.android.gms.common.api.internal.y  reason: case insensitive filesystem */
public final class C0173y implements P {

    /* renamed from: a  reason: collision with root package name */
    private final Q f1309a;

    /* renamed from: b  reason: collision with root package name */
    private final Lock f1310b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1311c;
    private final f d;
    private b e;
    private int f;
    private int g = 0;
    private int h;
    private final Bundle i = new Bundle();
    private final Set<a.c> j = new HashSet();
    private e k;
    private boolean l;
    private boolean m;
    private boolean n;
    private AbstractC0186l o;
    private boolean p;
    private boolean q;
    private final C0177c r;
    private final Map<a<?>, Boolean> s;
    private final a.AbstractC0025a<? extends e, b.c.b.a.g.a> t;
    private ArrayList<Future<?>> u = new ArrayList<>();

    public C0173y(Q q2, C0177c cVar, Map<a<?>, Boolean> map, f fVar, a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar, Lock lock, Context context) {
        this.f1309a = q2;
        this.r = cVar;
        this.s = map;
        this.d = fVar;
        this.t = aVar;
        this.f1310b = lock;
        this.f1311c = context;
    }

    /* access modifiers changed from: private */
    public final void a(k kVar) {
        if (a(0)) {
            b L = kVar.L();
            if (L.P()) {
                t M = kVar.M();
                b M2 = M.M();
                if (!M2.P()) {
                    String valueOf = String.valueOf(M2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                    b(M2);
                    return;
                }
                this.n = true;
                this.o = M.L();
                this.p = M.N();
                this.q = M.O();
                d();
            } else if (a(L)) {
                f();
                d();
            } else {
                b(L);
            }
        }
    }

    private final void a(boolean z) {
        e eVar = this.k;
        if (eVar != null) {
            if (eVar.isConnected() && z) {
                this.k.e();
            }
            this.k.a();
            if (this.r.l()) {
                this.k = null;
            }
            this.o = null;
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(int i2) {
        if (this.g == i2) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f1309a.n.i());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GoogleApiClientConnecting", sb.toString());
        int i3 = this.h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GoogleApiClientConnecting", sb2.toString());
        String b2 = b(this.g);
        String b3 = b(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(b2).length() + 70 + String.valueOf(b3).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(b2);
        sb3.append(" but received callback for step ");
        sb3.append(b3);
        Log.wtf("GoogleApiClientConnecting", sb3.toString(), new Exception());
        b(new b(8, null));
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean a(b bVar) {
        return this.l && !bVar.O();
    }

    private static String b(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    public final void b(b bVar) {
        g();
        a(!bVar.O());
        this.f1309a.a(bVar);
        this.f1309a.o.a(bVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if ((r5.O() || r4.d.a(r5.L()) != null) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(b.c.b.a.b.b r5, com.google.android.gms.common.api.a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.c()
            int r0 = r0.a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.O()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            b.c.b.a.b.f r7 = r4.d
            int r3 = r5.L()
            android.content.Intent r7 = r7.a(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            b.c.b.a.b.b r7 = r4.e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.e = r5
            r4.f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.Q r7 = r4.f1309a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, b.c.b.a.b.b> r7 = r7.g
            com.google.android.gms.common.api.a$c r6 = r6.a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0173y.b(b.c.b.a.b.b, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    public final boolean c() {
        b bVar;
        this.h--;
        int i2 = this.h;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GoogleApiClientConnecting", this.f1309a.n.i());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            bVar = new b(8, null);
        } else {
            bVar = this.e;
            if (bVar == null) {
                return true;
            }
            this.f1309a.m = this.f;
        }
        b(bVar);
        return false;
    }

    /* access modifiers changed from: private */
    public final void d() {
        if (this.h == 0) {
            if (!this.m || this.n) {
                ArrayList arrayList = new ArrayList();
                this.g = 1;
                this.h = this.f1309a.f.size();
                for (a.c<?> cVar : this.f1309a.f.keySet()) {
                    if (!this.f1309a.g.containsKey(cVar)) {
                        arrayList.add(this.f1309a.f.get(cVar));
                    } else if (c()) {
                        e();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(U.a().submit(new E(this, arrayList)));
                }
            }
        }
    }

    private final void e() {
        this.f1309a.d();
        U.a().execute(new RunnableC0174z(this));
        e eVar = this.k;
        if (eVar != null) {
            if (this.p) {
                eVar.a(this.o, this.q);
            }
            a(false);
        }
        for (a.c<?> cVar : this.f1309a.g.keySet()) {
            this.f1309a.f.get(cVar).a();
        }
        this.f1309a.o.a(this.i.isEmpty() ? null : this.i);
    }

    /* access modifiers changed from: private */
    public final void f() {
        this.m = false;
        this.f1309a.n.q = Collections.emptySet();
        for (a.c<?> cVar : this.j) {
            if (!this.f1309a.g.containsKey(cVar)) {
                this.f1309a.g.put(cVar, new b(17, null));
            }
        }
    }

    private final void g() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Future<?> future = arrayList.get(i2);
            i2++;
            future.cancel(true);
        }
        this.u.clear();
    }

    /* access modifiers changed from: private */
    public final Set<Scope> h() {
        C0177c cVar = this.r;
        if (cVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(cVar.i());
        Map<a<?>, C0177c.b> f2 = this.r.f();
        for (a<?> aVar : f2.keySet()) {
            if (!this.f1309a.g.containsKey(aVar.a())) {
                hashSet.addAll(f2.get(aVar).f1362a);
            }
        }
        return hashSet;
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void a(b bVar, a<?> aVar, boolean z) {
        if (a(1)) {
            b(bVar, aVar, z);
            if (c()) {
                e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final boolean a() {
        g();
        a(true);
        this.f1309a.a((b) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void b() {
        this.f1309a.g.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (a<?> aVar : this.s.keySet()) {
            a.f fVar = this.f1309a.f.get(aVar.a());
            z |= aVar.c().a() == 1;
            boolean booleanValue = this.s.get(aVar).booleanValue();
            if (fVar.j()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(aVar.a());
                } else {
                    this.l = false;
                }
            }
            hashMap.put(fVar, new A(this, aVar, booleanValue));
        }
        if (z) {
            this.m = false;
        }
        if (this.m) {
            this.r.a(Integer.valueOf(System.identityHashCode(this.f1309a.n)));
            H h2 = new H(this, null);
            a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar2 = this.t;
            Context context = this.f1311c;
            Looper c2 = this.f1309a.n.c();
            C0177c cVar = this.r;
            this.k = (e) aVar2.a(context, c2, cVar, cVar.j(), h2, h2);
        }
        this.h = this.f1309a.f.size();
        this.u.add(U.a().submit(new B(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void connect() {
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void onConnected(Bundle bundle) {
        if (a(1)) {
            if (bundle != null) {
                this.i.putAll(bundle);
            }
            if (c()) {
                e();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void onConnectionSuspended(int i2) {
        b(new b(8, null));
    }
}
