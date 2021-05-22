package com.google.android.gms.internal.ads;

import java.util.Arrays;

public final class _ja {

    /* renamed from: a  reason: collision with root package name */
    public final int f3749a;

    /* renamed from: b  reason: collision with root package name */
    private final Yja[] f3750b;

    /* renamed from: c  reason: collision with root package name */
    private int f3751c;

    public _ja(Yja... yjaArr) {
        this.f3750b = yjaArr;
        this.f3749a = yjaArr.length;
    }

    public final Yja a(int i) {
        return this.f3750b[i];
    }

    public final Yja[] a() {
        return (Yja[]) this.f3750b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || _ja.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3750b, ((_ja) obj).f3750b);
    }

    public final int hashCode() {
        if (this.f3751c == 0) {
            this.f3751c = Arrays.hashCode(this.f3750b) + 527;
        }
        return this.f3751c;
    }
}
