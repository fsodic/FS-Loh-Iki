package com.google.android.gms.internal.ads;

final class Bja {

    /* renamed from: a  reason: collision with root package name */
    private int f1642a = 1000;

    /* renamed from: b  reason: collision with root package name */
    private int[] f1643b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f1644c;
    private int[] d;
    private int[] e;
    private long[] f;
    private _ha[] g;
    private Hga[] h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private Hga q;

    public Bja() {
        int i2 = this.f1642a;
        this.f1643b = new int[i2];
        this.f1644c = new long[i2];
        this.f = new long[i2];
        this.e = new int[i2];
        this.d = new int[i2];
        this.g = new _ha[i2];
        this.h = new Hga[i2];
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
        this.p = true;
        this.o = true;
    }

    public final synchronized int a(Jga jga, Eha eha, boolean z, boolean z2, Hga hga, Aja aja) {
        if (!e()) {
            if (z2) {
                eha.a(4);
                return -4;
            } else if (this.q == null || (!z && this.q == hga)) {
                return -3;
            } else {
                jga.f2341a = this.q;
                return -5;
            }
        } else if (z || this.h[this.k] != hga) {
            jga.f2341a = this.h[this.k];
            return -5;
        } else {
            if (eha.f1886c == null) {
                return -3;
            }
            eha.d = this.f[this.k];
            eha.a(this.e[this.k]);
            aja.f1542a = this.d[this.k];
            aja.f1543b = this.f1644c[this.k];
            aja.d = this.g[this.k];
            this.m = Math.max(this.m, eha.d);
            this.i--;
            this.k++;
            this.j++;
            if (this.k == this.f1642a) {
                this.k = 0;
            }
            aja.f1544c = this.i > 0 ? this.f1644c[this.k] : aja.f1543b + ((long) aja.f1542a);
            return -4;
        }
    }

    public final synchronized long a() {
        return Math.max(this.m, this.n);
    }

    public final synchronized long a(long j2, boolean z) {
        if (e()) {
            if (j2 >= this.f[this.k]) {
                if (j2 > this.n && !z) {
                    return -1;
                }
                int i2 = this.k;
                int i3 = -1;
                int i4 = 0;
                while (i2 != this.l && this.f[i2] <= j2) {
                    if ((this.e[i2] & 1) != 0) {
                        i3 = i4;
                    }
                    i2 = (i2 + 1) % this.f1642a;
                    i4++;
                }
                if (i3 == -1) {
                    return -1;
                }
                this.k = (this.k + i3) % this.f1642a;
                this.j += i3;
                this.i -= i3;
                return this.f1644c[this.k];
            }
        }
        return -1;
    }

    public final synchronized void a(long j2) {
        this.n = Math.max(this.n, j2);
    }

    public final synchronized void a(long j2, int i2, long j3, int i3, _ha _ha) {
        if (this.o) {
            if ((i2 & 1) != 0) {
                this.o = false;
            } else {
                return;
            }
        }
        C2453wka.b(!this.p);
        a(j2);
        this.f[this.l] = j2;
        this.f1644c[this.l] = j3;
        this.d[this.l] = i3;
        this.e[this.l] = i2;
        this.g[this.l] = _ha;
        this.h[this.l] = this.q;
        this.f1643b[this.l] = 0;
        this.i++;
        if (this.i == this.f1642a) {
            int i4 = this.f1642a + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            _ha[] _haArr = new _ha[i4];
            Hga[] hgaArr = new Hga[i4];
            int i5 = this.f1642a - this.k;
            System.arraycopy(this.f1644c, this.k, jArr, 0, i5);
            System.arraycopy(this.f, this.k, jArr2, 0, i5);
            System.arraycopy(this.e, this.k, iArr2, 0, i5);
            System.arraycopy(this.d, this.k, iArr3, 0, i5);
            System.arraycopy(this.g, this.k, _haArr, 0, i5);
            System.arraycopy(this.h, this.k, hgaArr, 0, i5);
            System.arraycopy(this.f1643b, this.k, iArr, 0, i5);
            int i6 = this.k;
            System.arraycopy(this.f1644c, 0, jArr, i5, i6);
            System.arraycopy(this.f, 0, jArr2, i5, i6);
            System.arraycopy(this.e, 0, iArr2, i5, i6);
            System.arraycopy(this.d, 0, iArr3, i5, i6);
            System.arraycopy(this.g, 0, _haArr, i5, i6);
            System.arraycopy(this.h, 0, hgaArr, i5, i6);
            System.arraycopy(this.f1643b, 0, iArr, i5, i6);
            this.f1644c = jArr;
            this.f = jArr2;
            this.e = iArr2;
            this.d = iArr3;
            this.g = _haArr;
            this.h = hgaArr;
            this.f1643b = iArr;
            this.k = 0;
            this.l = this.f1642a;
            this.i = this.f1642a;
            this.f1642a = i4;
            return;
        }
        this.l++;
        if (this.l == this.f1642a) {
            this.l = 0;
        }
    }

    public final synchronized boolean a(Hga hga) {
        if (hga == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (Jka.a(hga, this.q)) {
            return false;
        }
        this.q = hga;
        return true;
    }

    public final void b() {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.i = 0;
        this.o = true;
    }

    public final void c() {
        this.m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int d() {
        return this.j + this.i;
    }

    public final synchronized boolean e() {
        return this.i != 0;
    }

    public final synchronized Hga f() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long g() {
        if (!e()) {
            return -1;
        }
        int i2 = ((this.k + this.i) - 1) % this.f1642a;
        this.k = (this.k + this.i) % this.f1642a;
        this.j += this.i;
        this.i = 0;
        return this.f1644c[i2] + ((long) this.d[i2]);
    }
}
