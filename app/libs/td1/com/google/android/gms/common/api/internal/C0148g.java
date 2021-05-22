package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import b.c.b.a.b.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.L;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;

@Deprecated
/* renamed from: com.google.android.gms.common.api.internal.g  reason: case insensitive filesystem */
public final class C0148g {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1265a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static C0148g f1266b;

    /* renamed from: c  reason: collision with root package name */
    private final String f1267c;
    private final Status d;
    private final boolean e;
    private final boolean f;

    C0148g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(l.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            z = resources.getInteger(identifier) == 0 ? false : z;
            this.f = !z;
        } else {
            this.f = false;
        }
        this.e = z;
        String a2 = L.a(context);
        a2 = a2 == null ? new v(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f1267c = null;
            return;
        }
        this.f1267c = a2;
        this.d = Status.f1175a;
    }

    public static Status a(Context context) {
        Status status;
        r.a(context, "Context must not be null.");
        synchronized (f1265a) {
            if (f1266b == null) {
                f1266b = new C0148g(context);
            }
            status = f1266b.d;
        }
        return status;
    }

    private static C0148g a(String str) {
        C0148g gVar;
        synchronized (f1265a) {
            if (f1266b != null) {
                gVar = f1266b;
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return gVar;
    }

    public static String a() {
        return a("getGoogleAppId").f1267c;
    }
}
