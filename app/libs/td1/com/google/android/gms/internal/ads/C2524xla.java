package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xla  reason: case insensitive filesystem */
final class C2524xla implements AbstractC2662zla {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f6018a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f6019b;

    C2524xla(C2042qla qla, Activity activity, Bundle bundle) {
        this.f6018a = activity;
        this.f6019b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2662zla
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f6018a, this.f6019b);
    }
}
