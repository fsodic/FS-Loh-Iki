package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.ula  reason: case insensitive filesystem */
final class C2317ula implements AbstractC2662zla {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5755a;

    C2317ula(C2042qla qla, Activity activity) {
        this.f5755a = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2662zla
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f5755a);
    }
}
