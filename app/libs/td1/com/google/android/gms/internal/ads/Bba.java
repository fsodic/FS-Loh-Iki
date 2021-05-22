package com.google.android.gms.internal.ads;

final class Bba {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f1620a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1621b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a() {
        return f1620a != null && !f1621b;
    }

    static Class<?> b() {
        return f1620a;
    }
}
