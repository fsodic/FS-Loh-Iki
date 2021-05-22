package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.sga  reason: case insensitive filesystem */
public final class C2169sga extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f5536a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5537b;

    private C2169sga(int i, String str, Throwable th, int i2) {
        super(null, th);
        this.f5536a = i;
        this.f5537b = i2;
    }

    public static C2169sga a(IOException iOException) {
        return new C2169sga(0, null, iOException, -1);
    }

    public static C2169sga a(Exception exc, int i) {
        return new C2169sga(1, null, exc, i);
    }

    static C2169sga a(RuntimeException runtimeException) {
        return new C2169sga(2, null, runtimeException, -1);
    }
}
