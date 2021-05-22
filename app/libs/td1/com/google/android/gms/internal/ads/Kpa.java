package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.e.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class Kpa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Ipa f2438a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2439b;

    Kpa(Ipa ipa, c cVar) {
        this.f2438a = ipa;
        this.f2439b = cVar;
    }

    public final void run() {
        this.f2438a.a(this.f2439b);
    }
}
