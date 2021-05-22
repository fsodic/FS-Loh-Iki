package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.xja  reason: case insensitive filesystem */
final class C2520xja implements AbstractC2106rja, AbstractC2175sja {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC2175sja[] f6011a;

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<Eja, Integer> f6012b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private AbstractC2106rja f6013c;
    private int d;
    private Lja e;
    private AbstractC2175sja[] f;
    private Hja g;

    public C2520xja(AbstractC2175sja... sjaArr) {
        this.f6011a = sjaArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja, com.google.android.gms.internal.ads.Hja
    public final long a() {
        return this.g.a();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long a(Yja[] yjaArr, boolean[] zArr, Eja[] ejaArr, boolean[] zArr2, long j) {
        int[] iArr = new int[yjaArr.length];
        int[] iArr2 = new int[yjaArr.length];
        for (int i = 0; i < yjaArr.length; i++) {
            iArr[i] = ejaArr[i] == null ? -1 : this.f6012b.get(ejaArr[i]).intValue();
            iArr2[i] = -1;
            if (yjaArr[i] != null) {
                Ija a2 = yjaArr[i].a();
                int i2 = 0;
                while (true) {
                    AbstractC2175sja[] sjaArr = this.f6011a;
                    if (i2 >= sjaArr.length) {
                        break;
                    } else if (sjaArr[i2].e().a(a2) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f6012b.clear();
        Eja[] ejaArr2 = new Eja[yjaArr.length];
        Eja[] ejaArr3 = new Eja[yjaArr.length];
        Yja[] yjaArr2 = new Yja[yjaArr.length];
        ArrayList arrayList = new ArrayList(this.f6011a.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.f6011a.length) {
            for (int i4 = 0; i4 < yjaArr.length; i4++) {
                Yja yja = null;
                ejaArr3[i4] = iArr[i4] == i3 ? ejaArr[i4] : null;
                if (iArr2[i4] == i3) {
                    yja = yjaArr[i4];
                }
                yjaArr2[i4] = yja;
            }
            long a3 = this.f6011a[i3].a(yjaArr2, zArr, ejaArr3, zArr2, j2);
            if (i3 == 0) {
                j2 = a3;
            } else if (a3 != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i5 = 0; i5 < yjaArr.length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    C2453wka.b(ejaArr3[i5] != null);
                    ejaArr2[i5] = ejaArr3[i5];
                    this.f6012b.put(ejaArr3[i5], Integer.valueOf(i3));
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (ejaArr3[i5] != null) {
                        z2 = false;
                    }
                    C2453wka.b(z2);
                }
            }
            if (z) {
                arrayList.add(this.f6011a[i3]);
            }
            i3++;
            arrayList = arrayList;
            yjaArr2 = yjaArr2;
        }
        System.arraycopy(ejaArr2, 0, ejaArr, 0, ejaArr2.length);
        this.f = new AbstractC2175sja[arrayList.size()];
        arrayList.toArray(this.f);
        this.g = new C1280fja(this.f);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final void a(long j) {
        for (AbstractC2175sja sja : this.f) {
            sja.a(j);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.Hja] */
    @Override // com.google.android.gms.internal.ads.Gja
    public final /* synthetic */ void a(AbstractC2175sja sja) {
        if (this.e != null) {
            this.f6013c.a((Hja) this);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final void a(AbstractC2106rja rja, long j) {
        this.f6013c = rja;
        AbstractC2175sja[] sjaArr = this.f6011a;
        this.d = sjaArr.length;
        for (AbstractC2175sja sja : sjaArr) {
            sja.a(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2106rja
    public final void a(AbstractC2175sja sja) {
        int i = this.d - 1;
        this.d = i;
        if (i <= 0) {
            int i2 = 0;
            for (AbstractC2175sja sja2 : this.f6011a) {
                i2 += sja2.e().f2521b;
            }
            Ija[] ijaArr = new Ija[i2];
            AbstractC2175sja[] sjaArr = this.f6011a;
            int length = sjaArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                Lja e2 = sjaArr[i3].e();
                int i5 = e2.f2521b;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    ijaArr[i6] = e2.a(i7);
                    i7++;
                    i6++;
                }
                i3++;
                i4 = i6;
            }
            this.e = new Lja(ijaArr);
            this.f6013c.a((AbstractC2175sja) this);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long b() {
        long b2 = this.f6011a[0].b();
        int i = 1;
        while (true) {
            AbstractC2175sja[] sjaArr = this.f6011a;
            if (i >= sjaArr.length) {
                if (b2 != -9223372036854775807L) {
                    AbstractC2175sja[] sjaArr2 = this.f;
                    for (AbstractC2175sja sja : sjaArr2) {
                        if (sja != this.f6011a[0] && sja.b(b2) != b2) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return b2;
            } else if (sjaArr[i].b() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long b(long j) {
        long b2 = this.f[0].b(j);
        int i = 1;
        while (true) {
            AbstractC2175sja[] sjaArr = this.f;
            if (i >= sjaArr.length) {
                return b2;
            }
            if (sjaArr[i].b(b2) == b2) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final long c() {
        long j = Long.MAX_VALUE;
        for (AbstractC2175sja sja : this.f) {
            long c2 = sja.c();
            if (c2 != Long.MIN_VALUE) {
                j = Math.min(j, c2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja, com.google.android.gms.internal.ads.Hja
    public final boolean c(long j) {
        return this.g.c(j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final void d() {
        for (AbstractC2175sja sja : this.f6011a) {
            sja.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2175sja
    public final Lja e() {
        return this.e;
    }
}
