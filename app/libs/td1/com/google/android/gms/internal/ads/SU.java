package com.google.android.gms.internal.ads;

public final class SU extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final int f3090a;

    public SU(int i, String str) {
        super(str);
        this.f3090a = i;
    }

    public SU(int i, Throwable th) {
        super(th);
        this.f3090a = i;
    }

    public final int a() {
        return this.f3090a;
    }
}
