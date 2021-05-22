package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dp  reason: case insensitive filesystem */
public final class C1153dp {

    /* renamed from: a  reason: collision with root package name */
    private final int f4149a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4150b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4151c;

    private C1153dp(int i, int i2, int i3) {
        this.f4149a = i;
        this.f4151c = i2;
        this.f4150b = i3;
    }

    public static C1153dp a(int i, int i2) {
        return new C1153dp(1, i, i2);
    }

    public static C1153dp a(C1015boa boa) {
        return boa.d ? new C1153dp(3, 0, 0) : boa.i ? new C1153dp(2, 0, 0) : boa.h ? b() : a(boa.f, boa.f3942c);
    }

    public static C1153dp b() {
        return new C1153dp(0, 0, 0);
    }

    public static C1153dp c() {
        return new C1153dp(4, 0, 0);
    }

    public static C1153dp d() {
        return new C1153dp(5, 0, 0);
    }

    public final boolean a() {
        return this.f4149a == 2;
    }

    public final boolean e() {
        return this.f4149a == 3;
    }

    public final boolean f() {
        return this.f4149a == 0;
    }

    public final boolean g() {
        return this.f4149a == 4;
    }

    public final boolean h() {
        return this.f4149a == 5;
    }
}
