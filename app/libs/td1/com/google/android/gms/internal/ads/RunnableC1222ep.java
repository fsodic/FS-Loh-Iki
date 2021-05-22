package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ep  reason: case insensitive filesystem */
final class RunnableC1222ep implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ View f4246a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AbstractC1761mj f4247b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f4248c;
    private final /* synthetic */ C1085cp d;

    RunnableC1222ep(C1085cp cpVar, View view, AbstractC1761mj mjVar, int i) {
        this.d = cpVar;
        this.f4246a = view;
        this.f4247b = mjVar;
        this.f4248c = i;
    }

    public final void run() {
        C1085cp.a(this.d, this.f4246a, this.f4247b, this.f4248c - 1);
    }
}
