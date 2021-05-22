package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ffa  reason: case insensitive filesystem */
final class C1272ffa implements AbstractC1410hfa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4313a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4314b;

    C1272ffa(Pda pda, Activity activity, Bundle bundle) {
        this.f4313a = activity;
        this.f4314b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1410hfa
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f4313a, this.f4314b);
    }
}
