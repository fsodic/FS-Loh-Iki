package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
@TargetApi(14)
public final class Dla implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private Activity f1812a;

    /* renamed from: b  reason: collision with root package name */
    private Context f1813b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f1814c = new Object();
    private boolean d = true;
    private boolean e = false;
    private final List<Fla> f = new ArrayList();
    private final List<Qla> g = new ArrayList();
    private Runnable h;
    private boolean i = false;
    private long j;

    Dla() {
    }

    private final void a(Activity activity) {
        synchronized (this.f1814c) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f1812a = activity;
            }
        }
    }

    public final Activity a() {
        return this.f1812a;
    }

    public final void a(Application application, Context context) {
        if (!this.i) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.f1813b = application;
            this.j = ((Long) C2392voa.e().a(C2474x.wa)).longValue();
            this.i = true;
        }
    }

    public final void a(Fla fla) {
        synchronized (this.f1814c) {
            this.f.add(fla);
        }
    }

    public final Context b() {
        return this.f1813b;
    }

    public final void b(Fla fla) {
        synchronized (this.f1814c) {
            this.f.remove(fla);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f1814c) {
            if (this.f1812a != null) {
                if (this.f1812a.equals(activity)) {
                    this.f1812a = null;
                }
                Iterator<Qla> it = this.g.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        q.g().a(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        C0745Vl.b(BuildConfig.FLAVOR, e2);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f1814c) {
            for (Qla qla : this.g) {
                try {
                    qla.onActivityPaused(activity);
                } catch (Exception e2) {
                    q.g().a(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    C0745Vl.b(BuildConfig.FLAVOR, e2);
                }
            }
        }
        this.e = true;
        Runnable runnable = this.h;
        if (runnable != null) {
            C2452wk.f5921a.removeCallbacks(runnable);
        }
        _U _u = C2452wk.f5921a;
        Cla cla = new Cla(this);
        this.h = cla;
        _u.postDelayed(cla, this.j);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.e = false;
        boolean z = !this.d;
        this.d = true;
        Runnable runnable = this.h;
        if (runnable != null) {
            C2452wk.f5921a.removeCallbacks(runnable);
        }
        synchronized (this.f1814c) {
            for (Qla qla : this.g) {
                try {
                    qla.onActivityResumed(activity);
                } catch (Exception e2) {
                    q.g().a(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    C0745Vl.b(BuildConfig.FLAVOR, e2);
                }
            }
            if (z) {
                for (Fla fla : this.f) {
                    try {
                        fla.a(true);
                    } catch (Exception e3) {
                        C0745Vl.b(BuildConfig.FLAVOR, e3);
                    }
                }
            } else {
                C0745Vl.a("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
