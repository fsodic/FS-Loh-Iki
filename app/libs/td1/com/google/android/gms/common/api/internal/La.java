package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b.c.b.a.b.b;
import b.c.b.a.b.f;
import b.c.b.a.g.e;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.C0177c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class La implements AbstractC0147fa {

    /* renamed from: a  reason: collision with root package name */
    private final Map<a.c<?>, Ka<?>> f1224a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<a.c<?>, Ka<?>> f1225b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<a<?>, Boolean> f1226c;
    private final C0146f d;
    private final K e;
    private final Lock f;
    private final Looper g;
    private final f h;
    private final Condition i;
    private final C0177c j;
    private final boolean k;
    private final boolean l;
    private final Queue<AbstractC0140c<?, ?>> m = new LinkedList();
    private boolean n;
    private Map<za<?>, b> o;
    private Map<za<?>, b> p;
    private C0165p q;
    private b r;

    public La(Context context, Lock lock, Looper looper, f fVar, Map<a.c<?>, a.f> map, C0177c cVar, Map<a<?>, Boolean> map2, a.AbstractC0025a<? extends e, b.c.b.a.g.a> aVar, ArrayList<Ea> arrayList, K k2, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f = lock;
        this.g = looper;
        this.i = lock.newCondition();
        this.h = fVar;
        this.e = k2;
        this.f1226c = map2;
        this.j = cVar;
        this.k = z;
        HashMap hashMap = new HashMap();
        for (a<?> aVar2 : map2.keySet()) {
            hashMap.put(aVar2.a(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Ea ea = arrayList.get(i2);
            i2++;
            Ea ea2 = ea;
            hashMap2.put(ea2.f1207a, ea2);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        for (Map.Entry<a.c<?>, a.f> entry : map.entrySet()) {
            a aVar3 = (a) hashMap.get(entry.getKey());
            a.f value = entry.getValue();
            if (value.f()) {
                if (!this.f1226c.get(aVar3).booleanValue()) {
                    z3 = z7;
                    z4 = true;
                } else {
                    z3 = z7;
                    z4 = z8;
                }
                z2 = true;
            } else {
                z2 = z6;
                z4 = z8;
                z3 = false;
            }
            Ka<?> ka = new Ka<>(context, aVar3, looper, value, (Ea) hashMap2.get(aVar3), cVar, aVar);
            this.f1224a.put(entry.getKey(), ka);
            if (value.j()) {
                this.f1225b.put(entry.getKey(), ka);
            }
            z8 = z4;
            z7 = z3;
            z6 = z2;
        }
        this.l = (!z6 || z7 || z8) ? false : z5;
        this.d = C0146f.a();
    }

    private final b a(a.c<?> cVar) {
        this.f.lock();
        try {
            Ka<?> ka = this.f1224a.get(cVar);
            if (this.o != null && ka != null) {
                return this.o.get(ka.e());
            }
            this.f.unlock();
            return null;
        } finally {
            this.f.unlock();
        }
    }

    /* access modifiers changed from: private */
    public final boolean a(Ka<?> ka, b bVar) {
        return !bVar.P() && !bVar.O() && this.f1226c.get(ka.b()).booleanValue() && ka.f().f() && this.h.c(bVar.L());
    }

    private final <T extends AbstractC0140c<? extends i, ? extends a.b>> boolean b(T t) {
        a.c<?> h2 = t.h();
        b a2 = a(h2);
        if (a2 == null || a2.L() != 4) {
            return false;
        }
        t.a(new Status(4, null, this.d.a(this.f1224a.get(h2).e(), System.identityHashCode(this.e))));
        return true;
    }

    /* access modifiers changed from: private */
    public final void c() {
        Set<Scope> hashSet;
        K k2;
        C0177c cVar = this.j;
        if (cVar == null) {
            k2 = this.e;
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet<>(cVar.i());
            Map<a<?>, C0177c.b> f2 = this.j.f();
            for (a<?> aVar : f2.keySet()) {
                b a2 = a(aVar);
                if (a2 != null && a2.P()) {
                    hashSet.addAll(f2.get(aVar).f1362a);
                }
            }
            k2 = this.e;
        }
        k2.q = hashSet;
    }

    /* access modifiers changed from: private */
    public final void d() {
        while (!this.m.isEmpty()) {
            a(this.m.remove());
        }
        this.e.a((Bundle) null);
    }

    /* access modifiers changed from: private */
    public final b e() {
        b bVar = null;
        b bVar2 = null;
        int i2 = 0;
        int i3 = 0;
        for (Ka<?> ka : this.f1224a.values()) {
            a<?> b2 = ka.b();
            b bVar3 = this.o.get(ka.e());
            if (!bVar3.P() && (!this.f1226c.get(b2).booleanValue() || bVar3.O() || this.h.c(bVar3.L()))) {
                if (bVar3.L() != 4 || !this.k) {
                    int a2 = b2.c().a();
                    if (bVar == null || i2 > a2) {
                        bVar = bVar3;
                        i2 = a2;
                    }
                } else {
                    int a3 = b2.c().a();
                    if (bVar2 == null || i3 > a3) {
                        bVar2 = bVar3;
                        i3 = a3;
                    }
                }
            }
        }
        return (bVar == null || bVar2 == null || i2 <= i3) ? bVar : bVar2;
    }

    public final b a(a<?> aVar) {
        return a(aVar.a());
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        a.c<A> h2 = t.h();
        if (this.k && b(t)) {
            return t;
        }
        this.e.y.a(t);
        this.f1224a.get(h2).a(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void a() {
        this.f.lock();
        try {
            this.n = false;
            this.o = null;
            this.p = null;
            if (this.q == null) {
                this.r = null;
                while (!this.m.isEmpty()) {
                    AbstractC0140c<?, ?> remove = this.m.remove();
                    remove.a((va) null);
                    remove.a();
                }
                this.i.signalAll();
                return;
            }
            this.q.a();
            throw null;
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void b() {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final void connect() {
        this.f.lock();
        try {
            if (!this.n) {
                this.n = true;
                this.o = null;
                this.p = null;
                this.q = null;
                this.r = null;
                this.d.e();
                this.d.a(this.f1224a.values()).a(new com.google.android.gms.common.util.a.a(this.g), new Na(this));
            }
        } finally {
            this.f.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0147fa
    public final boolean isConnected() {
        this.f.lock();
        try {
            return this.o != null && this.r == null;
        } finally {
            this.f.unlock();
        }
    }
}
