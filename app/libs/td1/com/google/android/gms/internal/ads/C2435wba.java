package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wba  reason: case insensitive filesystem */
public final class C2435wba {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5902a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private int f5903b;

    /* renamed from: c  reason: collision with root package name */
    private int f5904c;

    public C2435wba(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f5902a[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.f5902a;
            i2 = (i2 + bArr2[i3] + bArr[i3 % bArr.length]) & 255;
            byte b2 = bArr2[i3];
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b2;
        }
        this.f5903b = 0;
        this.f5904c = 0;
    }

    public final void a(byte[] bArr) {
        int i = this.f5903b;
        int i2 = this.f5904c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            byte[] bArr2 = this.f5902a;
            i2 = (i2 + bArr2[i]) & 255;
            byte b2 = bArr2[i];
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + bArr2[i2]) & 255] ^ bArr[i3]);
        }
        this.f5903b = i;
        this.f5904c = i2;
    }
}
