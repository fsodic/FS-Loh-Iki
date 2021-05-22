package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.sla  reason: case insensitive filesystem */
final class C2179sla implements AbstractC2662zla {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5548a;

    C2179sla(C2042qla qla, Activity activity) {
        this.f5548a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2662zla
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f5548a);
    }
}
