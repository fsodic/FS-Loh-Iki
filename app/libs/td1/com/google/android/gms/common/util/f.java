package com.google.android.gms.common.util;

import android.content.Context;
import android.os.DropBoxManager;
import android.util.Log;
import com.google.android.gms.common.internal.r;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f1401a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b  reason: collision with root package name */
    private static DropBoxManager f1402b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1403c = false;
    private static int d = -1;
    private static int e = 0;
    private static int f = 0;

    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i) {
        try {
            r.a(context);
            r.a(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
