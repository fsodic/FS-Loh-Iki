package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final l f1112a;

    /* renamed from: b  reason: collision with root package name */
    private final Drawable f1113b;

    k(l lVar, Drawable drawable) {
        this.f1112a = lVar;
        this.f1113b = drawable;
    }

    public final void run() {
        l lVar = this.f1112a;
        lVar.d.f1100b.getWindow().setBackgroundDrawable(this.f1113b);
    }
}
