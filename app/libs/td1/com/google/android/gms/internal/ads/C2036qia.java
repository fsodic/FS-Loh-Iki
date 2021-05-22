package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qia  reason: case insensitive filesystem */
public final class C2036qia implements AbstractC1898oia {

    /* renamed from: a  reason: collision with root package name */
    private final int f5338a = this.f5340c.o();

    /* renamed from: b  reason: collision with root package name */
    private final int f5339b = this.f5340c.o();

    /* renamed from: c  reason: collision with root package name */
    private final Dka f5340c;

    public C2036qia(C1829nia nia) {
        this.f5340c = nia.Qa;
        this.f5340c.c(12);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1898oia
    public final int a() {
        int i = this.f5338a;
        return i == 0 ? this.f5340c.o() : i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1898oia
    public final boolean b() {
        return this.f5338a != 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1898oia
    public final int c() {
        return this.f5339b;
    }
}
