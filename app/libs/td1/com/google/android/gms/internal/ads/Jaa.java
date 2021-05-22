package com.google.android.gms.internal.ads;

final class Jaa extends Iaa {
    Jaa(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iaa
    public final int a() {
        return 12;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.Iaa
    public final int[] a(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            Iaa.a(iArr2, this.f2234b);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length << 5)));
    }
}
