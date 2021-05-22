package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ija  reason: case insensitive filesystem */
final class C1486ija implements Rha, AbstractC2175sja, Fja, AbstractC1902oka<C1693lja> {
    private boolean[] A;
    private boolean B;
    private long C;
    private long D;
    private long E;
    private int F;
    private boolean G;
    private boolean H;

    /* renamed from: a  reason: collision with root package name */
    private final Uri f4587a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC1213eka f4588b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4589c;
    private final Handler d;
    private final AbstractC1969pja e;
    private final AbstractC2313uja f;
    private final AbstractC1076cka g;
    private final String h;
    private final long i;
    private final C1971pka j = new C1971pka("Loader:ExtractorMediaPeriod");
    private final C1900oja k;
    private final C2591yka l;
    private final Runnable m;
    private final Runnable n;
    private final Handler o;
    private final SparseArray<Dja> p;
    private AbstractC2106rja q;
    private Vha r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private Lja x;
    private long y;
    private boolean[] z;

    public C1486ija(Uri uri, AbstractC1213eka eka, Pha[] phaArr, int i2, Handler handler, AbstractC1969pja pja, AbstractC2313uja uja, AbstractC1076cka cka, String str, int i3) {
        this.f4587a = uri;
        this.f4588b = eka;
        this.f4589c = i2;
        this.d = handler;
        this.e = pja;
        this.f = uja;
        this.g = cka;
        this.h = str;
        this.i = (long) i3;
        this.k = new C1900oja(phaArr, this);
        this.l = new C2591yka();
        this.m = new RunnableC1418hja(this);
        this.n = new RunnableC1624kja(this);
        this.o = new Handler();
        this.E = -9223372036854775807L;
        this.p = new SparseArray<>();
        this.C = -1;
    }

    private final void a(C1693lja lja) {
        if (this.C == -1) {
            this.C = C1693lja.a(lja);
        }
    }

    private final void i() {
        Vha vha;
        C1693lja lja = new C1693lja(this, this.f4587a, this.f4588b, this.k, this.l);
        if (this.t) {
            C2453wka.b(m());
            long j2 = this.y;
            if (j2 == -9223372036854775807L || this.E < j2) {
                lja.a(this.r.a(this.E), this.E);
                this.E = -9223372036854775807L;
            } else {
                this.G = true;
                this.E = -9223372036854775807L;
                return;
            }
        }
        this.F = k();
        int i2 = this.f4589c;
        if (i2 == -1) {
            i2 = (this.t && this.C == -1 && ((vha = this.r) == null || vha.c() == -9223372036854775807L)) ? 6 : 3;
        }
        this.j.a(lja, this, i2);
    }

