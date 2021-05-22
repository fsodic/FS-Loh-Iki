package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.efa  reason: case insensitive filesystem */
final class C1203efa implements AbstractC1410hfa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4225a;

    C1203efa(Pda pda, Activity activity) {
        this.f4225a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1410hfa
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f4225a);
    }
}
