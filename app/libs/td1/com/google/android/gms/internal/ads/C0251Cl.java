package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Cl  reason: case insensitive filesystem */
public final class C0251Cl {
    @Deprecated
    public static <T> T a(Context context, Callable<T> callable) {
        try {
            return (T) a(callable);
        } catch (Throwable th) {
            C0745Vl.b("Unexpected exception.", th);
            C2170sh.a(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    public static <T> T a(AbstractC2220tV<T> tVVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T t = tVVar.get();
            StrictMode.setThreadPolicy(threadPolicy);
            return t;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
