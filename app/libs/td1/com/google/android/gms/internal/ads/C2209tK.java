package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.tK  reason: case insensitive filesystem */
public final class C2209tK implements AbstractC0651Rv {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<AbstractC2118rpa> f5595a = new AtomicReference<>();

    @Override // com.google.android.gms.internal.ads.AbstractC0651Rv
    public final void a(C1152doa doa) {
        C1251fQ.a(this.f5595a, new C2416wK(doa));
    }

    public final void a(AbstractC2118rpa rpa) {
        this.f5595a.set(rpa);
    }
}
