package com.google.android.gms.internal.ads;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.no  reason: case insensitive filesystem */
public final class RunnableC1840no implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ View f5075a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC1761mj f5076b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f5077c;
    private final /* synthetic */ C1771mo d;

    RunnableC1840no(C1771mo moVar, View view, AbstractC1761mj mjVar, int i) {
        this.d = moVar;
        this.f5075a = view;
        this.f5076b = mjVar;
        this.f5077c = i;
    }

    public final void run() {
        this.d.a((C1771mo) this.f5075a, (View) this.f5076b, (AbstractC1761mj) (this.f5077c - 1));
    }
}
