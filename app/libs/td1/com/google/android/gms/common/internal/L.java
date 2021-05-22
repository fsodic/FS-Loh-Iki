package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import b.c.b.a.b.d.c;

public final class L {

    /* renamed from: a  reason: collision with root package name */
    private static Object f1341a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1342b;

    /* renamed from: c  reason: collision with root package name */
    private static String f1343c;
    private static int d;

    public static String a(Context context) {
        c(context);
        return f1343c;
    }

    public static int b(Context context) {
        c(context);
        return d;
    }

    private static void c(Context context) {
        synchronized (f1341a) {
            if (!f1342b) {
                f1342b = true;
                try {
                    Bundle bundle = c.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f1343c = bundle.getString("com.google.app.id");
                        d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
