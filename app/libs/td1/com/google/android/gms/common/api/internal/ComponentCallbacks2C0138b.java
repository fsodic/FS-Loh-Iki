package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.b  reason: case insensitive filesystem */
public final class ComponentCallbacks2C0138b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private static final ComponentCallbacks2C0138b f1244a = new ComponentCallbacks2C0138b();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f1245b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f1246c = new AtomicBoolean();
    private final ArrayList<a> d = new ArrayList<>();
    private boolean e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface a {
        void a(boolean z);
    }

    private ComponentCallbacks2C0138b() {
    }

    public static ComponentCallbacks2C0138b a() {
        return f1244a;
    }

    public static void a(Application application) {
        synchronized (f1244a) {
            if (!f1244a.e) {
                application.registerActivityLifecycleCallbacks(f1244a);
                application.registerComponentCallbacks(f1244a);
                f1244a.e = true;
            }
        }
    }

    private final void b(boolean z) {
        synchronized (f1244a) {
            ArrayList<a> arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f1244a) {
            this.d.add(aVar);
        }
    }

    @TargetApi(16)
    public final boolean a(boolean z) {
        if (!this.f1246c.get()) {
            if (!o.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f1246c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f1245b.set(true);
            }
        }
        return b();
    }

    public final boolean b() {
        return this.f1245b.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f1245b.compareAndSet(true, false);
        this.f1246c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f1245b.compareAndSet(true, false);
        this.f1246c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f1245b.compareAndSet(false, true)) {
            this.f1246c.set(true);
            b(true);
        }
    }
}
