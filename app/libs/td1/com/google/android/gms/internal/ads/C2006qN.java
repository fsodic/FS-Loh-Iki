package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.qN  reason: case insensitive filesystem */
public final class C2006qN implements AbstractC0905aO<Bundle>, AbstractC1180eO<AbstractC0905aO<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationInfo f5310a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfo f5311b;

    C2006qN(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f5310a = applicationInfo;
        this.f5311b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<Bundle>> a() {
        return JW.a(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f5310a.packageName;
        PackageInfo packageInfo = this.f5311b;
        String str2 = null;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle2.putString("pn", str);
        if (valueOf != null) {
            bundle2.putInt("vc", valueOf.intValue());
        }
        if (((Boolean) C2392voa.e().a(C2474x.Rd)).booleanValue()) {
            PackageInfo packageInfo2 = this.f5311b;
            if (packageInfo2 != null) {
                str2 = packageInfo2.versionName;
            }
            if (str2 != null) {
                bundle2.putString("vnm", str2);
            }
        }
    }
}
