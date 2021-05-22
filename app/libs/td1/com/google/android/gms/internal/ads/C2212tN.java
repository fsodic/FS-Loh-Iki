package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: com.google.android.gms.internal.ads.tN  reason: case insensitive filesystem */
public final class C2212tN implements Sea<C2006qN> {

    /* renamed from: a  reason: collision with root package name */
    private final _ea<ApplicationInfo> f5600a;

    /* renamed from: b  reason: collision with root package name */
    private final _ea<PackageInfo> f5601b;

    private C2212tN(_ea<ApplicationInfo> _ea, _ea<PackageInfo> _ea2) {
        this.f5600a = _ea;
        this.f5601b = _ea2;
    }

    public static C2006qN a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new C2006qN(applicationInfo, packageInfo);
    }

    public static C2212tN a(_ea<ApplicationInfo> _ea, _ea<PackageInfo> _ea2) {
        return new C2212tN(_ea, _ea2);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        return a(this.f5600a.get(), this.f5601b.get());
    }
}
