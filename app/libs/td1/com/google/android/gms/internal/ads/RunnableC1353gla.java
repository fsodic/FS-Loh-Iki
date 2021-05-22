package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gla  reason: case insensitive filesystem */
public final class RunnableC1353gla implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ int f4418a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f4419b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4420c;
    private final /* synthetic */ float d;
    private final /* synthetic */ _ka e;

    RunnableC1353gla(_ka _ka, int i, int i2, int i3, float f) {
        this.e = _ka;
        this.f4418a = i;
        this.f4419b = i2;
        this.f4420c = i3;
        this.d = f;
    }

    public final void run() {
        this.e.f3754b.a(this.f4418a, this.f4419b, this.f4420c, this.d);
    }
}
