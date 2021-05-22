package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.Mx  reason: case insensitive filesystem */
public final class C0523Mx<T> {

    /* renamed from: a  reason: collision with root package name */
    public T f2628a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f2629b;

    public C0523Mx(T t, Executor executor) {
        this.f2628a = t;
        this.f2629b = executor;
    }

    public static <T> C0523Mx<T> a(T t, Executor executor) {
        return new C0523Mx<>(t, executor);
    }
}
