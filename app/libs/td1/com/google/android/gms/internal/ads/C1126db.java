package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.db  reason: case insensitive filesystem */
public final class C1126db {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f4111a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<AbstractC0959b<?>> f4112b;

    /* renamed from: c  reason: collision with root package name */
    private final PriorityBlockingQueue<AbstractC0959b<?>> f4113c;
    private final PriorityBlockingQueue<AbstractC0959b<?>> d;
    private final Sha e;
    private final Poa f;
    private final AbstractC0763Wd g;
    private final C2048qoa[] h;
    private Tia i;
    private final List<AbstractC1059cc> j;
    private final List<AbstractC0190Ac> k;

    public C1126db(Sha sha, Poa poa) {
        this(sha, poa, 4);
    }

    private C1126db(Sha sha, Poa poa, int i2) {
        this(sha, poa, 4, new C2044qma(new Handler(Looper.getMainLooper())));
    }

    private C1126db(Sha sha, Poa poa, int i2, AbstractC0763Wd wd) {
        this.f4111a = new AtomicInteger();
        this.f4112b = new HashSet();
        this.f4113c = new PriorityBlockingQueue<>();
        this.d = new PriorityBlockingQueue<>();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = sha;
        this.f = poa;
        this.h = new C2048qoa[4];
        this.g = wd;
    }

    public final <T> AbstractC0959b<T> a(AbstractC0959b<T> bVar) {
        bVar.a(this);
        synchronized (this.f4112b) {
            this.f4112b.add(bVar);
        }
        bVar.b(this.f4111a.incrementAndGet());
        bVar.a("add-to-queue");
        a(bVar, 0);
        (!bVar.i() ? this.d : this.f4113c).add(bVar);
        return bVar;
    }

    public final void a() {
        Tia tia = this.i;
        if (tia != null) {
            tia.a();
        }
        C2048qoa[] qoaArr = this.h;
        for (C2048qoa qoa : qoaArr) {
            if (qoa != null) {
                qoa.a();
            }
        }
        this.i = new Tia(this.f4113c, this.d, this.e, this.g);
        this.i.start();
        for (int i2 = 0; i2 < this.h.length; i2++) {
            C2048qoa qoa2 = new C2048qoa(this.d, this.f, this.e, this.g);
            this.h[i2] = qoa2;
            qoa2.start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(AbstractC0959b<?> bVar, int i2) {
        synchronized (this.k) {
            for (AbstractC0190Ac ac : this.k) {
                ac.a(bVar, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final <T> void b(AbstractC0959b<T> bVar) {
        synchronized (this.f4112b) {
            this.f4112b.remove(bVar);
        }
        synchronized (this.j) {
            for (AbstractC1059cc ccVar : this.j) {
                ccVar.a(bVar);
            }
        }
        a(bVar, 5);
    }
}
