package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

public final class Dka {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f1807a;

    /* renamed from: b  reason: collision with root package name */
    private int f1808b;

    /* renamed from: c  reason: collision with root package name */
    private int f1809c;

    public Dka() {
    }

    public Dka(int i) {
        this.f1807a = new byte[i];
        this.f1809c = i;
    }

    public Dka(byte[] bArr) {
        this.f1807a = bArr;
        this.f1809c = bArr.length;
    }

    public final int a() {
        byte[] bArr = this.f1807a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void a(int i) {
        a(a() < i ? new byte[i] : this.f1807a, i);
    }

    public final void a(byte[] bArr, int i) {
        this.f1807a = bArr;
        this.f1809c = i;
        this.f1808b = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f1807a, this.f1808b, bArr, i, i2);
        this.f1808b += i2;
    }

    public final int b() {
        return this.f1808b;
    }

    public final void b(int i) {
        C2453wka.a(i >= 0 && i <= this.f1807a.length);
        this.f1809c = i;
    }

    public final int c() {
        return this.f1809c;
    }

    public final void c(int i) {
        C2453wka.a(i >= 0 && i <= this.f1809c);
        this.f1808b = i;
    }

    public final int d() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        int i3 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = this.f1808b;
        this.f1808b = i4 + 1;
        int i5 = i3 | ((bArr[i4] & 255) << 8);
        int i6 = this.f1808b;
        this.f1808b = i6 + 1;
        return (bArr[i6] & 255) | i5;
    }

    public final void d(int i) {
        c(this.f1808b + i);
    }

    public final long e() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.f1808b;
        this.f1808b = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.f1808b;
        this.f1808b = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.f1808b;
        this.f1808b = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.f1808b;
        this.f1808b = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.f1808b;
        this.f1808b = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.f1808b;
        this.f1808b = i8 + 1;
        return j6 | (255 & ((long) bArr[i8]));
    }

    public final String e(int i) {
        if (i == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = (this.f1808b + i) - 1;
        String str = new String(this.f1807a, this.f1808b, (i2 >= this.f1809c || this.f1807a[i2] != 0) ? i : i - 1);
        this.f1808b += i;
        return str;
    }

    public final short f() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public final int g() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        return bArr[i] & 255;
    }

    public final int h() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public final void i() {
        this.f1808b = 0;
        this.f1809c = 0;
    }

    public final int j() {
        return this.f1809c - this.f1808b;
    }

    public final int k() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public final long l() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        long j = ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.f1808b;
        this.f1808b = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.f1808b;
        this.f1808b = i4 + 1;
        return j2 | (255 & ((long) bArr[i4]));
    }

    public final long m() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.f1808b;
        this.f1808b = i3 + 1;
        long j2 = j | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.f1808b;
        this.f1808b = i4 + 1;
        return j2 | ((255 & ((long) bArr[i4])) << 24);
    }

    public final int n() {
        byte[] bArr = this.f1807a;
        int i = this.f1808b;
        this.f1808b = i + 1;
        int i2 = this.f1808b;
        this.f1808b = i2 + 1;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f1808b += 2;
        return i3;
    }

    public final int o() {
        int d = d();
        if (d >= 0) {
            return d;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(d);
        throw new IllegalStateException(sb.toString());
    }

    public final long p() {
        long e = e();
        if (e >= 0) {
            return e;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(e);
        throw new IllegalStateException(sb.toString());
    }

    public final String q() {
        if (j() == 0) {
            return null;
        }
        int i = this.f1808b;
        while (i < this.f1809c && this.f1807a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f1807a;
        int i2 = this.f1808b;
        String str = new String(bArr, i2, i - i2);
        this.f1808b = i;
        int i3 = this.f1808b;
        if (i3 < this.f1809c) {
            this.f1808b = i3 + 1;
        }
        return str;
    }
}
