package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mja  reason: case insensitive filesystem */
final class RunnableC1762mja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ IOException f4983a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1486ija f4984b;

    RunnableC1762mja(C1486ija ija, IOException iOException) {
        this.f4984b = ija;
        this.f4983a = iOException;
    }

    public final void run() {
        this.f4984b.e.a(this.f4983a);
    }
}
