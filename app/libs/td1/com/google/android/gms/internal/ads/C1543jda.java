package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jda  reason: case insensitive filesystem */
final class C1543jda {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC1475ida f4694a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final AbstractC1475ida f4695b = new C1612kda();

    static AbstractC1475ida a() {
        return f4694a;
    }

    static AbstractC1475ida b() {
        return f4695b;
    }

    private static AbstractC1475ida c() {
        try {
            return (AbstractC1475ida) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
