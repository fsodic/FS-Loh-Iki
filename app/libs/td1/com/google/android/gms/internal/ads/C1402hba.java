package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hba  reason: case insensitive filesystem */
public final class C1402hba {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4485a;

    private C1402hba(byte[] bArr, int i, int i2) {
        this.f4485a = new byte[i2];
        System.arraycopy(bArr, 0, this.f4485a, 0, i2);
    }

    public static C1402hba a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new C1402hba(bArr, 0, bArr.length);
    }

    public final byte[] a() {
        byte[] bArr = this.f4485a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
