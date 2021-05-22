package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ad  reason: case insensitive filesystem */
public final class C0191Ad<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f1525a;

    /* renamed from: b  reason: collision with root package name */
    public final C2244tja f1526b;

    /* renamed from: c  reason: collision with root package name */
    public final C0713Uf f1527c;
    public boolean d;

    private C0191Ad(C0713Uf uf) {
        this.d = false;
        this.f1525a = null;
        this.f1526b = null;
        this.f1527c = uf;
    }

    private C0191Ad(T t, C2244tja tja) {
        this.d = false;
        this.f1525a = t;
        this.f1526b = tja;
        this.f1527c = null;
    }

    public static <T> C0191Ad<T> a(C0713Uf uf) {
        return new C0191Ad<>(uf);
    }

    public static <T> C0191Ad<T> a(T t, C2244tja tja) {
        return new C0191Ad<>(t, tja);
    }
}
