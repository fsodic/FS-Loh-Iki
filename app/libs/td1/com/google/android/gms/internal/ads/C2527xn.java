package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xn  reason: case insensitive filesystem */
public final /* synthetic */ class C2527xn implements AbstractC1420hka {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1420hka f6025a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6026b;

    C2527xn(AbstractC1420hka hka, byte[] bArr) {
        this.f6025a = hka;
        this.f6026b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1420hka
    public final AbstractC1213eka a() {
        AbstractC1420hka hka = this.f6025a;
        byte[] bArr = this.f6026b;
        return new C0305En(new C1282fka(bArr), bArr.length, hka.a());
    }
}
