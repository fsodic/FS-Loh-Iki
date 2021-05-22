package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Aaa implements AbstractC1947pX {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f1521a = new Daa();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<Cipher> f1522b = new Caa();

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f1523c;
    private final byte[] d;
    private final SecretKeySpec e;
    private final int f;

    public Aaa(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.f = i;
            C1746mba.a(bArr.length);
            this.e = new SecretKeySpec(bArr, "AES");
            Cipher cipher = f1521a.get();
            cipher.init(1, this.e);
            this.f1523c = a(cipher.doFinal(new byte[16]));
            this.d = a(this.f1523c);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private final byte[] a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        byte[] b2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            b2 = b(bArr3, this.f1523c);
        } else {
            byte[] doFinal = cipher.doFinal(bArr3);
            byte[] bArr4 = doFinal;
            int i4 = 0;
            while (i3 - i4 > 16) {
                for (int i5 = 0; i5 < 16; i5++) {
                    bArr4[i5] = (byte) (bArr4[i5] ^ bArr[(i2 + i4) + i5]);
                }
                bArr4 = cipher.doFinal(bArr4);
                i4 += 16;
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
            if (copyOfRange.length == 16) {
                bArr2 = b(copyOfRange, this.f1523c);
            } else {
                byte[] copyOf = Arrays.copyOf(this.d, 16);
                for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                    copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                }
                copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
                bArr2 = copyOf;
            }
            b2 = b(bArr4, bArr2);
        }
        return cipher.doFinal(b2);
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        int i4 = bArr[15] << 1;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i4 ^ i);
        return bArr2;
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1947pX
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[(bArr.length + i + 16)];
            byte[] a2 = C1677lba.a(i);
            System.arraycopy(a2, 0, bArr3, 0, this.f);
            Cipher cipher = f1521a.get();
            cipher.init(1, this.e);
            byte[] a3 = a(cipher, 0, a2, 0, a2.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] a4 = a(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = f1522b.get();
            cipher2.init(1, this.e, new IvParameterSpec(a3));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f);
            byte[] a5 = a(cipher, 2, bArr3, this.f, bArr.length);
            int length2 = bArr.length + this.f;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr3[length2 + i2] = (byte) ((a4[i2] ^ a3[i2]) ^ a5[i2]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
