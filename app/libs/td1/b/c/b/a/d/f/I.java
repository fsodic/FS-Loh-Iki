package b.c.b.a.d.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import b.c.b.a.b.d.c;
import com.google.android.gms.common.api.internal.C0148g;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.d;
import com.google.android.gms.common.util.g;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class I {

    /* renamed from: a  reason: collision with root package name */
    private static volatile I f475a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f476b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f477c = null;
    private static String d = "use_dynamite_api";
    private static String e = "allow_remote_dynamite";
    private final String f;
    protected final d g;
    private final ExecutorService h;
    private final b.c.b.a.e.a.a i;
    private List<Pair<Object, Object>> j;
    private int k;
    private boolean l;
    private String m;
    private D n;

    /* access modifiers changed from: package-private */
    public abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f478a;

        /* renamed from: b  reason: collision with root package name */
        final long f479b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f480c;

        a(I i) {
            this(true);
        }

        a(boolean z) {
            this.f478a = I.this.g.a();
            this.f479b = I.this.g.b();
            this.f480c = z;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (I.this.l) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                I.this.a((I) e, (Exception) false, this.f480c);
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            I.this.a((I) new t(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            I.this.a((I) new y(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            I.this.a((I) new x(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            I.this.a((I) new u(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            B b2 = new B();
            I.this.a((I) new z(this, activity, b2));
            Bundle b3 = b2.b(50);
            if (b3 != null) {
                bundle.putAll(b3);
            }
        }

        public final void onActivityStarted(Activity activity) {
            I.this.a((I) new v(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            I.this.a((I) new w(this, activity));
        }
    }

    private I(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f = (str == null || !b(str2, str3)) ? "FA" : str;
        this.g = g.d();
        this.h = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.i = new b.c.b.a.e.a.a(this);
        boolean z = false;
        if (!(!e(context) || i())) {
            this.m = null;
            this.l = true;
            Log.w(this.f, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!b(str2, str3)) {
            this.m = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.f, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                this.l = true;
                return;
            }
        } else {
            this.m = str2;
        }
        a(new C0107b(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static I a(Context context) {
        return a(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static I a(Context context, String str, String str2, String str3, Bundle bundle) {
        r.a(context);
        if (f475a == null) {
            synchronized (I.class) {
                if (f475a == null) {
                    f475a = new I(context, str, str2, str3, bundle);
                }
            }
        }
        return f475a;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(a aVar) {
        this.h.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(Exception exc, boolean z, boolean z2) {
        this.l |= z;
        if (z) {
            Log.w(this.f, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f, "Error with data collection. Data lost.", exc);
    }

    private final void a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        a(new r(this, l2, str, str2, bundle, z, z2));
    }

    private final void a(String str, String str2, Object obj, boolean z) {
        a(new p(this, str, str2, obj, z));
    }

    private static boolean a(Context context, String str) {
        r.b(str);
        try {
            ApplicationInfo a2 = c.a(context).a(context.getPackageName(), 128);
            if (a2 != null) {
                if (a2.metaData != null) {
                    return a2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean b(String str, String str2) {
        return (str2 == null || str == null || i()) ? false : true;
    }

    private static boolean e(Context context) {
        try {
            C0148g.a(context);
            return C0148g.a() != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int f(Context context) {
        return DynamiteModule.b(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        return DynamiteModule.a(context, "com.google.android.gms.measurement.dynamite");
    }

    /* access modifiers changed from: private */
    public static void h(Context context) {
        synchronized (I.class) {
            try {
                if (f476b != null && f477c != null) {
                    return;
                }
                if (a(context, "app_measurement_internal_disable_startup_flags")) {
                    f476b = false;
                    f477c = false;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                f476b = Boolean.valueOf(sharedPreferences.getBoolean(d, false));
                f477c = Boolean.valueOf(sharedPreferences.getBoolean(e, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(d);
                edit.remove(e);
                edit.apply();
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                f476b = false;
                f477c = false;
            }
        }
    }

    private static boolean i() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final Bundle a(Bundle bundle, boolean z) {
        B b2 = new B();
        a(new m(this, bundle, b2));
        if (z) {
            return b2.b(5000);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final D a(Context context, boolean z) {
        DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.l;
            } catch (DynamiteModule.a e2) {
                a((Exception) e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.i;
        }
        return C.a(DynamiteModule.a(context, bVar, "com.google.android.gms.measurement.dynamite").a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final b.c.b.a.e.a.a a() {
        return this.i;
    }

    public final List<Bundle> a(String str, String str2) {
        B b2 = new B();
        a(new C0108c(this, str, str2, b2));
        List<Bundle> list = (List) B.a(b2.b(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> a(String str, String str2, boolean z) {
        B b2 = new B();
        a(new C0116k(this, str, str2, z, b2));
        Bundle b3 = b2.b(5000);
        if (b3 == null || b3.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(b3.size());
        for (String str3 : b3.keySet()) {
            Object obj = b3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void a(int i2, String str, Object obj, Object obj2, Object obj3) {
        a(new n(this, false, 5, str, obj, null, null));
    }

    public final void a(Activity activity, String str, String str2) {
        a(new C0109d(this, activity, str, str2));
    }

    public final void a(Bundle bundle) {
        a(new s(this, bundle));
    }

    public final void a(String str) {
        a(new C0110e(this, str));
    }

    public final void a(String str, String str2, Bundle bundle) {
        a(str, str2, bundle, true, true, null);
    }

    public final void a(String str, String str2, Object obj) {
        a(str, str2, obj, true);
    }

    public final String b() {
        B b2 = new B();
        a(new C0113h(this, b2));
        return b2.a(500);
    }

    public final void b(String str) {
        a(new C0111f(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        a(new K(this, str, str2, bundle));
    }

    public final int c(String str) {
        B b2 = new B();
        a(new o(this, str, b2));
        Integer num = (Integer) B.a(b2.b(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String c() {
        B b2 = new B();
        a(new C0112g(this, b2));
        return b2.a(50);
    }

    public final long d() {
        B b2 = new B();
        a(new C0115j(this, b2));
        Long l2 = (Long) B.a(b2.b(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.g.a()).nextLong();
        int i2 = this.k + 1;
        this.k = i2;
        return nextLong + ((long) i2);
    }

    public final String e() {
        B b2 = new B();
        a(new C0114i(this, b2));
        return b2.a(500);
    }

    public final String f() {
        B b2 = new B();
        a(new l(this, b2));
        return b2.a(500);
    }

    public final String g() {
        return this.m;
    }
}
