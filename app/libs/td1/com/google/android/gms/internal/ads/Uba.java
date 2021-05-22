package com.google.android.gms.internal.ads;

public abstract class Uba {

    /* renamed from: a  reason: collision with root package name */
    int f3252a;

    /* renamed from: b  reason: collision with root package name */
    int f3253b;

    /* renamed from: c  reason: collision with root package name */
    int f3254c;
    _ba d;
    private boolean e;

    private Uba() {
        this.f3253b = 100;
        this.f3254c = Integer.MAX_VALUE;
        this.e = false;
    }

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static Uba a(byte[] bArr, int i, int i2, boolean z) {
        Wba wba = new Wba(bArr, i, i2, z);
        try {
            wba.c(i2);
            return wba;
        } catch (Bca e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract double a();

    public abstract void a(int i);

    public abstract float b();

    public abstract boolean b(int i);

    public abstract int c(int i);

    public abstract String c();

    public abstract int d();

    public abstract void d(int i);

    public abstract long e();

    public abstract long f();

    public abstract int g();

    public abstract long h();

    public abstract int i();

    public abstract boolean j();

    public abstract String k();

    public abstract Iba l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract boolean s();

    public abstract int t();
}
