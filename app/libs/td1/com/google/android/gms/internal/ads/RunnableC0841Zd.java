package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Zd  reason: case insensitive filesystem */
final class RunnableC0841Zd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3647a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0659Sd f3648b;

    RunnableC0841Zd(C0659Sd sd, String str) {
        this.f3648b = sd;
        this.f3647a = str;
    }

    public final void run() {
        C0659Sd.a(this.f3648b).loadUrl(this.f3647a);
    }
}
