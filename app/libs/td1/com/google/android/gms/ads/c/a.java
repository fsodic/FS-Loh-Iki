package com.google.android.gms.ads.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import b.c.b.a.b.f;
import b.c.b.a.b.g;
import b.c.b.a.b.j;
import b.c.b.a.d.a.d;
import b.c.b.a.d.a.e;
import com.google.android.gms.common.internal.r;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.cocos2dx.lib.BuildConfig;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private b.c.b.a.b.a f1044a;

    /* renamed from: b  reason: collision with root package name */
    private d f1045b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1046c;
    private final Object d;
    private b e;
    private final Context f;
    private final boolean g;
    private final long h;

    /* renamed from: com.google.android.gms.ads.c.a$a  reason: collision with other inner class name */
    public static final class C0023a {

        /* renamed from: a  reason: collision with root package name */
        private final String f1047a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1048b;

        public C0023a(String str, boolean z) {
            this.f1047a = str;
            this.f1048b = z;
        }

        public final String a() {
            return this.f1047a;
        }

        public final boolean b() {
            return this.f1048b;
        }

        public final String toString() {
            String str = this.f1047a;
            boolean z = this.f1048b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<a> f1049a;

        /* renamed from: b  reason: collision with root package name */
        private long f1050b;

        /* renamed from: c  reason: collision with root package name */
        CountDownLatch f1051c = new CountDownLatch(1);
        boolean d = false;

        public b(a aVar, long j) {
            this.f1049a = new WeakReference<>(aVar);
            this.f1050b = j;
            start();
        }

        private final void a() {
            a aVar = this.f1049a.get();
            if (aVar != null) {
                aVar.a();
                this.d = true;
            }
        }

        public final void run() {
            try {
                if (!this.f1051c.await(this.f1050b, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    public a(Context context) {
        this(context, 30000, false, false);
    }

    private a(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.d = new Object();
        r.a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.f1046c = false;
        this.h = j;
        this.g = z2;
    }

    private static b.c.b.a.b.a a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a2 = f.a().a(context, j.f305a);
            if (a2 == 0 || a2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                b.c.b.a.b.a aVar = new b.c.b.a.b.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (b.c.b.a.b.c.a.a().a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new g(9);
        }
    }

    private static d a(Context context, b.c.b.a.b.a aVar) {
        try {
            return e.a(aVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static C0023a a(Context context) {
        c cVar = new c(context);
        boolean a2 = cVar.a("gads:ad_id_app_context:enabled", false);
        float a3 = cVar.a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a4 = cVar.a("gads:ad_id_use_shared_preference:experiment_id", BuildConfig.FLAVOR);
        a aVar = new a(context, -1, a2, cVar.a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.a(false);
            C0023a b2 = aVar.b();
            aVar.a(b2, a2, a3, SystemClock.elapsedRealtime() - elapsedRealtime, a4, null);
            aVar.a();
            return b2;
        } catch (Throwable th) {
            aVar.a();
            throw th;
        }
    }

    private final void a(boolean z) {
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f1046c) {
                a();
            }
            this.f1044a = a(this.f, this.g);
            this.f1045b = a(this.f, this.f1044a);
            this.f1046c = true;
            if (z) {
                d();
            }
        }
    }

    private final boolean a(C0023a aVar, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (aVar != null) {
            if (!aVar.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(aVar == null || aVar.a() == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new b(this, hashMap).start();
        return true;
    }

    public static boolean b(Context context) {
        c cVar = new c(context);
        a aVar = new a(context, -1, cVar.a("gads:ad_id_app_context:enabled", false), cVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.a(false);
            return aVar.e();
        } finally {
            aVar.a();
        }
    }

    private final void d() {
        synchronized (this.d) {
            if (this.e != null) {
                this.e.f1051c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.h > 0) {
                this.e = new b(this, this.h);
            }
        }
    }

    private final boolean e() {
        boolean c2;
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f1046c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.f1046c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            r.a(this.f1044a);
            r.a(this.f1045b);
            try {
                c2 = this.f1045b.c();
            } catch (RemoteException e3) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                throw new IOException("Remote exception");
            }
        }
        d();
        return c2;
    }

    public final void a() {
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f != null && this.f1044a != null) {
                try {
                    if (this.f1046c) {
                        b.c.b.a.b.c.a.a().a(this.f, this.f1044a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f1046c = false;
                this.f1045b = null;
                this.f1044a = null;
            }
        }
    }

    public C0023a b() {
        C0023a aVar;
        r.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f1046c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.d) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.f1046c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            r.a(this.f1044a);
            r.a(this.f1045b);
            try {
                aVar = new C0023a(this.f1045b.getId(), this.f1045b.g(true));
            } catch (RemoteException e3) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e3);
                throw new IOException("Remote exception");
            }
        }
        d();
        return aVar;
    }

    public void c() {
        a(true);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        a();
        super.finalize();
    }
}
