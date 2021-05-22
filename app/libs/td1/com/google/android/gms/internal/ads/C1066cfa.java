package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.cfa  reason: case insensitive filesystem */
final class C1066cfa implements AbstractC1410hfa {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4011a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4012b;

    C1066cfa(Pda pda, Activity activity, Bundle bundle) {
        this.f4011a = activity;
        this.f4012b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1410hfa
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f4011a, this.f4012b);
    }
}