    /* access modifiers changed from: private */
    public final void j() {
        if (!this.H && !this.t && this.r != null && this.s) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.p.valueAt(i2).e() == null) {
                    return;
                }
            }
            this.l.c();
            Ija[] ijaArr = new Ija[size];
            this.A = new boolean[size];
            this.z = new boolean[size];
            this.y = this.r.c();
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 < size) {
                    Hga e2 = this.p.valueAt(i3).e();
                    ijaArr[i3] = new Ija(e2);
                    String str = e2.f;
                    if (!C2660zka.b(str) && !C2660zka.a(str)) {
                        z2 = false;
                    }
                    this.A[i3] = z2;
                    this.B = z2 | this.B;
                    i3++;
                } else {
                    this.x = new Lja(ijaArr);
                    this.t = true;
                    this.f.a(new Jja(this.y, this.r.b()), null);
                    this.q.a((AbstractC2175sja) this);
                    return;
                }
            }
        }
    }

    private final int k() {
        int size = this.p.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.p.valueAt(i3).c();
        }
        return i2;
    }

    private final long l() {
        int size = this.p.size();
        long j2 = Long.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            j2 = Math.max(j2, this.p.valueAt(i2).b());
        }
        return j2;
    }

    private final boolean m() {
        return this.E != -9223372036854775807L;
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2, Jga jga, Eha eha, boolean z2) {
        if (this.v || m()) {
            return -3;
        }
        return this.p.valueAt(i2).a(jga, eha, z2, this.G, this.D);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.qka, long, long, java.io.IOException] */
    @Override // com.google.android.gms.internal.ads.AbstractC1902oka
    public final /* synthetic */ int a(C1693lja lja, long j2, long j3, IOException iOException) {
        Vha vha;
        C1693lja lja2 = lja;
        a(lja2);
        Handler handler = this.d;
        if (!(handler == null || this.e == null)) {
            handler.post(new RunnableC1762mja(this, iOException));
        }
        if (iOException instanceof Kja) {
            return 3;
        }
        boolean z2 = k() > this.F;
        if (this.C == -1 && ((vha = this.r) == null || vha.c() == -9223372036854775807L)) {
            this.D = 0;
            this.v = this.t;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.valueAt(i2).a(!this.t || this.z[i2]);
            }
            lja2.a(0, 0);
        }
        this.F = k();
        return z2 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja, com.google.android.gms.internal.ads.Hja
    public final long a() {
        if (this.w == 0) {
            return Long.MIN_VALUE;
        }
        return c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long a(Yja[] yjaArr, boolean[] zArr, Eja[] ejaArr, boolean[] zArr2, long j2) {
        C2453wka.b(this.t);
        for (int i2 = 0; i2 < yjaArr.length; i2++) {
            if (ejaArr[i2] != null && (yjaArr[i2] == null || !zArr[i2])) {
                int a2 = C1831nja.a((C1831nja) ejaArr[i2]);
                C2453wka.b(this.z[a2]);
                this.w--;
                this.z[a2] = false;
                this.p.valueAt(a2).a();
                ejaArr[i2] = null;
            }
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < yjaArr.length; i3++) {
            if (ejaArr[i3] == null && yjaArr[i3] != null) {
                Yja yja = yjaArr[i3];
                C2453wka.b(yja.length() == 1);
                C2453wka.b(yja.a(0) == 0);
                int a3 = this.x.a(yja.a());
                C2453wka.b(!this.z[a3]);
                this.w++;
                this.z[a3] = true;
                ejaArr[i3] = new C1831nja(this, a3);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (!this.u) {
            int size = this.p.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.z[i4]) {
                    this.p.valueAt(i4).a();
                }
            }
        }
        if (this.w == 0) {
            this.v = false;
            if (this.j.a()) {
                this.j.b();
            }
        } else if (!this.u ? j2 != 0 : z2) {
            j2 = b(j2);
            for (int i5 = 0; i5 < ejaArr.length; i5++) {
                if (ejaArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.u = true;
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        Dja valueAt = this.p.valueAt(i2);
        if (!this.G || j2 <= valueAt.b()) {
            valueAt.a(j2, true);
        } else {
            valueAt.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final void a(long j2) {
    }

    @Override // com.google.android.gms.internal.ads.Fja
    public final void a(Hga hga) {
        this.o.post(this.m);
    }

    @Override // com.google.android.gms.internal.ads.Rha
    public final void a(Vha vha) {
        this.r = vha;
        this.o.post(this.m);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.qka, long, long] */
    @Override // com.google.android.gms.internal.ads.AbstractC1902oka
    public final /* synthetic */ void a(C1693lja lja, long j2, long j3) {
        a(lja);
        this.G = true;
        if (this.y == -9223372036854775807L) {
            long l2 = l();
            this.y = l2 == Long.MIN_VALUE ? 0 : l2 + 10000;
            this.f.a(new Jja(this.y, this.r.b()), null);
        }
        this.q.a((Hja) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.qka, long, long, boolean] */
    @Override // com.google.android.gms.internal.ads.AbstractC1902oka
    public final /* synthetic */ void a(C1693lja lja, long j2, long j3, boolean z2) {
        a(lja);
        if (!z2 && this.w > 0) {
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.p.valueAt(i2).a(this.z[i2]);
            }
            this.q.a((Hja) this);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final void a(AbstractC2106rja rja, long j2) {
        this.q = rja;
        this.l.b();
        i();
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2) {
        if (!this.G) {
            return !m() && this.p.valueAt(i2).d();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long b() {
        if (!this.v) {
            return -9223372036854775807L;
        }
        this.v = false;
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long b(long j2) {
        if (!this.r.b()) {
            j2 = 0;
        }
        this.D = j2;
        int size = this.p.size();
        boolean z2 = !m();
        int i2 = 0;
        while (z2 && i2 < size) {
            if (this.z[i2]) {
                z2 = this.p.valueAt(i2).a(j2, false);
            }
            i2++;
        }
        if (!z2) {
            this.E = j2;
            this.G = false;
            if (this.j.a()) {
                this.j.b();
            } else {
                for (int i3 = 0; i3 < size; i3++) {
                    this.p.valueAt(i3).a(this.z[i3]);
                }
            }
        }
        this.v = false;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.Rha
    public final Xha b(int i2, int i3) {
        Dja dja = this.p.get(i2);
        if (dja != null) {
            return dja;
        }
        Dja dja2 = new Dja(this.g);
        dja2.a(this);
        this.p.put(i2, dja2);
        return dja2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long c() {
        long j2;
        if (this.G) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.E;
        }
        if (this.B) {
            j2 = Long.MAX_VALUE;
            int size = this.p.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.A[i2]) {
                    j2 = Math.min(j2, this.p.valueAt(i2).b());
                }
            }
        } else {
            j2 = l();
        }
        return j2 == Long.MIN_VALUE ? this.D : j2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja, com.google.android.gms.internal.ads.Hja
    public final boolean c(long j2) {
        if (this.G) {
            return false;
        }
        if (this.t && this.w == 0) {
            return false;
        }
        boolean b2 = this.l.b();
        if (this.j.a()) {
            return b2;
        }
        i();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final void d() {
        this.j.a(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final Lja e() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.Rha
    public final void f() {
        this.s = true;
        this.o.post(this.m);
    }

    public final void g() {
        this.j.a(new RunnableC1555jja(this, this.k));
        this.o.removeCallbacksAndMessages(null);
        this.H = true;
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.j.a(Integer.MIN_VALUE);
    }
}
