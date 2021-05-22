package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.jja  reason: case insensitive filesystem */
public final class RunnableC1555jja implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1900oja f4711a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1486ija f4712b;

    RunnableC1555jja(C1486ija ija, C1900oja oja) {
        this.f4712b = ija;
        this.f4711a = oja;
    }

    public final void run() {
        this.f4711a.a();
        int size = this.f4712b.p.size();
        for (int i = 0; i < size; i++) {
            ((Dja) this.f4712b.p.valueAt(i)).a();
        }
    }
}
