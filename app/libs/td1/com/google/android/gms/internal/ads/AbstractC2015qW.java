package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1120dW;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qW  reason: case insensitive filesystem */
public abstract class AbstractC2015qW<OutputT> extends C1120dW.j<OutputT> {
    private static final b h;
    private static final Logger i = Logger.getLogger(AbstractC2015qW.class.getName());
    private volatile Set<Throwable> j = null;
    private volatile int k;

    /* renamed from: com.google.android.gms.internal.ads.qW$a */
    static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicReferenceFieldUpdater<AbstractC2015qW, Set<Throwable>> f5319a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<AbstractC2015qW> f5320b;

        a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f5319a = atomicReferenceFieldUpdater;
            this.f5320b = atomicIntegerFieldUpdater;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.AbstractC2015qW.b
        public final int a(AbstractC2015qW qWVar) {
            return this.f5320b.decrementAndGet(qWVar);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.AbstractC2015qW.b
        public final void a(AbstractC2015qW qWVar, Set<Throwable> set, Set<Throwable> set2) {
            this.f5319a.compareAndSet(qWVar, null, set2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.qW$b */
    public static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract int a(AbstractC2015qW qWVar);

        /* access modifiers changed from: package-private */
        public abstract void a(AbstractC2015qW qWVar, Set<Throwable> set, Set<Throwable> set2);
    }

    /* renamed from: com.google.android.gms.internal.ads.qW$c */
    static final class c extends b {
        private c() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.AbstractC2015qW.b
        public final int a(AbstractC2015qW qWVar) {
            int b2;
            synchronized (qWVar) {
                b2 = AbstractC2015qW.b(qWVar);
            }
            return b2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.AbstractC2015qW.b
        public final void a(AbstractC2015qW qWVar, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (qWVar) {
                if (qWVar.j == null) {
                    qWVar.j = set2;
                }
            }
        }
    }

    static {
        Throwable th;
        b bVar;
        try {
            bVar = new a(AtomicReferenceFieldUpdater.newUpdater(AbstractC2015qW.class, Set.class, "j"), AtomicIntegerFieldUpdater.newUpdater(AbstractC2015qW.class, "k"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            bVar = new c();
        }
        h = bVar;
        if (th != null) {
            i.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    AbstractC2015qW(int i2) {
        this.k = i2;
    }

    static /* synthetic */ int b(AbstractC2015qW qWVar) {
        int i2 = qWVar.k - 1;
        qWVar.k = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Set<Throwable> set);

    /* access modifiers changed from: package-private */
    public final Set<Throwable> h() {
        Set<Throwable> set = this.j;
        if (set != null) {
            return set;
        }
        Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        a(newSetFromMap);
        h.a(this, null, newSetFromMap);
        return this.j;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return h.a(this);
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        this.j = null;
    }
}
