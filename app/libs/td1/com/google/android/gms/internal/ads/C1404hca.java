package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hca  reason: case insensitive filesystem */
final class C1404hca {

    /* renamed from: a  reason: collision with root package name */
    private static final AbstractC1335gca<?> f4487a = new C1473ica();

    /* renamed from: b  reason: collision with root package name */
    private static final AbstractC1335gca<?> f4488b = c();

    static AbstractC1335gca<?> a() {
        return f4487a;
    }

    static AbstractC1335gca<?> b() {
        AbstractC1335gca<?> gca = f4488b;
        if (gca != null) {
            return gca;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static AbstractC1335gca<?> c() {
        try {
            return (AbstractC1335gca) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
