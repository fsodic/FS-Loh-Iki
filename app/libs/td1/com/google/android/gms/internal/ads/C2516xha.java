package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xha  reason: case insensitive filesystem */
public class C2516xha {

    /* renamed from: a  reason: collision with root package name */
    private int f6006a;

    public void a() {
        this.f6006a = 0;
    }

    public final void a(int i) {
        this.f6006a = i;
    }

    public final void b(int i) {
        this.f6006a |= Integer.MIN_VALUE;
    }

    public final boolean b() {
        return c(Integer.MIN_VALUE);
    }

    public final boolean c() {
        return c(4);
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i) {
        return (this.f6006a & i) == i;
    }

    public final boolean d() {
        return c(1);
    }
}
