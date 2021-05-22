package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.fl */
public final class C1283fl {

    /* renamed from: a */
    private final List<String> f4334a = new ArrayList();

    /* renamed from: b */
    private final List<Double> f4335b = new ArrayList();

    /* renamed from: c */
    private final List<Double> f4336c = new ArrayList();

    public final C1214el a() {
        return new C1214el(this);
    }

    public final C1283fl a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f4334a.size()) {
            double doubleValue = this.f4336c.get(i).doubleValue();
            double doubleValue2 = this.f4335b.get(i).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f4334a.add(i, str);
        this.f4336c.add(i, Double.valueOf(d));
        this.f4335b.add(i, Double.valueOf(d2));
        return this;
    }
}
