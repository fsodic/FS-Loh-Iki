package com.google.android.gms.internal.ads;

import java.util.Arrays;

public class Mja implements Yja {

    /* renamed from: a  reason: collision with root package name */
    private final Ija f2613a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2614b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f2615c;
    private final Hga[] d;
    private final long[] e;
    private int f;

    public Mja(Ija ija, int... iArr) {
        int i = 0;
        C2453wka.b(iArr.length > 0);
        C2453wka.a(ija);
        this.f2613a = ija;
        this.f2614b = iArr.length;
        this.d = new Hga[this.f2614b];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = ija.a(iArr[i2]);
        }
        Arrays.sort(this.d, new Oja());
        this.f2615c = new int[this.f2614b];
        while (true) {
            int i3 = this.f2614b;
            if (i < i3) {
                this.f2615c[i] = ija.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Yja
    public final int a(int i) {
        return this.f2615c[0];
    }

    @Override // com.google.android.gms.internal.ads.Yja
    public final Ija a() {
        return this.f2613a;
    }

    @Override // com.google.android.gms.internal.ads.Yja
    public final Hga b(int i) {
        return this.d[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Mja mja = (Mja) obj;
            return this.f2613a == mja.f2613a && Arrays.equals(this.f2615c, mja.f2615c);
        }
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.f2613a) * 31) + Arrays.hashCode(this.f2615c);
        }
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.Yja
    public final int length() {
        return this.f2615c.length;
    }
}
