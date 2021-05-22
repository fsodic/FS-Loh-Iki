package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Im  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0408Im implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0382Hm f2272a;

    private RunnableC0408Im(AbstractC0382Hm hm) {
        this.f2272a = hm;
    }

    static Runnable a(AbstractC0382Hm hm) {
        return new RunnableC0408Im(hm);
    }

    public final void run() {
        this.f2272a.d();
    }
}
