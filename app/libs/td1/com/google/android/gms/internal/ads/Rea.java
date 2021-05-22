package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class Rea implements AbstractC1410hfa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3029a;

    Rea(Pda pda, Activity activity) {
        this.f3029a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1410hfa
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f3029a);
    }
}
