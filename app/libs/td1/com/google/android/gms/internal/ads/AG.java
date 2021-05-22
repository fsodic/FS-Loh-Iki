package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class AG implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC2067rG f1492a;

    /* renamed from: b  reason: collision with root package name */
    private final SW f1493b;

    /* renamed from: c  reason: collision with root package name */
    private final SW f1494c;

    AG(BinderC2067rG rGVar, SW sw, SW sw2) {
        this.f1492a = rGVar;
        this.f1493b = sw;
        this.f1494c = sw2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f1492a.a(this.f1493b, this.f1494c);
    }
}
