package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.ika  reason: case insensitive filesystem */
public final class C1488ika implements AbstractC1076cka {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4593a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4594b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f4595c;
    private final C1145dka[] d;
    private int e;
    private int f;
    private int g;
    private C1145dka[] h;

    public C1488ika(boolean z, int i) {
        this(true, 65536, 0);
    }

    private C1488ika(boolean z, int i, int i2) {
        C2453wka.a(true);
        C2453wka.a(true);
        this.f4593a = true;
        this.f4594b = 65536;
        this.g = 0;
        this.h = new C1145dka[100];
        this.f4595c = null;
        this.d = new C1145dka[1];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1076cka
    public final synchronized C1145dka a() {
        C1145dka dka;
        this.f++;
        if (this.g > 0) {
            C1145dka[] dkaArr = this.h;
            int i = this.g - 1;
            this.g = i;
            dka = dkaArr[i];
            this.h[this.g] = null;
        } else {
            dka = new C1145dka(new byte[this.f4594b], 0);
        }
        return dka;
    }

    public final synchronized void a(int i) {
        boolean z = i < this.e;
        this.e = i;
        if (z) {
            f();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1076cka
    public final synchronized void a(C1145dka dka) {
        this.d[0] = dka;
        a(this.d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1076cka
    public final synchronized void a(C1145dka[] dkaArr) {
        boolean z;
        if (this.g + dkaArr.length >= this.h.length) {
            this.h = (C1145dka[]) Arrays.copyOf(this.h, Math.max(this.h.length << 1, this.g + dkaArr.length));
        }
        for (C1145dka dka : dkaArr) {
            if (dka.f4139a != null) {
                if (dka.f4139a.length != this.f4594b) {
                    z = false;
                    C2453wka.a(z);
                    C1145dka[] dkaArr2 = this.h;
                    int i = this.g;
                    this.g = i + 1;
                    dkaArr2[i] = dka;
                }
            }
            z = true;
            C2453wka.a(z);
            C1145dka[] dkaArr22 = this.h;
            int i2 = this.g;
            this.g = i2 + 1;
            dkaArr22[i2] = dka;
        }
        this.f -= dkaArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1076cka
    public final int b() {
        return this.f4594b;
    }

    public final synchronized void c() {
        if (this.f4593a) {
            a(0);
        }
    }

    public final synchronized int d() {
        return this.f * this.f4594b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1076cka
    public final synchronized void f() {
        int max = Math.max(0, Jka.a(this.e, this.f4594b) - this.f);
        if (max < this.g) {
            Arrays.fill(this.h, max, this.g, (Object) null);
            this.g = max;
        }
    }
}
