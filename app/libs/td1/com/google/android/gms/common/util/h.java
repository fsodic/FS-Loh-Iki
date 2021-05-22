package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f1405a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f1406b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f1407c;
    private static Boolean d;

    public static boolean a(Context context) {
        if (f1407c == null) {
            PackageManager packageManager = context.getPackageManager();
            f1407c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f1407c.booleanValue();
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        if (f1406b == null) {
            f1406b = Boolean.valueOf(o.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f1406b.booleanValue();
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        if (f1405a == null) {
            f1405a = Boolean.valueOf(o.g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f1405a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!c(context)) {
            return false;
        }
        if (o.j()) {
            return b(context) && !o.k();
        }
        return true;
    }

    public static boolean e(Context context) {
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return d.booleanValue();
    }
}
