package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.tla  reason: case insensitive filesystem */
final class C2248tla implements AbstractC2662zla {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5650a;

    C2248tla(C2042qla qla, Activity activity) {
        this.f5650a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2662zla
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f5650a);
    }
}
