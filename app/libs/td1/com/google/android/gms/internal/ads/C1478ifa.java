package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ifa  reason: case insensitive filesystem */
final class C1478ifa implements AbstractC1410hfa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4583a;

    C1478ifa(Pda pda, Activity activity) {
        this.f4583a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1410hfa
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f4583a);
    }
}
