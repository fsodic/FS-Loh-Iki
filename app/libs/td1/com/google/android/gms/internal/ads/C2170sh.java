package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import b.c.b.a.b.d.c;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.sh  reason: case insensitive filesystem */
public final class C2170sh implements AbstractC2446wh {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5538a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static AbstractC2446wh f5539b = null;

    /* renamed from: c  reason: collision with root package name */
    private static AbstractC2446wh f5540c = null;
    private final Object d;
    private final Context e;
    private final WeakHashMap<Thread, Boolean> f;
    private final ExecutorService g;
    private final C0823Yl h;

    private C2170sh(Context context) {
        this(context, C0823Yl.L());
    }

    private C2170sh(Context context, C0823Yl yl) {
        this.d = new Object();
        this.f = new WeakHashMap<>();
        this.g = WU.a().a(C0912aV.f3814a);
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.h = yl;
    }

    private final Uri.Builder a(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = c.a(this.e).a();
        } catch (Throwable th) {
            C0745Vl.b("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.e.getPackageName();
        } catch (Throwable unused) {
            C0745Vl.d("Cannot obtain package name, proceeding.");
            str4 = "unknown";
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.h.f3587a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", C2474x.a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "312401170").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", C2392voa.f()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(C2363va.f5815c.a()));
    }

    public static AbstractC2446wh a(Context context) {
        synchronized (f5538a) {
            if (f5539b == null) {
                if (C2363va.e.a().booleanValue()) {
                    if (!((Boolean) C2392voa.e().a(C2474x.Ne)).booleanValue()) {
                        f5539b = new C2170sh(context);
                    }
                }
                f5539b = new C2653zh();
            }
        }
        return f5539b;
    }

    public static AbstractC2446wh a(Context context, C0823Yl yl) {
        synchronized (f5538a) {
            if (f5540c == null) {
                if (C2363va.e.a().booleanValue()) {
                    if (!((Boolean) C2392voa.e().a(C2474x.Ne)).booleanValue()) {
                        C2170sh shVar = new C2170sh(context, yl);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (shVar.d) {
                                shVar.f.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new C2515xh(shVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new C2308uh(shVar, Thread.getDefaultUncaughtExceptionHandler()));
                        f5540c = shVar;
                    }
                }
                f5540c = new C2653zh();
            }
        }
        return f5540c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0040
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003b
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0034
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.C0459Kl.b(r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class<com.google.android.gms.internal.ads.sh> r8 = com.google.android.gms.internal.ads.C2170sh.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0031
            r6 = 1
        L_0x0031:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0034:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            if (r10 == 0) goto L_0x004a
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.a(r11, r0, r10)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2170sh.a(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2446wh
    public final void a(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2446wh
    public final void a(Throwable th, String str, float f2) {
        if (C0459Kl.a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            C2159sba.a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f2);
            if (f2 > 0.0f) {
                i2 = (int) (1.0f / f2);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a(name, stringWriter2, str, i2).toString());
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    this.g.execute(new RunnableC2377vh(new C0849Zl(), (String) obj));
                }
            }
        }
    }
}
