package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads._d  reason: case insensitive filesystem */
final class RunnableC0867_d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3731a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0659Sd f3732b;

    RunnableC0867_d(C0659Sd sd, String str) {
        this.f3732b = sd;
        this.f3731a = str;
    }

    public final void run() {
        C0659Sd.a(this.f3732b).loadData(this.f3731a, "text/html", "UTF-8");
    }
}
