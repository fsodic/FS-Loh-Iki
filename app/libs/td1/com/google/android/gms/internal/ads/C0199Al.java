package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* renamed from: com.google.android.gms.internal.ads.Al  reason: case insensitive filesystem */
public final class C0199Al {

    /* renamed from: a  reason: collision with root package name */
    private long f1547a;

    /* renamed from: b  reason: collision with root package name */
    private long f1548b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final Object f1549c = new Object();

    public C0199Al(long j) {
        this.f1547a = j;
    }

    public final void a(long j) {
        synchronized (this.f1549c) {
            this.f1547a = j;
        }
    }

    public final boolean a() {
        synchronized (this.f1549c) {
            long b2 = q.j().b();
            if (this.f1548b + this.f1547a > b2) {
                return false;
            }
            this.f1548b = b2;
            return true;
        }
    }
}
