package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Xd  reason: case insensitive filesystem */
final class RunnableC0789Xd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3514a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0659Sd f3515b;

    RunnableC0789Xd(C0659Sd sd, String str) {
        this.f3515b = sd;
        this.f3514a = str;
    }

    public final void run() {
        C0659Sd.a(this.f3515b).loadData(this.f3514a, "text/html", "UTF-8");
    }
}
