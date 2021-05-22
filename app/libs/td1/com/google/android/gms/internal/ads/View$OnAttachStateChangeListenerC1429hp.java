package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.hp  reason: case insensitive filesystem */
final class View$OnAttachStateChangeListenerC1429hp implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AbstractC1761mj f4515a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C1085cp f4516b;

    View$OnAttachStateChangeListenerC1429hp(C1085cp cpVar, AbstractC1761mj mjVar) {
        this.f4516b = cpVar;
        this.f4515a = mjVar;
    }

    public final void onViewAttachedToWindow(View view) {
        C1085cp.a(this.f4516b, view, this.f4515a, 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
