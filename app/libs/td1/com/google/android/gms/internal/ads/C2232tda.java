package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tda  reason: case insensitive filesystem */
public final class C2232tda extends Iba {
    static final int[] e = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int f;
    private final Iba g;
    private final Iba h;
    private final int i;
    private final int j;

    private C2232tda(Iba iba, Iba iba2) {
        this.g = iba;
        this.h = iba2;
        this.i = iba.size();
        this.f = this.i + iba2.size();
        this.j = Math.max(iba.o(), iba2.o()) + 1;
    }

    /* synthetic */ C2232tda(Iba iba, Iba iba2, C2163sda sda) {
        this(iba, iba2);
    }

    static Iba a(Iba iba, Iba iba2) {
        if (iba2.size() == 0) {
            return iba;
        }
        if (iba.size() == 0) {
            return iba2;
        }
        int size = iba.size() + iba2.size();
        if (size < 128) {
            return b(iba, iba2);
        }
        if (iba instanceof C2232tda) {
            C2232tda tda = (C2232tda) iba;
            if (tda.h.size() + iba2.size() < 128) {
                return new C2232tda(tda.g, b(tda.h, iba2));
            } else if (tda.g.o() > tda.h.o() && tda.o() > iba2.o()) {
                return new C2232tda(tda.g, new C2232tda(tda.h, iba2));
            }
        }
        return size >= k(Math.max(iba.o(), iba2.o()) + 1) ? new C2232tda(iba, iba2) : C2370vda.a(new C2370vda(null), iba, iba2);
    }

    private static Iba b(Iba iba, Iba iba2) {
        int size = iba.size();
        int size2 = iba2.size();
        byte[] bArr = new byte[(size + size2)];
        iba.a(bArr, 0, 0, size);
        iba2.a(bArr, 0, size, size2);
        return Iba.b(bArr);
    }

    static int k(int i2) {
        int[] iArr = e;
        if (i2 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i2];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final int a(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.i;
        if (i5 <= i6) {
            return this.g.a(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.h.a(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.h.a(this.g.a(i2, i3, i7), 0, i4 - i7);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final String a(Charset charset) {
        return new String(a(), charset);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iba
    public final void a(Fba fba) {
        this.g.a(fba);
        this.h.a(fba);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.i;
        if (i5 <= i6) {
            return this.g.b(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.h.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.h.b(this.g.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final Iba b(int i2, int i3) {
        int c2 = Iba.c(i2, i3, this.f);
        if (c2 == 0) {
            return Iba.f2236a;
        }
        if (c2 == this.f) {
            return this;
        }
        int i4 = this.i;
        if (i3 <= i4) {
            return this.g.b(i2, i3);
        }
        if (i2 >= i4) {
            return this.h.b(i2 - i4, i3 - i4);
        }
        Iba iba = this.g;
        return new C2232tda(iba.b(i2, iba.size()), this.h.b(0, i3 - this.i));
    }

    @Override // com.google.android.gms.internal.ads.Iba
    /* renamed from: b */
    public final Nba iterator() {
        return new C2163sda(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final void b(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.i;
        if (i5 <= i6) {
            this.g.b(bArr, i2, i3, i4);
        } else if (i2 >= i6) {
            this.h.b(bArr, i2 - i6, i3, i4);
        } else {
            int i7 = i6 - i2;
            this.g.b(bArr, i2, i3, i7);
            this.h.b(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Iba)) {
            return false;
        }
        Iba iba = (Iba) obj;
        if (this.f != iba.size()) {
            return false;
        }
        if (this.f == 0) {
            return true;
        }
        int q = q();
        int q2 = iba.q();
        if (q != 0 && q2 != 0 && q != q2) {
            return false;
        }
        C2301uda uda = new C2301uda(this, null);
        Pba pba = (Pba) uda.next();
        C2301uda uda2 = new C2301uda(iba, null);
        Pba pba2 = (Pba) uda2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = pba.size() - i2;
            int size2 = pba2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? pba.a(pba2, i3, min) : pba2.a(pba, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f;
            if (i4 < i5) {
                if (min == size) {
                    pba = (Pba) uda.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == size2) {
                    pba2 = (Pba) uda2.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final byte h(int i2) {
        Iba.a(i2, this.f);
        return i(i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iba
    public final byte i(int i2) {
        int i3 = this.i;
        return i2 < i3 ? this.g.i(i2) : this.h.i(i2 - i3);
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final boolean l() {
        int a2 = this.g.a(0, 0, this.i);
        Iba iba = this.h;
        return iba.a(a2, 0, iba.size()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final Uba m() {
        return new Zba(new C2508xda(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final int o() {
        return this.j;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba
    public final boolean p() {
        return this.f >= k(this.j);
    }

    @Override // com.google.android.gms.internal.ads.Iba
    public final int size() {
        return this.f;
    }
}
