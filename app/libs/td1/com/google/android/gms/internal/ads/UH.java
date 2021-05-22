package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class UH implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final RH f3228a;

    /* renamed from: b  reason: collision with root package name */
    private final BR f3229b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f3230c;

    UH(RH rh, BR br, C1941pR pRVar) {
        this.f3228a = rh;
        this.f3229b = br;
        this.f3230c = pRVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3228a.c(this.f3229b, this.f3230c);
    }
}
