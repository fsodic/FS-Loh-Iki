package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.gms.internal.ads.Lk  reason: case insensitive filesystem */
final /* synthetic */ class View$OnApplyWindowInsetsListenerC0484Lk implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    private final C0510Mk f2523a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f2524b;

    View$OnApplyWindowInsetsListenerC0484Lk(C0510Mk mk, Activity activity) {
        this.f2523a = mk;
        this.f2524b = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return C0510Mk.a(this.f2524b, view, windowInsets);
    }
}
