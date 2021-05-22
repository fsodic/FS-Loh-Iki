package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class Pda implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Application f2854a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f2855b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2856c = false;

    public Pda(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f2855b = new WeakReference<>(activityLifecycleCallbacks);
        this.f2854a = application;
    }

    private final void a(AbstractC1410hfa hfa) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f2855b.get();
            if (activityLifecycleCallbacks != null) {
                hfa.a(activityLifecycleCallbacks);
            } else if (!this.f2856c) {
                this.f2854a.unregisterActivityLifecycleCallbacks(this);
                this.f2856c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C1066cfa(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new C1478ifa(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new C1135dfa(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new C1203efa(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C1272ffa(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new Rea(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new C1341gfa(this, activity));
    }
}
