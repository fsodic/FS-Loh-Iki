package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class Lba extends Tba {
    private final int f;
    private final int g;

    Lba(byte[] bArr, int i, int i2) {
        super(bArr);
        Iba.c(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Iba, com.google.android.gms.internal.ads.Tba
    public final void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.e, r() + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.Iba, com.google.android.gms.internal.ads.Tba
    public final byte h(int i) {
        Iba.a(i, size());
        return this.e[this.f + i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iba, com.google.android.gms.internal.ads.Tba
    public final byte i(int i) {
        return this.e[this.f + i];
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Tba
    public final int r() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.Iba, com.google.android.gms.internal.ads.Tba
    public final int size() {
        return this.g;
    }
}
