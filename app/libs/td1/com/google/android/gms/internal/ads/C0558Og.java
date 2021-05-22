package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.Og  reason: case insensitive filesystem */
public class C0558Og {

    /* renamed from: a  reason: collision with root package name */
    private static String f2766a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2767b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f2768c = C0558Og.class.getName();

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.Og$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f2769a = C0558Og.f2767b;

        /* renamed from: b  reason: collision with root package name */
        private final List<C0377Hh> f2770b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private boolean f2771c = false;

        a() {
        }

        public final synchronized void a(String str) {
            long j;
            this.f2771c = true;
            if (this.f2770b.size() == 0) {
                j = 0;
            } else {
                j = this.f2770b.get(this.f2770b.size() - 1).f2162c - this.f2770b.get(0).f2162c;
            }
            if (j > 0) {
                long j2 = this.f2770b.get(0).f2162c;
                C0558Og.a("(%-4d ms) %s", Long.valueOf(j), str);
                for (C0377Hh hh : this.f2770b) {
                    long j3 = hh.f2162c;
                    C0558Og.a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(hh.f2161b), hh.f2160a);
                    j2 = j3;
                }
            }
        }

        public final synchronized void a(String str, long j) {
            if (!this.f2771c) {
                this.f2770b.add(new C0377Hh(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            if (!this.f2771c) {
                a("Request on the loose");
                C0558Og.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        Log.d(f2766a, d(str, objArr));
    }

    public static void a(Throwable th, String str, Object... objArr) {
        Log.e(f2766a, d(str, objArr), th);
    }

    public static void b(String str, Object... objArr) {
        Log.e(f2766a, d(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        if (f2767b) {
            Log.v(f2766a, d(str, objArr));
        }
    }

    private static String d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f2768c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }
}
