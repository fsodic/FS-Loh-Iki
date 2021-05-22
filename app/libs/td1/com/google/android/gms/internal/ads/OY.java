package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

final class OY implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Context f2751a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f2752b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Activity f2753c;

    OY(C1810nY nYVar, Context context, View view, Activity activity) {
        this.f2751a = context;
        this.f2752b = view;
        this.f2753c = activity;
    }

    public final void run() {
        try {
            C1810nY.u.a(this.f2751a, this.f2752b, this.f2753c);
        } catch (Exception e) {
            C1810nY.w.a(2020, -1, e);
        }
    }
}
