package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class Lka {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f2525a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2526b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2527c;
    private final int d;
    public final float e;

    private Lka(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f2525a = list;
        this.f2526b = i;
        this.f2527c = i2;
        this.d = i3;
        this.e = f;
    }

    public static Lka a(Dka dka) {
        float f;
        int i;
        int i2;
        try {
            dka.d(4);
            int g = (dka.g() & 3) + 1;
            if (g != 3) {
                ArrayList arrayList = new ArrayList();
                int g2 = dka.g() & 31;
                for (int i3 = 0; i3 < g2; i3++) {
                    arrayList.add(b(dka));
                }
                int g3 = dka.g();
                for (int i4 = 0; i4 < g3; i4++) {
                    arrayList.add(b(dka));
                }
                if (g2 > 0) {
                    Bka a2 = Cka.a((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                    int i5 = a2.f1646b;
                    int i6 = a2.f1647c;
                    f = a2.d;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new Lka(arrayList, g, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new Kga("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(Dka dka) {
        int h = dka.h();
        int b2 = dka.b();
        dka.d(h);
        return C2384vka.a(dka.f1807a, b2, h);
    }
}
