package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

/* renamed from: com.google.android.gms.internal.ads.nR  reason: case insensitive filesystem */
public final class C1803nR {

    /* renamed from: a  reason: collision with root package name */
    private final d f5041a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f5042b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile int f5043c = C1734mR.f4945a;
    private volatile long d = 0;

    public C1803nR(d dVar) {
        this.f5041a = dVar;
    }

    private final void a(int i, int i2) {
        d();
        long a2 = this.f5041a.a();
        synchronized (this.f5042b) {
            if (this.f5043c == i) {
                this.f5043c = i2;
                if (this.f5043c == C1734mR.f4947c) {
                    this.d = a2;
                }
            }
        }
    }

    private final void d() {
        long a2 = this.f5041a.a();
        synchronized (this.f5042b) {
            if (this.f5043c == C1734mR.f4947c) {
                if (this.d + ((Long) C2392voa.e().a(C2474x.Td)).longValue() <= a2) {
                    this.f5043c = C1734mR.f4945a;
                }
            }
        }
    }

    public final void a(boolean z) {
        int i;
        int i2;
        if (z) {
            i = C1734mR.f4945a;
            i2 = C1734mR.f4946b;
        } else {
            i = C1734mR.f4946b;
            i2 = C1734mR.f4945a;
        }
        a(i, i2);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f5042b) {
            d();
            z = this.f5043c == C1734mR.f4946b;
        }
        return z;
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f5042b) {
            d();
            z = this.f5043c == C1734mR.f4947c;
        }
        return z;
    }

    public final void c() {
        a(C1734mR.f4946b, C1734mR.f4947c);
    }
}
