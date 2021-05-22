package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Sz  reason: case insensitive filesystem */
public final class C0681Sz {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0708Ua f3143a;

    public C0681Sz(BinderC0473Kz kz) {
        this.f3143a = kz;
    }

    public final synchronized AbstractC0708Ua a() {
        return this.f3143a;
    }

    public final synchronized void a(AbstractC0708Ua ua) {
        this.f3143a = ua;
    }
}
