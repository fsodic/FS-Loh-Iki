package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.rA  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC2061rA implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1924pA f5386a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f5387b;

    RunnableC2061rA(C1924pA pAVar, ViewGroup viewGroup) {
        this.f5386a = pAVar;
        this.f5387b = viewGroup;
    }

    public final void run() {
        this.f5386a.b(this.f5387b);
    }
}
