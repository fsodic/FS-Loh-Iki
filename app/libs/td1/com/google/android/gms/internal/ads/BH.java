package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class BH implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f1593a;

    private BH(AbstractC1564jo joVar) {
        this.f1593a = joVar;
    }

    static Runnable a(AbstractC1564jo joVar) {
        return new BH(joVar);
    }

    public final void run() {
        this.f1593a.g();
    }
}
