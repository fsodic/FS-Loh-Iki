package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class Rka {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f3036a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3037b;

    private Rka(List<byte[]> list, int i) {
        this.f3036a = list;
        this.f3037b = i;
    }

    public static Rka a(Dka dka) {
        try {
            dka.d(21);
            int g = dka.g() & 3;
            int g2 = dka.g();
            int b2 = dka.b();
            int i = 0;
            int i2 = 0;
            while (i < g2) {
                dka.d(1);
                int h = dka.h();
                int i3 = i2;
                for (int i4 = 0; i4 < h; i4++) {
                    int h2 = dka.h();
                    i3 += h2 + 4;
                    dka.d(h2);
                }
                i++;
                i2 = i3;
            }
            dka.c(b2);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < g2) {
                dka.d(1);
                int h3 = dka.h();
                int i7 = i6;
                for (int i8 = 0; i8 < h3; i8++) {
                    int h4 = dka.h();
                    System.arraycopy(Cka.f1722a, 0, bArr, i7, Cka.f1722a.length);
                    int length = i7 + Cka.f1722a.length;
                    System.arraycopy(dka.f1807a, dka.b(), bArr, length, h4);
                    i7 = length + h4;
                    dka.d(h4);
                }
                i5++;
                i6 = i7;
            }
            return new Rka(i2 == 0 ? null : Collections.singletonList(bArr), g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Kga("Error parsing HEVC config", e);
        }
    }
}
