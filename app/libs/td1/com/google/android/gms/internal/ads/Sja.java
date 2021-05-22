package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

public abstract class Sja extends Zja {

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Map<Lja, Vja>> f3116b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f3117c = new SparseBooleanArray();
    private int d = 0;
    private Wja e;

    @Override // com.google.android.gms.internal.ads.Zja
    public final C0938aka a(Pga[] pgaArr, Lja lja) {
        int[] iArr;
        int[] iArr2 = new int[(pgaArr.length + 1)];
        Ija[][] ijaArr = new Ija[(pgaArr.length + 1)][];
        int[][][] iArr3 = new int[(pgaArr.length + 1)][][];
        for (int i = 0; i < ijaArr.length; i++) {
            int i2 = lja.f2521b;
            ijaArr[i] = new Ija[i2];
            iArr3[i] = new int[i2][];
        }
        int[] iArr4 = new int[pgaArr.length];
        for (int i3 = 0; i3 < iArr4.length; i3++) {
            iArr4[i3] = pgaArr[i3].J();
        }
        for (int i4 = 0; i4 < lja.f2521b; i4++) {
            Ija a2 = lja.a(i4);
            int length = pgaArr.length;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= pgaArr.length) {
                    i5 = length;
                    break;
                }
                Pga pga = pgaArr[i5];
                int i7 = length;
                int i8 = i6;
                for (int i9 = 0; i9 < a2.f2261a; i9++) {
                    int a3 = pga.a(a2.a(i9)) & 3;
                    if (a3 > i8) {
                        if (a3 == 3) {
                            break;
                        }
                        i7 = i5;
                        i8 = a3;
                    }
                }
                i5++;
                i6 = i8;
                length = i7;
            }
            if (i5 == pgaArr.length) {
                iArr = new int[a2.f2261a];
            } else {
                Pga pga2 = pgaArr[i5];
                int[] iArr5 = new int[a2.f2261a];
                for (int i10 = 0; i10 < a2.f2261a; i10++) {
                    iArr5[i10] = pga2.a(a2.a(i10));
                }
                iArr = iArr5;
            }
            int i11 = iArr2[i5];
            ijaArr[i5][i11] = a2;
            iArr3[i5][i11] = iArr;
            iArr2[i5] = iArr2[i5] + 1;
        }
        Lja[] ljaArr = new Lja[pgaArr.length];
        int[] iArr6 = new int[pgaArr.length];
        for (int i12 = 0; i12 < pgaArr.length; i12++) {
            int i13 = iArr2[i12];
            ljaArr[i12] = new Lja((Ija[]) Arrays.copyOf(ijaArr[i12], i13));
            iArr3[i12] = (int[][]) Arrays.copyOf(iArr3[i12], i13);
            iArr6[i12] = pgaArr[i12].u();
        }
        Lja lja2 = new Lja((Ija[]) Arrays.copyOf(ijaArr[pgaArr.length], iArr2[pgaArr.length]));
        Yja[] a4 = a(pgaArr, ljaArr, iArr3);
        int i14 = 0;
        while (true) {
            Vja vja = null;
            if (i14 < pgaArr.length) {
                if (this.f3117c.get(i14)) {
                    a4[i14] = null;
                } else {
                    Lja lja3 = ljaArr[i14];
                    Map<Lja, Vja> map = this.f3116b.get(i14);
                    if (map != null) {
                        vja = map.get(lja3);
                    }
                    if (vja != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i14++;
            } else {
                Wja wja = new Wja(iArr6, ljaArr, iArr4, iArr3, lja2);
                Oga[] ogaArr = new Oga[pgaArr.length];
                for (int i15 = 0; i15 < pgaArr.length; i15++) {
                    ogaArr[i15] = a4[i15] != null ? Oga.f2772a : null;
                }
                return new C0938aka(lja, new _ja(a4), wja, ogaArr);
            }
        }
    }

    public final void a(int i, boolean z) {
        if (this.f3117c.get(i) != z) {
            this.f3117c.put(i, z);
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.Zja
    public final void a(Object obj) {
        this.e = (Wja) obj;
    }

    /* access modifiers changed from: protected */
    public abstract Yja[] a(Pga[] pgaArr, Lja[] ljaArr, int[][][] iArr);
}
