package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uka  reason: case insensitive filesystem */
final class RunnableC2315uka implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC0959b f5753a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Tia f5754b;

    RunnableC2315uka(Tia tia, AbstractC0959b bVar) {
        this.f5754b = tia;
        this.f5753a = bVar;
    }

    public final void run() {
        try {
            Tia.a(this.f5754b).put(this.f5753a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
