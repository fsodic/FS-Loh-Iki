package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.pF  reason: case insensitive filesystem */
public final class C1929pF implements Sea<ApplicationInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<Context> f5208a;

    private C1929pF(_ea<Context> _ea) {
        this.f5208a = _ea;
    }

    public static ApplicationInfo a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        Xea.a(applicationInfo, "Cannot return null from a non-@Nullable @Provides method");
        return applicationInfo;
    }

    public static C1929pF a(_ea<Context> _ea) {
        return new C1929pF(_ea);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5208a.get());
    }
}
