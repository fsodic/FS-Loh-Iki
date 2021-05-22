package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.el  reason: case insensitive filesystem */
public final class C1214el {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f4231a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f4232b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f4233c;
    private final int[] d;
    private int e;

    private C1214el(C1283fl flVar) {
        int size = C1283fl.a(flVar).size();
        this.f4231a = (String[]) C1283fl.b(flVar).toArray(new String[size]);
        this.f4232b = a(C1283fl.a(flVar));
        this.f4233c = a(C1283fl.c(flVar));
        this.d = new int[size];
        this.e = 0;
    }

    private static double[] a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final List<C1352gl> a() {
        ArrayList arrayList = new ArrayList(this.f4231a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f4231a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d2 = this.f4233c[i];
            double d3 = this.f4232b[i];
            int[] iArr = this.d;
            double d4 = (double) iArr[i];
            double d5 = (double) this.e;
            Double.isNaN(d4);
            Double.isNaN(d5);
            arrayList.add(new C1352gl(str, d2, d3, d4 / d5, iArr[i]));
            i++;
        }
    }

    public final void a(double d2) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f4233c;
            if (i < dArr.length) {
                if (dArr[i] <= d2 && d2 < this.f4232b[i]) {
                    int[] iArr = this.d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d2 >= this.f4233c[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
