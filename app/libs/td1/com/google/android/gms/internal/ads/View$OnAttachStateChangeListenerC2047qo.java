package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.qo  reason: case insensitive filesystem */
final class View$OnAttachStateChangeListenerC2047qo implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1761mj f5360a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1771mo f5361b;

    View$OnAttachStateChangeListenerC2047qo(C1771mo moVar, AbstractC1761mj mjVar) {
        this.f5361b = moVar;
        this.f5360a = mjVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f5361b.a((C1771mo) view, (View) this.f5360a, (AbstractC1761mj) 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
