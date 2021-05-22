package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.AbstractC2092rca;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dca  reason: case insensitive filesystem */
final class C1129dca implements AbstractC1752mea {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0991bca f4115a;

    private C1129dca(AbstractC0991bca bca) {
        C2230tca.a((Object) bca, "output");
        this.f4115a = bca;
        this.f4115a.f3913c = this;
    }

    public static C1129dca a(AbstractC0991bca bca) {
        C1129dca dca = bca.f3913c;
        return dca != null ? dca : new C1129dca(bca);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final int a() {
        return AbstractC2092rca.e.l;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i) {
        this.f4115a.a(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, double d) {
        this.f4115a.a(i, d);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, float f) {
        this.f4115a.a(i, f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, int i2) {
        this.f4115a.b(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, long j) {
        this.f4115a.c(i, j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, Iba iba) {
        this.f4115a.a(i, iba);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, Object obj) {
        if (obj instanceof Iba) {
            this.f4115a.b(i, (Iba) obj);
        } else {
            this.f4115a.a(i, (AbstractC0993bda) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, Object obj, AbstractC2439wda wda) {
        AbstractC0991bca bca = this.f4115a;
        bca.a(i, 3);
        wda.a((Object) ((AbstractC0993bda) obj), (AbstractC1752mea) bca.f3913c);
        bca.a(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, String str) {
        this.f4115a.a(i, str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, List<Iba> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f4115a.a(i, list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, List<?> list, AbstractC2439wda wda) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b(i, list.get(i2), wda);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.b(list.get(i4).booleanValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void a(int i, boolean z) {
        this.f4115a.a(i, z);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void b(int i) {
        this.f4115a.a(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void b(int i, int i2) {
        this.f4115a.e(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void b(int i, Object obj, AbstractC2439wda wda) {
        this.f4115a.a(i, (AbstractC0993bda) obj, wda);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof Mca) {
            Mca mca = (Mca) list;
            while (i2 < list.size()) {
                Object g = mca.g(i2);
                if (g instanceof String) {
                    this.f4115a.a(i, (String) g);
                } else {
                    this.f4115a.a(i, (Iba) g);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.a(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void b(int i, List<?> list, AbstractC2439wda wda) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            a(i, list.get(i2), wda);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void b(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.f(list.get(i4).intValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void c(int i, int i2) {
        this.f4115a.e(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void c(int i, long j) {
        this.f4115a.b(i, j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void c(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.k(list.get(i4).intValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.b(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void d(int i, int i2) {
        this.f4115a.c(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void d(int i, long j) {
        this.f4115a.a(i, j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void d(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.d(list.get(i4).longValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void e(int i, int i2) {
        this.f4115a.b(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void e(int i, long j) {
        this.f4115a.a(i, j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.h(list.get(i4).longValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void f(int i, int i2) {
        this.f4115a.d(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void f(int i, long j) {
        this.f4115a.c(i, j);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.i(list.get(i4).intValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.g(list.get(i4).intValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.c(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void h(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.j(list.get(i4).intValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.e(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.g(list.get(i4).longValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.c(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.f(list.get(i4).longValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.b(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void k(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.e(list.get(i4).longValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.a(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void l(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.h(list.get(i4).intValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.d(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void m(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.b(list.get(i4).doubleValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1752mea
    public final void n(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f4115a.a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC0991bca.b(list.get(i4).floatValue());
            }
            this.f4115a.b(i3);
            while (i2 < list.size()) {
                this.f4115a.a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f4115a.a(i, list.get(i2).floatValue());
            i2++;
        }
    }
}
