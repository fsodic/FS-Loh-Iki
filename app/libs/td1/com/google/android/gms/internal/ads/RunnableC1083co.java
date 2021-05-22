package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.co  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC1083co implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0798Xm f4029a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4030b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4031c;

    RunnableC1083co(AbstractC0798Xm xm, boolean z, long j) {
        this.f4029a = xm;
        this.f4030b = z;
        this.f4031c = j;
    }

    public final void run() {
        this.f4029a.a(this.f4030b, this.f4031c);
    }
}
