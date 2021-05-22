package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class Ija {

    /* renamed from: a  reason: collision with root package name */
    public final int f2261a;

    /* renamed from: b  reason: collision with root package name */
    private final Hga[] f2262b;

    /* renamed from: c  reason: collision with root package name */
    private int f2263c;

    public Ija(Hga... hgaArr) {
        C2453wka.b(hgaArr.length > 0);
        this.f2262b = hgaArr;
        this.f2261a = hgaArr.length;
    }

    public final int a(Hga hga) {
        int i = 0;
        while (true) {
            Hga[] hgaArr = this.f2262b;
            if (i >= hgaArr.length) {
                return -1;
            }
            if (hga == hgaArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Hga a(int i) {
        return this.f2262b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Ija.class == obj.getClass()) {
            Ija ija = (Ija) obj;
            return this.f2261a == ija.f2261a && Arrays.equals(this.f2262b, ija.f2262b);
        }
    }

    public final int hashCode() {
        if (this.f2263c == 0) {
            this.f2263c = Arrays.hashCode(this.f2262b) + 527;
        }
        return this.f2263c;
    }
}
