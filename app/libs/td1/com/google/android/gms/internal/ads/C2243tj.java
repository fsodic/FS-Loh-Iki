package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import b.c.b.a.b.j;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.tj  reason: case insensitive filesystem */
public final class C2243tj {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<ThreadPoolExecutor> f5640a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final Object f5641b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private String f5642c = null;
    private String d = null;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicInteger f = new AtomicInteger(-1);
    private final AtomicReference<Object> g = new AtomicReference<>(null);
    private final AtomicReference<Object> h = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> i = new ConcurrentHashMap(9);
    private final AtomicReference<AbstractC2393vp> j = new AtomicReference<>(null);
    private final BlockingQueue<FutureTask<?>> k = new ArrayBlockingQueue(20);
    private final Object l = new Object();

    private static Bundle a(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String valueOf = String.valueOf(str);
            C0745Vl.b(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e2);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Object a(String str, Context context) {
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(this.g.get(), new Object[0]);
        } catch (Exception e2) {
            a(e2, str, true);
            return null;
        }
    }

    private final <T> T a(String str, T t, AbstractC0379Hj<T> hj) {
        synchronized (this.j) {
            if (this.j.get() != null) {
                try {
                    return hj.a(this.j.get());
                } catch (Exception e2) {
                    a(e2, str, false);
                }
            }
            return t;
        }
    }

    private final void a(Context context, String str, String str2) {
        if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            Method h2 = h(context, str2);
            try {
                h2.invoke(this.g.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                C1763mk.f(sb.toString());
            } catch (Exception e2) {
                a(e2, str2, false);
            }
        }
    }

