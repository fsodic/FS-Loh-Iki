package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Od  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0555Od implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0581Pd f2756a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC0268Dc f2757b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f2758c;

    RunnableC0555Od(C0581Pd pd, AbstractC0268Dc dc, Map map) {
        this.f2756a = pd;
        this.f2757b = dc;
        this.f2758c = map;
    }

    public final void run() {
        this.f2756a.a(this.f2757b, this.f2758c);
    }
}
