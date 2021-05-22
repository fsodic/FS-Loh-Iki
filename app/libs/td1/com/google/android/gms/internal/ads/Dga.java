package com.google.android.gms.internal.ads;

import android.util.Log;

final class Dga {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2175sja f1794a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1795b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1796c;
    public final Eja[] d;
    private final boolean[] e;
    public final long f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Dga l;
    public C0938aka m;
    private final Mga[] n;
    private final Pga[] o;
    private final Zja p;
    private final Lga q;
    private final AbstractC2382vja r;
    private C0938aka s;

    public Dga(Mga[] mgaArr, Pga[] pgaArr, long j2, Zja zja, Lga lga, AbstractC2382vja vja, Object obj, int i2, int i3, boolean z, long j3) {
        this.n = mgaArr;
        this.o = pgaArr;
        this.f = j2;
        this.p = zja;
        this.q = lga;
        this.r = vja;
        C2453wka.a(obj);
        this.f1795b = obj;
        this.f1796c = i2;
        this.g = i3;
        this.i = z;
        this.h = j3;
        this.d = new Eja[mgaArr.length];
        this.e = new boolean[mgaArr.length];
        this.f1794a = vja.a(i3, lga.c());
    }

    public final long a(long j2, boolean z) {
        return a(j2, false, new boolean[this.n.length]);
    }

    public final long a(long j2, boolean z, boolean[] zArr) {
        _ja _ja = this.m.f3835b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= _ja.f3749a) {
                break;
            }
            boolean[] zArr2 = this.e;
            if (z || !this.m.a(this.s, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long a2 = this.f1794a.a(_ja.a(), this.e, this.d, zArr, j2);
        this.s = this.m;
        this.k = false;
        int i3 = 0;
        while (true) {
            Eja[] ejaArr = this.d;
            if (i3 < ejaArr.length) {
                if (ejaArr[i3] != null) {
                    C2453wka.b(_ja.a(i3) != null);
                    this.k = true;
                } else {
                    C2453wka.b(_ja.a(i3) == null);
                }
                i3++;
            } else {
                this.q.a(this.n, this.m.f3834a, _ja);
                return a2;
            }
        }
    }

    public final void a() {
        try {
            this.r.a(this.f1794a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }

    public final void a(int i2, boolean z) {
        this.g = i2;
        this.i = z;
    }

    public final long b() {
        return this.f - this.h;
    }

    public final boolean c() {
        if (this.j) {
            return !this.k || this.f1794a.c() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.Zja r0 = r6.p
            com.google.android.gms.internal.ads.Pga[] r1 = r6.o
            com.google.android.gms.internal.ads.sja r2 = r6.f1794a
            com.google.android.gms.internal.ads.Lja r2 = r2.e()
            com.google.android.gms.internal.ads.aka r0 = r0.a(r1, r2)
            com.google.android.gms.internal.ads.aka r1 = r6.s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            com.google.android.gms.internal.ads._ja r5 = r0.f3835b
            int r5 = r5.f3749a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Dga.d():boolean");
    }
}
