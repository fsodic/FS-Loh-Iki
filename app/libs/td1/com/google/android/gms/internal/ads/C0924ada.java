package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ada  reason: case insensitive filesystem */
final class C0924ada {

    /* renamed from: a  reason: collision with root package name */
    private static final Zca f3819a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final Zca f3820b = new Yca();

    static Zca a() {
        return f3819a;
    }

    static Zca b() {
        return f3820b;
    }

    private static Zca c() {
        try {
            return (Zca) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
