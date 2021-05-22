package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.dk  reason: case insensitive filesystem */
public final class C1144dk {

    /* renamed from: a  reason: collision with root package name */
    private final Object f4136a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f4137b;

    /* renamed from: c  reason: collision with root package name */
    private volatile long f4138c;

    private C1144dk() {
        this.f4136a = new Object();
        this.f4137b = C1075ck.f4021a;
        this.f4138c = 0;
    }

    /* synthetic */ C1144dk(C0937ak akVar) {
        this();
    }

    public final void a() {
        long a2 = q.j().a();
        synchronized (this.f4136a) {
            if (this.f4137b == C1075ck.f4022b) {
                if (this.f4138c + ((Long) C2392voa.e().a(C2474x.Td)).longValue() <= a2) {
                    this.f4137b = C1075ck.f4021a;
                }
            }
        }
        long a3 = q.j().a();
        synchronized (this.f4136a) {
            if (this.f4137b == 2) {
                this.f4137b = 3;
                if (this.f4137b == C1075ck.f4022b) {
                    this.f4138c = a3;
                }
            }
        }
    }
}
