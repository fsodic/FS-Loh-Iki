package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.vka  reason: case insensitive filesystem */
public final class C2384vka {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f5830a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f5831b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f5832c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(Eka eka) {
        int a2 = eka.a(5);
        return a2 == 31 ? eka.a(6) + 32 : a2;
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        Eka eka = new Eka(bArr);
        int a2 = a(eka);
        int b2 = b(eka);
        int a3 = eka.a(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(eka);
            if (a(eka) == 22) {
                a3 = eka.a(4);
            }
        }
        int i = f5832c[a3];
        C2453wka.a(i != -1);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f5830a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f5830a.length, i2);
        return bArr3;
    }

    private static int b(Eka eka) {
        int a2 = eka.a(4);
        if (a2 == 15) {
            return eka.a(24);
        }
        C2453wka.a(a2 < 13);
        return f5831b[a2];
    }
}
