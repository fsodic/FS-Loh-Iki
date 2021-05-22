package com.google.android.gms.internal.ads;

import a.c.b;

public final class RA implements AbstractC1229ev {

    /* renamed from: a  reason: collision with root package name */
    private final C0707Tz f2986a;

    /* renamed from: b  reason: collision with root package name */
    private final C0811Xz f2987b;

    public RA(C0707Tz tz, C0811Xz xz) {
        this.f2986a = tz;
        this.f2987b = xz;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1229ev
    public final void b() {
        if (this.f2986a.v() != null) {
            AbstractC1564jo u = this.f2986a.u();
            AbstractC1564jo t = this.f2986a.t();
            if (u == null) {
                u = t != null ? t : null;
            }
            if (this.f2987b.a() && u != null) {
                u.a("onSdkImpression", new b());
            }
        }
    }
}
