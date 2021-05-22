package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.j  reason: case insensitive filesystem */
public final class C0184j {

    /* renamed from: a  reason: collision with root package name */
    private final String f1375a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1376b;

    public C0184j(String str) {
        this(str, null);
    }

    public C0184j(String str, String str2) {
        r.a((Object) str, (Object) "log tag cannot be null");
        r.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f1375a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f1376b = null;
        } else {
            this.f1376b = str2;
        }
    }

    private final String a(String str) {
        String str2 = this.f1376b;
        return str2 == null ? str : str2.concat(str);
    }

    public final void a(String str, String str2) {
        if (a(6)) {
            Log.e(str, a(str2));
        }
    }

    public final void a(String str, String str2, Throwable th) {
        if (a(5)) {
            Log.w(str, a(str2), th);
        }
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.f1375a, i);
    }

    public final void b(String str, String str2) {
        if (a(5)) {
            Log.w(str, a(str2));
        }
    }
}
