package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.yj  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC2588yj implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2243tj f6123a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0457Kj f6124b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6125c;

    RunnableC2588yj(C2243tj tjVar, AbstractC0457Kj kj, String str) {
        this.f6123a = tjVar;
        this.f6124b = kj;
        this.f6125c = str;
    }

    public final void run() {
        this.f6123a.a(this.f6124b, this.f6125c);
    }
}
