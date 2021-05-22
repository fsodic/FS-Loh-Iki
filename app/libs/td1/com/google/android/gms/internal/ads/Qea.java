package com.google.android.gms.internal.ads;

public final class Qea<T> implements Lea<T>, Sea<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Qea<Object> f2948a = new Qea<>(null);

    /* renamed from: b  reason: collision with root package name */
    private final T f2949b;

    private Qea(T t) {
        this.f2949b = t;
    }

    public static <T> Sea<T> a(T t) {
        Xea.a(t, "instance cannot be null");
        return new Qea(t);
    }

    public static <T> Sea<T> b(T t) {
        return t == null ? f2948a : new Qea(t);
    }

    @Override // com.google.android.gms.internal.ads.Lea, com.google.android.gms.internal.ads._ea
    public final T get() {
        return this.f2949b;
    }
}
