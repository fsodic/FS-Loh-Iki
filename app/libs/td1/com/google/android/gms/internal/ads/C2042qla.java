package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qla  reason: case insensitive filesystem */
public final class C2042qla implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f5351a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f5352b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5353c = false;

    public C2042qla(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f5352b = new WeakReference<>(activityLifecycleCallbacks);
        this.f5351a = application;
    }

    private final void a(AbstractC2662zla zla) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f5352b.get();
            if (activityLifecycleCallbacks != null) {
                zla.a(activityLifecycleCallbacks);
            } else if (!this.f5353c) {
                this.f5351a.unregisterActivityLifecycleCallbacks(this);
                this.f5353c = true;
            }
        } catch (Exception e) {
            C0745Vl.b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C1973pla(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new C2455wla(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new C2317ula(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new C2110rla(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C2524xla(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new C2179sla(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new C2248tla(this, activity));
    }
}
