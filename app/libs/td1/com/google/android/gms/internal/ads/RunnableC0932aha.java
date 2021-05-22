package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.aha  reason: case insensitive filesystem */
final class RunnableC0932aha implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3828a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f3829b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3830c;
    private final /* synthetic */ Zga d;

    RunnableC0932aha(Zga zga, String str, long j, long j2) {
        this.d = zga;
        this.f3828a = str;
        this.f3829b = j;
        this.f3830c = j2;
    }

    public final void run() {
        Zga.a(this.d).a(this.f3828a, this.f3829b, this.f3830c);
    }
}
