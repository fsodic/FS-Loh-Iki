package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.a.a;

public abstract class DowngradeableSafeParcel extends a implements ReflectedParcelable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f1329a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static ClassLoader f1330b = null;

    /* renamed from: c  reason: collision with root package name */
    private static Integer f1331c = null;
    private boolean d = false;

    protected static Integer L() {
        synchronized (f1329a) {
        }
        return null;
    }

    private static ClassLoader N() {
        synchronized (f1329a) {
        }
        return null;
    }

    protected static boolean a(String str) {
        N();
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean M() {
        return this.d;
    }
}
