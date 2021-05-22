package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pla  reason: case insensitive filesystem */
final class C1973pla implements AbstractC2662zla {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f5264a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f5265b;

    C1973pla(C2042qla qla, Activity activity, Bundle bundle) {
        this.f5264a = activity;
        this.f5265b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2662zla
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f5264a, this.f5265b);
    }
}
