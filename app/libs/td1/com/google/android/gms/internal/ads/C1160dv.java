package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.dv  reason: case insensitive filesystem */
public final class C1160dv extends C0834Yw<AbstractC1229ev> {

    /* renamed from: b  reason: collision with root package name */
    private boolean f4160b = false;

    public C1160dv(Set<C0523Mx<AbstractC1229ev>> set) {
        super(set);
    }

    public final synchronized void b() {
        if (!this.f4160b) {
            a(C1092cv.f4041a);
            this.f4160b = true;
        }
    }
}
