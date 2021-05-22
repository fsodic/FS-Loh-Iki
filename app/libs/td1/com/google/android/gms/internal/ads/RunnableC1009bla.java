package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bla  reason: case insensitive filesystem */
public final class RunnableC1009bla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3932a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f3933b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3934c;
    private final /* synthetic */ _ka d;

    RunnableC1009bla(_ka _ka, String str, long j, long j2) {
        this.d = _ka;
        this.f3932a = str;
        this.f3933b = j;
        this.f3934c = j2;
    }

    public final void run() {
        this.d.f3754b.a(this.f3932a, this.f3933b, this.f3934c);
    }
}
