package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.dfa  reason: case insensitive filesystem */
final class C1135dfa implements AbstractC1410hfa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4123a;

    C1135dfa(Pda pda, Activity activity) {
        this.f4123a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1410hfa
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f4123a);
    }
}
