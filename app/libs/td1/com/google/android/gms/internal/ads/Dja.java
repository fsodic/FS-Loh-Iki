package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public final class Dja implements Xha {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1076cka f1804a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1805b;

    /* renamed from: c  reason: collision with root package name */
    private final Bja f1806c = new Bja();
    private final Aja d = new Aja();
    private final Dka e = new Dka(32);
    private final AtomicInteger f = new AtomicInteger();
    private Cja g;
    private Cja h;
    private Hga i;
    private boolean j;
    private Hga k;
    private long l;
    private int m;
    private Fja n;

    public Dja(AbstractC1076cka cka) {
        this.f1804a = cka;
        this.f1805b = cka.b();
        int i2 = this.f1805b;
        this.m = i2;
        this.g = new Cja(0, i2);
        this.h = this.g;
    }

    private final int a(int i2) {
        if (this.m == this.f1805b) {
            this.m = 0;
            Cja cja = this.h;
            if (cja.f1720c) {
                this.h = cja.e;
            }
            Cja cja2 = this.h;
            C1145dka a2 = this.f1804a.a();
            Cja cja3 = new Cja(this.h.f1719b, this.f1805b);
            cja2.d = a2;
            cja2.e = cja3;
            cja2.f1720c = true;
        }
        return Math.min(i2, this.f1805b - this.m);
    }

    private final void a(long j2) {
        while (true) {
            Cja cja = this.g;
            if (j2 >= cja.f1719b) {
                this.f1804a.a(cja.d);
                this.g = this.g.a();
            } else {
                return;
            }
        }
    }

    private final void a(long j2, byte[] bArr, int i2) {
        a(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.g.f1718a);
            int min = Math.min(i2 - i3, this.f1805b - i4);
            C1145dka dka = this.g.d;
            System.arraycopy(dka.f4139a, dka.a(i4), bArr, i3, min);
            j2 += (long) min;
            i3 += min;
            if (j2 == this.g.f1719b) {
                this.f1804a.a(dka);
                this.g = this.g.a();
            }
        }
    }

    private final void g() {
        this.f1806c.b();
        Cja cja = this.g;
        if (cja.f1720c) {
            Cja cja2 = this.h;
            C1145dka[] dkaArr = new C1145dka[((cja2.f1720c ? 1 : 0) + (((int) (cja2.f1718a - cja.f1718a)) / this.f1805b))];
            for (int i2 = 0; i2 < dkaArr.length; i2++) {
                dkaArr[i2] = cja.d;
                cja = cja.a();
            }
            this.f1804a.a(dkaArr);
        }
        this.g = new Cja(0, this.f1805b);
        this.h = this.g;
        this.l = 0;
        this.m = this.f1805b;
        this.f1804a.f();
    }

    private final boolean h() {
        return this.f.compareAndSet(0, 1);
    }

    private final void i() {
        if (!this.f.compareAndSet(1, 0)) {
            g();
        }
    }

    public final int a(Jga jga, Eha eha, boolean z, boolean z2, long j2) {
        int i2;
        int a2 = this.f1806c.a(jga, eha, z, z2, this.i, this.d);
        if (a2 == -5) {
            this.i = jga.f2341a;
            return -5;
        } else if (a2 == -4) {
            if (!eha.c()) {
                if (eha.d < j2) {
                    eha.b(Integer.MIN_VALUE);
                }
                if (eha.e()) {
                    Aja aja = this.d;
                    long j3 = aja.f1543b;
                    this.e.a(1);
                    a(j3, this.e.f1807a, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.e.f1807a[0];
                    boolean z3 = (b2 & 128) != 0;
                    int i3 = b2 & Byte.MAX_VALUE;
                    Aha aha = eha.f1885b;
                    if (aha.f1538a == null) {
                        aha.f1538a = new byte[16];
                    }
                    a(j4, eha.f1885b.f1538a, i3);
                    long j5 = j4 + ((long) i3);
                    if (z3) {
                        this.e.a(2);
                        a(j5, this.e.f1807a, 2);
                        j5 += 2;
                        i2 = this.e.h();
                    } else {
                        i2 = 1;
                    }
                    int[] iArr = eha.f1885b.d;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = eha.f1885b.e;
                    if (iArr2 == null || iArr2.length < i2) {
                        iArr2 = new int[i2];
                    }
                    if (z3) {
                        int i4 = i2 * 6;
                        this.e.a(i4);
                        a(j5, this.e.f1807a, i4);
                        j5 += (long) i4;
                        this.e.c(0);
                        for (int i5 = 0; i5 < i2; i5++) {
                            iArr[i5] = this.e.h();
                            iArr2[i5] = this.e.o();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = aja.f1542a - ((int) (j5 - aja.f1543b));
                    }
                    _ha _ha = aja.d;
                    Aha aha2 = eha.f1885b;
                    aha2.a(i2, iArr, iArr2, _ha.f3739b, aha2.f1538a, _ha.f3738a);
                    long j6 = aja.f1543b;
                    int i6 = (int) (j5 - j6);
                    aja.f1543b = j6 + ((long) i6);
                    aja.f1542a -= i6;
                }
                eha.d(this.d.f1542a);
                Aja aja2 = this.d;
                long j7 = aja2.f1543b;
                ByteBuffer byteBuffer = eha.f1886c;
                int i7 = aja2.f1542a;
                a(j7);
                while (i7 > 0) {
                    int i8 = (int) (j7 - this.g.f1718a);
                    int min = Math.min(i7, this.f1805b - i8);
                    C1145dka dka = this.g.d;
                    byteBuffer.put(dka.f4139a, dka.a(i8), min);
                    j7 += (long) min;
                    i7 -= min;
                    if (j7 == this.g.f1719b) {
                        this.f1804a.a(dka);
                        this.g = this.g.a();
                    }
                }
                a(this.d.f1544c);
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.Xha
    public final int a(Oha oha, int i2, boolean z) {
        if (!h()) {
            int c2 = oha.c(i2);
            if (c2 != -1) {
                return c2;
            }
            throw new EOFException();
        }
        try {
            int a2 = a(i2);
            C1145dka dka = this.h.d;
            int read = oha.read(dka.f4139a, dka.a(this.m), a2);
            if (read != -1) {
                this.m += read;
                this.l += (long) read;
                return read;
            }
            throw new EOFException();
        } finally {
            i();
        }
    }

    public final void a() {
        if (this.f.getAndSet(2) == 0) {
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.Xha
    public final void a(long j2, int i2, int i3, int i4, _ha _ha) {
        if (!h()) {
            this.f1806c.a(j2);
            return;
        }
        try {
            this.f1806c.a(j2, i2, (this.l - ((long) i3)) - ((long) i4), i3, _ha);
        } finally {
            i();
        }
    }

    @Override // com.google.android.gms.internal.ads.Xha
    public final void a(Dka dka, int i2) {
        if (!h()) {
            dka.d(i2);
            return;
        }
        while (i2 > 0) {
            int a2 = a(i2);
            C1145dka dka2 = this.h.d;
            dka.a(dka2.f4139a, dka2.a(this.m), a2);
            this.m += a2;
            this.l += (long) a2;
            i2 -= a2;
        }
        i();
    }

    public final void a(Fja fja) {
        this.n = fja;
    }

    @Override // com.google.android.gms.internal.ads.Xha
    public final void a(Hga hga) {
        Hga hga2 = hga == null ? null : hga;
        boolean a2 = this.f1806c.a(hga2);
        this.k = hga;
        this.j = false;
        Fja fja = this.n;
        if (fja != null && a2) {
            fja.a(hga2);
        }
    }

    public final void a(boolean z) {
        int andSet = this.f.getAndSet(z ? 0 : 2);
        g();
        this.f1806c.c();
        if (andSet == 2) {
            this.i = null;
        }
    }

    public final boolean a(long j2, boolean z) {
        long a2 = this.f1806c.a(j2, z);
        if (a2 == -1) {
            return false;
        }
        a(a2);
        return true;
    }

    public final long b() {
        return this.f1806c.a();
    }

    public final int c() {
        return this.f1806c.d();
    }

    public final boolean d() {
        return this.f1806c.e();
    }

    public final Hga e() {
        return this.f1806c.f();
    }

    public final void f() {
        long g2 = this.f1806c.g();
        if (g2 != -1) {
            a(g2);
        }
    }
}
