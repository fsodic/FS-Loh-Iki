package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xka  reason: case insensitive filesystem */
public final class C2522xka {

    /* renamed from: a  reason: collision with root package name */
    private int f6016a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f6017b;

    public C2522xka() {
        this(32);
    }

    private C2522xka(int i) {
        this.f6017b = new long[32];
    }

    public final int a() {
        return this.f6016a;
    }

    public final long a(int i) {
        if (i >= 0 && i < this.f6016a) {
            return this.f6017b[i];
        }
        int i2 = this.f6016a;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void a(long j) {
        int i = this.f6016a;
        long[] jArr = this.f6017b;
        if (i == jArr.length) {
            this.f6017b = Arrays.copyOf(jArr, i << 1);
        }
        long[] jArr2 = this.f6017b;
        int i2 = this.f6016a;
        this.f6016a = i2 + 1;
        jArr2[i2] = j;
    }
}
