package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.xG  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC2481xG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final SW f5960a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f5961b;

    CallableC2481xG(SW sw, SW sw2) {
        this.f5960a = sw;
        this.f5961b = sw2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SW sw = this.f5960a;
        SW sw2 = this.f5961b;
        return new GG((NG) sw.get(), ((HG) sw2.get()).f2109b, ((HG) sw2.get()).f2108a);
    }
}
