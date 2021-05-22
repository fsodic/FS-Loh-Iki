package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gP  reason: case insensitive filesystem */
public final class C1319gP {

    /* renamed from: a  reason: collision with root package name */
    private final C0715Uh f4387a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4388b;

    public C1319gP(C0715Uh uh, int i) {
        this.f4387a = uh;
        this.f4388b = i;
    }

    public final String a() {
        return this.f4387a.d;
    }

    public final String b() {
        return this.f4387a.f3269a.getString("ms");
    }

    public final PackageInfo c() {
        return this.f4387a.f;
    }

    public final boolean d() {
        return this.f4387a.h;
    }

    public final List<String> e() {
        return this.f4387a.e;
    }

    public final ApplicationInfo f() {
        return this.f4387a.f3271c;
    }

    public final String g() {
        return this.f4387a.i;
    }

    public final int h() {
        return this.f4388b;
    }
}
