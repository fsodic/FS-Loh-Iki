package com.google.android.gms.internal.ads;

public final class _G {

    /* renamed from: a  reason: collision with root package name */
    private int f3703a = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f3704b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f3705c = 0;
    private long d = 0;
    private final Object e = new Object();
    private final Object f = new Object();
    private final Object g = new Object();
    private final Object h = new Object();

    public final int a() {
        int i;
        synchronized (this.e) {
            i = this.f3703a;
        }
        return i;
    }

    public final void a(int i) {
        synchronized (this.e) {
            this.f3703a = i;
        }
    }

    public final void a(long j) {
        synchronized (this.f) {
            this.f3704b = j;
        }
    }

    public final long b() {
        long j;
        synchronized (this.f) {
            j = this.f3704b;
        }
        return j;
    }

    public final synchronized void b(long j) {
        synchronized (this.h) {
            this.d = j;
        }
    }

    public final synchronized long c() {
        long j;
        synchronized (this.g) {
            j = this.f3705c;
        }
        return j;
    }

    public final synchronized void c(long j) {
        synchronized (this.g) {
            this.f3705c = j;
        }
    }

    public final synchronized long d() {
        long j;
        synchronized (this.h) {
            j = this.d;
        }
        return j;
    }
}
