package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;

final class Aga implements Handler.Callback, AbstractC2106rja, AbstractC2313uja, AbstractC1007bka {
    private int A;
    private Fga B;
    private long C;
    private Dga D;
    private Dga E;
    private Dga F;
    private Sga G;

    /* renamed from: a  reason: collision with root package name */
    private final Mga[] f1532a;

    /* renamed from: b  reason: collision with root package name */
    private final Pga[] f1533b;

    /* renamed from: c  reason: collision with root package name */
    private final Zja f1534c;
    private final Lga d;
    private final Ika e;
    private final Handler f;
    private final HandlerThread g;
    private final Handler h;
    private final AbstractC2376vga i;
    private final Tga j;
    private final Uga k;
    private Cga l;
    private Nga m;
    private Mga n;
    private Aka o;
    private AbstractC2382vja p;
    private Mga[] q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private int w = 0;
    private int x;
    private int y;
    private long z;

    public Aga(Mga[] mgaArr, Zja zja, Lga lga, boolean z2, int i2, Handler handler, Cga cga, AbstractC2376vga vga) {
        this.f1532a = mgaArr;
        this.f1534c = zja;
        this.d = lga;
        this.s = z2;
        this.h = handler;
        this.v = 1;
        this.l = cga;
        this.i = vga;
        this.f1533b = new Pga[mgaArr.length];
        for (int i3 = 0; i3 < mgaArr.length; i3++) {
            mgaArr[i3].setIndex(i3);
            this.f1533b[i3] = mgaArr[i3].v();
        }
        this.e = new Ika();
        this.q = new Mga[0];
        this.j = new Tga();
        this.k = new Uga();
        zja.a((AbstractC1007bka) this);
        this.m = Nga.f2682a;
        this.g = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.g.start();
        this.f = new Handler(this.g.getLooper(), this);
    }

    private final int a(int i2, Sga sga, Sga sga2) {
        int c2 = sga.c();
        int i3 = i2;
        int i4 = -1;
        for (int i5 = 0; i5 < c2 && i4 == -1; i5++) {
            i3 = sga.a(i3, this.k, this.j, this.w);
            i4 = sga2.a(sga.a(i3, this.k, true).f3267b);
        }
        return i4;
    }

    private final long a(int i2, long j2) {
        Dga dga;
        e();
        this.t = false;
        a(2);
        Dga dga2 = this.F;
        if (dga2 == null) {
            Dga dga3 = this.D;
            if (dga3 != null) {
                dga3.a();
            }
            dga = null;
        } else {
            dga = null;
            while (dga2 != null) {
                if (dga2.g != i2 || !dga2.j) {
                    dga2.a();
                } else {
                    dga = dga2;
                }
                dga2 = dga2.l;
            }
        }
        Dga dga4 = this.F;
        if (!(dga4 == dga && dga4 == this.E)) {
            for (Mga mga : this.q) {
                mga.z();
            }
            this.q = new Mga[0];
            this.o = null;
            this.n = null;
            this.F = null;
        }
        if (dga != null) {
            dga.l = null;
            this.D = dga;
            this.E = dga;
            b(dga);
            Dga dga5 = this.F;
            if (dga5.k) {
                j2 = dga5.f1794a.b(j2);
            }
            a(j2);
            i();
        } else {
            this.D = null;
            this.E = null;
            this.F = null;
            a(j2);
        }
        this.f.sendEmptyMessage(2);
        return j2;
    }

