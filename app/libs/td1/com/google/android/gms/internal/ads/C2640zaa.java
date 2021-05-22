package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.zaa  reason: case insensitive filesystem */
public final class C2640zaa implements CX {

    /* renamed from: a  reason: collision with root package name */
    private final SecretKey f6192a;

    /* renamed from: b  reason: collision with root package name */
    private final int f6193b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f6194c;
    private byte[] d;

    public C2640zaa(byte[] bArr, int i) {
        C1746mba.a(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        } else if (i <= 16) {
            this.f6192a = new SecretKeySpec(bArr, "AES");
            this.f6193b = i;
            Cipher a2 = a();
            a2.init(1, this.f6192a);
            this.f6194c = Haa.a(a2.doFinal(new byte[16]));
            this.d = Haa.a(this.f6194c);
        } else {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
    }

    private static Cipher a() {
        return Xaa.f3508c.a("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.CX
    public final byte[] a(byte[] bArr) {
        byte[] bArr2;
        Cipher a2 = a();
        a2.init(1, this.f6192a);
        double length = (double) bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            bArr2 = Gaa.a(bArr, (max - 1) << 4, this.f6194c, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length < 16) {
                byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                copyOf[copyOfRange.length] = Byte.MIN_VALUE;
                bArr2 = Gaa.a(copyOf, this.d);
            } else {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
        }
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr3 = a2.doFinal(Gaa.a(bArr3, 0, bArr, i << 4, 16));
        }
        byte[] a3 = Gaa.a(bArr2, bArr3);
        byte[] bArr4 = new byte[this.f6193b];
        System.arraycopy(a2.doFinal(a3), 0, bArr4, 0, this.f6193b);
        return bArr4;
    }
}
