package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Stack;

public final class Eia implements Pha, Vha {

    /* renamed from: a  reason: collision with root package name */
    private static final Qha f1889a = new Dia();

    /* renamed from: b  reason: collision with root package name */
    private static final int f1890b = Jka.d("qt  ");

    /* renamed from: c  reason: collision with root package name */
    private final Dka f1891c = new Dka(Cka.f1722a);
    private final Dka d = new Dka(4);
    private final Dka e = new Dka(16);
    private final Stack<C1622kia> f = new Stack<>();
    private int g;
    private int h;
    private long i;
    private int j;
    private Dka k;
    private int l;
    private int m;
    private Rha n;
    private Gia[] o;
    private long p;
    private boolean q;

    private final void b(long j2) {
        Yia yia;
        Uha uha;
        Iia a2;
        while (!this.f.isEmpty() && this.f.peek().Qa == j2) {
            C1622kia pop = this.f.pop();
            if (pop.Pa == C1691lia.B) {
                ArrayList arrayList = new ArrayList();
                Yia yia2 = null;
                Uha uha2 = new Uha();
                C1829nia d2 = pop.d(C1691lia.Aa);
                if (!(d2 == null || (yia2 = C1760mia.a(d2, this.q)) == null)) {
                    uha2.a(yia2);
                }
                long j3 = Long.MAX_VALUE;
                long j4 = -9223372036854775807L;
                int i2 = 0;
                while (i2 < pop.Sa.size()) {
                    C1622kia kia = pop.Sa.get(i2);
                    if (kia.Pa == C1691lia.D && (a2 = C1760mia.a(kia, pop.d(C1691lia.C), -9223372036854775807L, (Dha) null, this.q)) != null) {
                        Jia a3 = C1760mia.a(a2, kia.e(C1691lia.E).e(C1691lia.F).e(C1691lia.G), uha2);
                        if (a3.f2342a != 0) {
                            Gia gia = new Gia(a2, a3, this.n.b(i2, a2.f2258b));
                            Hga a4 = a2.f.a(a3.d + 30);
                            if (a2.f2258b == 1) {
                                if (uha2.a()) {
                                    a4 = a4.a(uha2.f3274c, uha2.d);
                                }
                                if (yia2 != null) {
                                    a4 = a4.a(yia2);
                                }
                            }
                            gia.f2062c.a(a4);
                            yia = yia2;
                            uha = uha2;
                            j4 = Math.max(j4, a2.e);
                            arrayList.add(gia);
                            long j5 = a3.f2343b[0];
                            if (j5 < j3) {
                                j3 = j5;
                            }
                            i2++;
                            uha2 = uha;
                            yia2 = yia;
                        }
                    }
                    yia = yia2;
                    uha = uha2;
                    i2++;
                    uha2 = uha;
                    yia2 = yia;
                }
                this.p = j4;
                this.o = (Gia[]) arrayList.toArray(new Gia[arrayList.size()]);
                this.n.f();
                this.n.a(this);
                this.f.clear();
                this.g = 2;
            } else if (!this.f.isEmpty()) {
                this.f.peek().a(pop);
            }
        }
        if (this.g != 2) {
            d();
        }
    }

    private final void d() {
        this.g = 0;
        this.j = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:151:0x018c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0299 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.Pha
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.android.gms.internal.ads.Oha r24, com.google.android.gms.internal.ads.Wha r25) {
        /*
        // Method dump skipped, instructions count: 666
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Eia.a(com.google.android.gms.internal.ads.Oha, com.google.android.gms.internal.ads.Wha):int");
    }

    @Override // com.google.android.gms.internal.ads.Vha
    public final long a(long j2) {
        long j3 = Long.MAX_VALUE;
        for (Gia gia : this.o) {
            Jia jia = gia.f2061b;
            int a2 = jia.a(j2);
            if (a2 == -1) {
                a2 = jia.b(j2);
            }
            long j4 = jia.f2343b[a2];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a(long j2, long j3) {
        this.f.clear();
        this.j = 0;
        this.l = 0;
        this.m = 0;
        if (j2 == 0) {
            d();
            return;
        }
        Gia[] giaArr = this.o;
        if (giaArr != null) {
            for (Gia gia : giaArr) {
                Jia jia = gia.f2061b;
                int a2 = jia.a(j3);
                if (a2 == -1) {
                    a2 = jia.b(j3);
                }
                gia.d = a2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final void a(Rha rha) {
        this.n = rha;
    }

    @Override // com.google.android.gms.internal.ads.Pha
    public final boolean a(Oha oha) {
        return Fia.b(oha);
    }

    @Override // com.google.android.gms.internal.ads.Vha
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Vha
    public final long c() {
        return this.p;
    }
}