    private final void a(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle a2 = a(str2, str);
            if (bundle != null) {
                a2.putAll(bundle);
            }
            if (h(context)) {
                a("logEventInternal", new C2312uj(str, a2));
            } else if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                Method i2 = i(context);
                try {
                    i2.invoke(this.g.get(), "am", str, a2);
                } catch (Exception e2) {
                    a(e2, "logEventInternal", true);
                }
            }
        }
    }

    private final void a(Exception exc, String str, boolean z) {
        if (!this.e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            C0745Vl.d(sb.toString());
            if (z) {
                C0745Vl.d("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                this.e.set(true);
            }
        }
    }

    private final void a(String str, AbstractC0457Kj kj) {
        synchronized (this.j) {
            FutureTask<?> futureTask = new FutureTask<>(new RunnableC2588yj(this, kj, str), null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    private final boolean a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e2) {
                a(e2, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final ThreadPoolExecutor b() {
        if (this.f5640a.get() == null) {
            this.f5640a.compareAndSet(null, new ThreadPoolExecutor(((Integer) C2392voa.e().a(C2474x.Z)).intValue(), ((Integer) C2392voa.e().a(C2474x.Z)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new ThreadFactoryC0405Ij(this)));
        }
        return this.f5640a.get();
    }

    private final Method h(Context context, String str) {
        Method method = this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private static boolean h(Context context) {
        if (!((Boolean) C2392voa.e().a(C2474x.aa)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) C2392voa.e().a(C2474x.ba)).intValue()) {
            return false;
        }
        if (((Boolean) C2392voa.e().a(C2474x.ca)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final Method i(Context context) {
        Method method = this.i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, "logEventInternal", true);
            return null;
        }
    }

    private final Method i(Context context, String str) {
        Method method = this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    private final Method j(Context context, String str) {
        Method method = this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e2) {
            a(e2, str, false);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a() {
        return (String) a("getAppInstanceId", (Object) null, C2519xj.f6010a);
    }

    public final void a(Context context, Zna zna) {
        if (((Boolean) C2392voa.e().a(C2474x.ga)).booleanValue() && a(context) && h(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void a(Context context, cqa cqa) {
        if (((Boolean) C2392voa.e().a(C2474x.ga)).booleanValue() && a(context) && h(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void a(Context context, String str) {
        if (a(context)) {
            if (h(context)) {
                a("beginAdUnitExposure", new C2174sj(str));
            } else {
                a(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void a(Context context, String str, String str2, String str3, int i2) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i2);
            a(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i2);
            C1763mk.f(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(AbstractC0457Kj kj, String str) {
        if (this.j.get() != null) {
            try {
                kj.a(this.j.get());
            } catch (Exception e2) {
                a(e2, str, false);
            }
        }
    }

    public final boolean a(Context context) {
        if (((Boolean) C2392voa.e().a(C2474x.T)).booleanValue() && !this.e.get()) {
            if (((Boolean) C2392voa.e().a(C2474x.da)).booleanValue()) {
                return true;
            }
            if (this.f.get() == -1) {
                C2392voa.a();
                if (!C0459Kl.c(context, j.f305a)) {
                    C2392voa.a();
                    if (C0459Kl.c(context)) {
                        C0745Vl.d("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.f.set(0);
                    }
                }
                this.f.set(1);
            }
            if (this.f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final String b(Context context) {
        if (!a(context)) {
            return BuildConfig.FLAVOR;
        }
        if (h(context)) {
            return (String) a("getCurrentScreenNameOrScreenClass", BuildConfig.FLAVOR, C2657zj.f6203a);
        }
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return BuildConfig.FLAVOR;
        }
        try {
            String str = (String) i(context, "getCurrentScreenName").invoke(this.g.get(), new Object[0]);
            if (str == null) {
                str = (String) i(context, "getCurrentScreenClass").invoke(this.g.get(), new Object[0]);
            }
            return str != null ? str : BuildConfig.FLAVOR;
        } catch (Exception e2) {
            a(e2, "getCurrentScreenName", false);
            return BuildConfig.FLAVOR;
        }
    }

    public final void b(Context context, String str) {
        if (a(context)) {
            if (h(context)) {
                a("endAdUnitExposure", new C0197Aj(str));
            } else {
                a(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String c(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f5641b) {
            if (this.f5642c != null) {
                return this.f5642c;
            }
            this.f5642c = h(context) ? (String) a("getGmpAppId", this.f5642c, C0223Bj.f1641a) : (String) a("getGmpAppId", context);
            return this.f5642c;
        }
    }

    public final void c(Context context, String str) {
        if (!a(context) || !(context instanceof Activity)) {
            return;
        }
        if (h(context)) {
            a("setScreenName", new C0249Cj(context, str));
        } else if (a(context, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false)) {
            Method j2 = j(context, "setCurrentScreen");
            try {
                j2.invoke(this.h.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception e2) {
                a(e2, "setCurrentScreen", false);
            }
        }
    }

    public final String d(Context context) {
        if (!a(context)) {
            return null;
        }
        long longValue = ((Long) C2392voa.e().a(C2474x.Y)).longValue();
        if (h(context)) {
            if (longValue >= 0) {
                return (String) b().submit(new CallableC0275Dj(this)).get(longValue, TimeUnit.MILLISECONDS);
            }
            try {
                return (String) a("getAppInstanceId", (Object) null, C0301Ej.f1892a);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        } else if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        } else {
            try {
                return (String) b().submit(new CallableC0353Gj(this, context)).get(longValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused3) {
                return "TIME_OUT";
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    public final void d(Context context, String str) {
        a(context, "_ac", str, (Bundle) null);
    }

    public final String e(Context context) {
        if (!a(context)) {
            return null;
        }
        if (h(context)) {
            Long l2 = (Long) a("getAdEventId", (Object) null, C0327Fj.f1983a);
            if (l2 != null) {
                return Long.toString(l2.longValue());
            }
            return null;
        }
        Object a2 = a("generateEventId", context);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }

    public final void e(Context context, String str) {
        a(context, "_ai", str, (Bundle) null);
    }

    public final String f(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f5641b) {
            if (this.d != null) {
                return this.d;
            }
            this.d = h(context) ? (String) a("getAppIdOrigin", this.d, C2450wj.f5917a) : "fa";
            return this.d;
        }
    }

    public final void f(Context context, String str) {
        a(context, "_aq", str, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String g(Context context) {
        return (String) a("getAppInstanceId", context);
    }

    public final void g(Context context, String str) {
        a(context, "_aa", str, (Bundle) null);
    }
}
