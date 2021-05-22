package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Fd  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0321Fd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0243Cd f1971a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1972b;

    RunnableC0321Fd(C0243Cd cd, String str) {
        this.f1971a = cd;
        this.f1972b = str;
    }

    public final void run() {
        this.f1971a.h(this.f1972b);
    }
}
