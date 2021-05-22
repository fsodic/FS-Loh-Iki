package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class Yla implements Comparator<Lla> {
    public Yla(Ula ula) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Lla lla, Lla lla2) {
        Lla lla3 = lla;
        Lla lla4 = lla2;
        if (lla3.b() < lla4.b()) {
            return -1;
        }
        if (lla3.b() > lla4.b()) {
            return 1;
        }
        if (lla3.a() < lla4.a()) {
            return -1;
        }
        if (lla3.a() > lla4.a()) {
            return 1;
        }
        float d = (lla3.d() - lla3.b()) * (lla3.c() - lla3.a());
        float d2 = (lla4.d() - lla4.b()) * (lla4.c() - lla4.a());
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }
}
