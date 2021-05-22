package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.iP  reason: case insensitive filesystem */
public final class C1457iP implements Sea<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final C1319gP f4564a;

    public C1457iP(C1319gP gPVar) {
        this.f4564a = gPVar;
    }

    public static ApplicationInfo a(C1319gP gPVar) {
        ApplicationInfo f = gPVar.f();
        Xea.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f4564a);
    }
}
