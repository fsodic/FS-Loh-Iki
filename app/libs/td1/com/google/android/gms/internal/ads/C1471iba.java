package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.iba  reason: case insensitive filesystem */
final class C1471iba {
    private static long a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    private static long a(byte[] bArr, int i, int i2) {
        return (a(bArr, i) >> i2) & 67108863;
    }

    private static void a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long a2 = a(bArr, 0, 0) & 67108863;
            int i = 2;
            int i2 = 3;
            long a3 = a(bArr, 3, 2) & 67108611;
            long a4 = a(bArr, 6, 4) & 67092735;
            long a5 = a(bArr, 9, 6) & 66076671;
            long a6 = a(bArr, 12, 8) & 1048575;
            long j = a3 * 5;
            long j2 = a4 * 5;
            long j3 = a5 * 5;
            long j4 = a6 * 5;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            int i3 = 0;
            while (i3 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i3);
                System.arraycopy(bArr2, i3, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, 17, (byte) 0);
                }
                long a7 = j9 + a(bArr3, 0, 0);
                long a8 = j5 + a(bArr3, i2, i);
                long a9 = j6 + a(bArr3, 6, 4);
                long a10 = j7 + a(bArr3, 9, 6);
                long a11 = j8 + (a(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
                long j10 = (a7 * a2) + (a8 * j4) + (a9 * j3) + (a10 * j2) + (a11 * j);
                long j11 = (a7 * a3) + (a8 * a2) + (a9 * j4) + (a10 * j3) + (a11 * j2) + (j10 >> 26);
                long j12 = (a7 * a4) + (a8 * a3) + (a9 * a2) + (a10 * j4) + (a11 * j3) + (j11 >> 26);
                long j13 = (a7 * a5) + (a8 * a4) + (a9 * a3) + (a10 * a2) + (a11 * j4) + (j12 >> 26);
                long j14 = (a7 * a6) + (a8 * a5) + (a9 * a4) + (a10 * a3) + (a11 * a2) + (j13 >> 26);
                long j15 = (j10 & 67108863) + ((j14 >> 26) * 5);
                j5 = (j11 & 67108863) + (j15 >> 26);
                i3 += 16;
                j6 = j12 & 67108863;
                j7 = j13 & 67108863;
                j8 = j14 & 67108863;
                j9 = j15 & 67108863;
                i = 2;
                i2 = 3;
            }
            long j16 = j6 + (j5 >> 26);
            long j17 = j16 & 67108863;
            long j18 = j7 + (j16 >> 26);
            long j19 = j18 & 67108863;
            long j20 = j8 + (j18 >> 26);
            long j21 = j20 & 67108863;
            long j22 = j9 + ((j20 >> 26) * 5);
            long j23 = j22 & 67108863;
            long j24 = (j5 & 67108863) + (j22 >> 26);
            long j25 = j23 + 5;
            long j26 = j25 & 67108863;
            long j27 = (j25 >> 26) + j24;
            long j28 = j17 + (j27 >> 26);
            long j29 = j19 + (j28 >> 26);
            long j30 = j29 & 67108863;
            long j31 = (j21 + (j29 >> 26)) - 67108864;
            long j32 = j31 >> 63;
            long j33 = j23 & j32;
            long j34 = j24 & j32;
            long j35 = j17 & j32;
            long j36 = j19 & j32;
            long j37 = j21 & j32;
            long j38 = j32 ^ -1;
            long j39 = (j27 & 67108863 & j38) | j34;
            long j40 = (j28 & 67108863 & j38) | j35;
            long j41 = (j30 & j38) | j36;
            long j42 = (j31 & j38) | j37;
            long a12 = (((j39 << 26) | j33 | (j26 & j38)) & 4294967295L) + a(bArr, 16);
            long j43 = a12 & 4294967295L;
            long a13 = (((j39 >> 6) | (j40 << 20)) & 4294967295L) + a(bArr, 20) + (a12 >> 32);
            long j44 = a13 & 4294967295L;
            long a14 = (((j40 >> 12) | (j41 << 14)) & 4294967295L) + a(bArr, 24) + (a13 >> 32);
            long j45 = a14 & 4294967295L;
            byte[] bArr4 = new byte[16];
            a(bArr4, j43, 0);
            a(bArr4, j44, 4);
            a(bArr4, j45, 8);
            a(bArr4, ((((j41 >> 18) | (j42 << 8)) & 4294967295L) + a(bArr, 28) + (a14 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
