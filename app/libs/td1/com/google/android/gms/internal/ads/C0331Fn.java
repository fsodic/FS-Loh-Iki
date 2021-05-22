package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fn  reason: case insensitive filesystem */
public final class C0331Fn implements AbstractC0799Xn {
    @Override // com.google.android.gms.internal.ads.AbstractC0799Xn
    public final AbstractC0565On a(AbstractC0798Xm xm, int i, String str, C0824Ym ym) {
        if (i <= 0) {
            return new C0747Vn(xm);
        }
        int f = C2251tn.f();
        return f < ym.h ? new C0877_n(xm, ym) : f < ym.f3591b ? new C0945ao(xm, ym) : new C0851Zn(xm);
    }
}
