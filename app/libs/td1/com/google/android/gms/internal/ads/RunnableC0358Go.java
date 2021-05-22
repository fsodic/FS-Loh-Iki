package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Go  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0358Go implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC0306Eo f2075a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2076b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2077c;
    private final boolean d;
    private final boolean e;

    RunnableC0358Go(BinderC0306Eo eo, int i, int i2, boolean z, boolean z2) {
        this.f2075a = eo;
        this.f2076b = i;
        this.f2077c = i2;
        this.d = z;
        this.e = z2;
    }

    public final void run() {
        this.f2075a.a(this.f2076b, this.f2077c, this.d, this.e);
    }
}
