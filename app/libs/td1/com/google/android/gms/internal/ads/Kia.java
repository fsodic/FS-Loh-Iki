package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class Kia {

    /* renamed from: a  reason: collision with root package name */
    public C2449wia f2424a;

    /* renamed from: b  reason: collision with root package name */
    public long f2425b;

    /* renamed from: c  reason: collision with root package name */
    public long f2426c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public Hia o;
    public int p;
    public Dka q;
    public boolean r;
    public long s;

    Kia() {
    }

    public final void a(int i2) {
        Dka dka = this.q;
        if (dka == null || dka.c() < i2) {
            this.q = new Dka(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public final long b(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }
}
