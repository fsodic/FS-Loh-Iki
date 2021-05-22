package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oz  reason: case insensitive filesystem */
final /* synthetic */ class RunnableC0577Oz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0891aA f2802a;

    private RunnableC0577Oz(AbstractC0891aA aAVar) {
        this.f2802a = aAVar;
    }

    static Runnable a(AbstractC0891aA aAVar) {
        return new RunnableC0577Oz(aAVar);
    }

    public final void run() {
        this.f2802a.b();
    }
}