    private final Pair<Integer, Long> a(Fga fga) {
        Sga sga = fga.f1979a;
        if (sga.a()) {
            sga = this.G;
        }
        try {
            Pair<Integer, Long> b2 = b(sga, fga.f1980b, fga.f1981c);
            Sga sga2 = this.G;
            if (sga2 == sga) {
                return b2;
            }
            int a2 = sga2.a(sga.a(((Integer) b2.first).intValue(), this.k, true).f3267b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), (Long) b2.second);
            }
            int a3 = a(((Integer) b2.first).intValue(), sga, this.G);
            if (a3 == -1) {
                return null;
            }
            this.G.a(a3, this.k, false);
            return b(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new Iga(this.G, fga.f1980b, fga.f1981c);
        }
    }

    private final Pair<Integer, Long> a(Sga sga, int i2, long j2, long j3) {
        C2453wka.a(i2, 0, sga.b());
        sga.a(i2, this.j, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = this.j.h;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        long j4 = this.j.j + j2;
        long j5 = sga.a(0, this.k, false).d;
        if (j5 != -9223372036854775807L) {
            int i3 = (j4 > j5 ? 1 : (j4 == j5 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j4));
    }

    private final void a(int i2) {
        if (this.v != i2) {
            this.v = i2;
            this.h.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    private final void a(long j2) {
        Dga dga = this.F;
        this.C = j2 + (dga == null ? 60000000 : dga.b());
        this.e.a(this.C);
        for (Mga mga : this.q) {
            mga.a(this.C);
        }
    }

    private final void a(long j2, long j3) {
        this.f.removeMessages(2);
        long elapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f.sendEmptyMessage(2);
        } else {
            this.f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private static void a(Dga dga) {
        while (dga != null) {
            dga.a();
            dga = dga.l;
        }
    }

    private static void a(Mga mga) {
        if (mga.getState() == 2) {
            mga.stop();
        }
    }

    private final void a(Object obj, int i2) {
        this.l = new Cga(0, 0);
        b(obj, i2);
        this.l = new Cga(0, -9223372036854775807L);
        a(4);
        c(false);
    }

    private final void a(boolean[] zArr, int i2) {
        this.q = new Mga[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Mga[] mgaArr = this.f1532a;
            if (i3 < mgaArr.length) {
                Mga mga = mgaArr[i3];
                Yja a2 = this.F.m.f3835b.a(i3);
                if (a2 != null) {
                    int i5 = i4 + 1;
                    this.q[i4] = mga;
                    if (mga.getState() == 0) {
                        Oga oga = this.F.m.d[i3];
                        boolean z2 = this.s && this.v == 3;
                        boolean z3 = !zArr[i3] && z2;
                        Hga[] hgaArr = new Hga[a2.length()];
                        for (int i6 = 0; i6 < hgaArr.length; i6++) {
                            hgaArr[i6] = a2.b(i6);
                        }
                        Dga dga = this.F;
                        mga.a(oga, hgaArr, dga.d[i3], this.C, z3, dga.b());
                        Aka w2 = mga.w();
                        if (w2 != null) {
                            if (this.o == null) {
                                this.o = w2;
                                this.n = mga;
                                this.o.a(this.m);
                            } else {
                                throw C2169sga.a(new IllegalStateException("Multiple renderer media clocks enabled."));
                            }
                        }
                        if (z2) {
                            mga.start();
                        }
                    }
                    i4 = i5;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    private final Pair<Integer, Long> b(int i2, long j2) {
        return b(this.G, i2, -9223372036854775807L);
    }

    private final Pair<Integer, Long> b(Sga sga, int i2, long j2) {
        return a(sga, i2, j2, 0);
    }

    private final void b(Dga dga) {
        if (this.F != dga) {
            boolean[] zArr = new boolean[this.f1532a.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                Mga[] mgaArr = this.f1532a;
                if (i2 < mgaArr.length) {
                    Mga mga = mgaArr[i2];
                    zArr[i2] = mga.getState() != 0;
                    Yja a2 = dga.m.f3835b.a(i2);
                    if (a2 != null) {
                        i3++;
                    }
                    if (zArr[i2] && (a2 == null || (mga.s() && mga.x() == this.F.d[i2]))) {
                        if (mga == this.n) {
                            this.e.a(this.o);
                            this.o = null;
                            this.n = null;
                        }
                        a(mga);
                        mga.z();
                    }
                    i2++;
                } else {
                    this.F = dga;
                    this.h.obtainMessage(3, dga.m).sendToTarget();
                    a(zArr, i3);
                    return;
                }
            }
        }
    }

    private final void b(Object obj, int i2) {
        this.h.obtainMessage(6, new Ega(this.G, obj, this.l, i2)).sendToTarget();
    }

    private final void b(boolean z2) {
        if (this.u != z2) {
            this.u = z2;
            this.h.obtainMessage(2, z2 ? 1 : 0, 0).sendToTarget();
        }
    }

    private final boolean b(int i2) {
        this.G.a(i2, this.k, false);
        return !this.G.a(0, this.j, false).e && this.G.a(i2, this.k, this.j, this.w) == -1;
    }

    private final boolean b(long j2) {
        if (j2 == -9223372036854775807L || this.l.f1707c < j2) {
            return true;
        }
        Dga dga = this.F.l;
        return dga != null && dga.j;
    }

    private final void c(boolean z2) {
        this.f.removeMessages(2);
        this.t = false;
        this.e.d();
        this.o = null;
        this.n = null;
        this.C = 60000000;
        Mga[] mgaArr = this.q;
        for (Mga mga : mgaArr) {
            try {
                a(mga);
                mga.z();
            } catch (C2169sga | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.q = new Mga[0];
        Dga dga = this.F;
        if (dga == null) {
            dga = this.D;
        }
        a(dga);
        this.D = null;
        this.E = null;
        this.F = null;
        b(false);
        if (z2) {
            AbstractC2382vja vja = this.p;
            if (vja != null) {
                vja.b();
                this.p = null;
            }
            this.G = null;
        }
    }

    private final void d() {
        this.t = false;
        this.e.c();
        for (Mga mga : this.q) {
            mga.start();
        }
    }

    private final void e() {
        this.e.d();
        for (Mga mga : this.q) {
            a(mga);
        }
    }

    private final void f() {
        Dga dga = this.F;
        if (dga != null) {
            long b2 = dga.f1794a.b();
            if (b2 != -9223372036854775807L) {
                a(b2);
            } else {
                Mga mga = this.n;
                if (mga == null || mga.q()) {
                    this.C = this.e.a();
                } else {
                    this.C = this.o.a();
                    this.e.a(this.C);
                }
                b2 = this.C - this.F.b();
            }
            this.l.f1707c = b2;
            this.z = SystemClock.elapsedRealtime() * 1000;
            long c2 = this.q.length == 0 ? Long.MIN_VALUE : this.F.f1794a.c();
            Cga cga = this.l;
            if (c2 == Long.MIN_VALUE) {
                c2 = this.G.a(this.F.g, this.k, false).d;
            }
            cga.d = c2;
        }
    }

    private final void g() {
        c(true);
        this.d.d();
        a(1);
    }

    private final void h() {
        Dga dga = this.D;
        if (!(dga == null || dga.j)) {
            Dga dga2 = this.E;
            if (dga2 == null || dga2.l == dga) {
                for (Mga mga : this.q) {
                    if (!mga.y()) {
                        return;
                    }
                }
                this.D.f1794a.d();
            }
        }
    }

    private final void i() {
        Dga dga = this.D;
        long a2 = !dga.j ? 0 : dga.f1794a.a();
        if (a2 == Long.MIN_VALUE) {
            b(false);
            return;
        }
        long b2 = this.C - this.D.b();
        boolean a3 = this.d.a(a2 - b2);
        b(a3);
        if (a3) {
            this.D.f1794a.c(b2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1007bka
    public final void a() {
        this.f.sendEmptyMessage(10);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.Hja] */
    @Override // com.google.android.gms.internal.ads.Gja
    public final /* synthetic */ void a(AbstractC2175sja sja) {
        this.f.obtainMessage(9, sja).sendToTarget();
    }

    public final void a(Sga sga, int i2, long j2) {
        this.f.obtainMessage(3, new Fga(sga, i2, j2)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2313uja
    public final void a(Sga sga, Object obj) {
        this.f.obtainMessage(7, Pair.create(sga, obj)).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2106rja
    public final void a(AbstractC2175sja sja) {
        this.f.obtainMessage(8, sja).sendToTarget();
    }

    public final void a(AbstractC2382vja vja, boolean z2) {
        this.f.obtainMessage(0, 1, 0, vja).sendToTarget();
    }

    public final void a(boolean z2) {
        this.f.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public final void a(C2445wga... wgaArr) {
        if (this.r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        this.x++;
        this.f.obtainMessage(11, wgaArr).sendToTarget();
    }

    public final synchronized void b() {
        if (!this.r) {
            this.f.sendEmptyMessage(6);
            while (!this.r) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.g.quit();
        }
    }

    public final synchronized void b(C2445wga... wgaArr) {
        if (this.r) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i2 = this.x;
        this.x = i2 + 1;
        this.f.obtainMessage(11, wgaArr).sendToTarget();
        while (this.y <= i2) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void c() {
        this.f.sendEmptyMessage(5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:486:0x08ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x08af, code lost:
        android.util.Log.e("ExoPlayerImplInternal", "Internal runtime error.", r0);
        r2 = r34.h;
        r1 = com.google.android.gms.internal.ads.C2169sga.a(r0);
        r3 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x08ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x08cb, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x08dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x08dd, code lost:
        r3 = 8;
        r1 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05be A[LOOP:7: B:315:0x05be->B:319:0x05d0, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:486:0x08ae A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r35) {
        /*
        // Method dump skipped, instructions count: 2312
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Aga.handleMessage(android.os.Message):boolean");
    }
}
