package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.uia  reason: case insensitive filesystem */
public final class C2311uia implements AbstractC1898oia {

    /* renamed from: a  reason: collision with root package name */
    private final Dka f5747a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5748b = this.f5747a.o();

    /* renamed from: c  reason: collision with root package name */
    private final int f5749c = (this.f5747a.o() & 255);
    private int d;
    private int e;

    public C2311uia(C1829nia nia) {
        this.f5747a = nia.Qa;
        this.f5747a.c(12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1898oia
    public final int a() {
        int i = this.f5749c;
        if (i == 8) {
            return this.f5747a.g();
        }
        if (i == 16) {
            return this.f5747a.h();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        this.e = this.f5747a.g();
        return (this.e & 240) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1898oia
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1898oia
    public final int c() {
        return this.f5748b;
    }
}
