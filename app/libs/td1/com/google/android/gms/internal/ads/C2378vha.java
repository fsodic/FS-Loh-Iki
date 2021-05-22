package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.vha  reason: case insensitive filesystem */
final class C2378vha {

    /* renamed from: a  reason: collision with root package name */
    private final int f5825a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5826b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5827c;
    private final int d;
    private final int e = (this.d * 2);
    private final short[] f;
    private int g;
    private short[] h;
    private int i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private int n;
    private float o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;

    public C2378vha(int i2, int i3) {
        this.f5825a = i2;
        this.f5826b = i3;
        this.f5827c = i2 / 400;
        this.d = i2 / 65;
        int i4 = this.e;
        this.f = new short[i4];
        this.g = i4;
        this.h = new short[(i4 * i3)];
        this.i = i4;
        this.j = new short[(i4 * i3)];
        this.k = i4;
        this.l = new short[(i4 * i3)];
        this.m = 0;
        this.n = 0;
        this.u = 0;
        this.o = 1.0f;
        this.p = 1.0f;
    }

    private final int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f5826b;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s2 = sArr[i5 + i11];
                short s3 = sArr[i5 + i3 + i11];
                i10 += s2 >= s3 ? s2 - s3 : s3 - s2;
            }
            if (i10 * i7 < i6 * i3) {
                i7 = i3;
                i6 = i10;
            }
            if (i10 * i9 > i8 * i3) {
                i9 = i3;
                i8 = i10;
            }
            i3++;
        }
        this.w = i6 / i7;
        this.x = i8 / i9;
        return i7;
    }

    private final void a(int i2) {
        int i3 = this.q + i2;
        int i4 = this.g;
        if (i3 > i4) {
            this.g = i4 + (i4 / 2) + i2;
            this.h = Arrays.copyOf(this.h, this.g * this.f5826b);
        }
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    private final void a(short[] sArr, int i2, int i3) {
        b(i3);
        int i4 = this.f5826b;
        System.arraycopy(sArr, i2 * i4, this.j, this.r * i4, i4 * i3);
        this.r += i3;
    }

    private final void b(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        if (i3 > i4) {
            this.i = i4 + (i4 / 2) + i2;
            this.j = Arrays.copyOf(this.j, this.i * this.f5826b);
        }
    }

    private final void b(short[] sArr, int i2, int i3) {
        int i4 = this.e / i3;
        int i5 = this.f5826b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f[i8] = (short) (i9 / i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void c() {
        /*
        // Method dump skipped, instructions count: 585
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2378vha.c():void");
    }

    public final void a() {
        int i2;
        int i3 = this.q;
        float f2 = this.o;
        float f3 = this.p;
        int i4 = this.r + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.s)) / f3) + 0.5f));
        a((this.e * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.e;
            int i6 = this.f5826b;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.h[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.q += i2 * 2;
        c();
        if (this.r > i4) {
            this.r = i4;
        }
        this.q = 0;
        this.t = 0;
        this.s = 0;
    }

    public final void a(float f2) {
        this.o = f2;
    }

    public final void a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.f5826b;
        int i3 = remaining / i2;
        a(i3);
        shortBuffer.get(this.h, this.q * this.f5826b, ((i2 * i3) << 1) / 2);
        this.q += i3;
        c();
    }

    public final int b() {
        return this.r;
    }

    public final void b(float f2) {
        this.p = f2;
    }

    public final void b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f5826b, this.r);
        shortBuffer.put(this.j, 0, this.f5826b * min);
        this.r -= min;
        short[] sArr = this.j;
        int i2 = this.f5826b;
        System.arraycopy(sArr, min * i2, sArr, 0, this.r * i2);
    }
}
