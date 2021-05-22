package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class D {
    public static void a(A a2, B b2) {
        if (b2.a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(b2.b())) {
            a2.a(b2.a(), b2.b(), b2.c(), b2.d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
