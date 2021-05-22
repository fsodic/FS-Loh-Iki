package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
public final class XE implements GW<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PE f3480a;

    XE(PE pe) {
        this.f3480a = pe;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.GW
    public final /* synthetic */ void a(String str) {
        String str2 = str;
        synchronized (this) {
            this.f3480a.f2807b = true;
            this.f3480a.a((PE) "com.google.android.gms.ads.MobileAds", (String) true, (boolean) BuildConfig.FLAVOR, (String) ((int) (q.j().b() - this.f3480a.f2808c)));
            this.f3480a.h.execute(new _E(this, str2));
        }
    }

    @Override // com.google.android.gms.internal.ads.GW
    public final void a(Throwable th) {
        synchronized (this) {
            this.f3480a.f2807b = true;
            this.f3480a.a((PE) "com.google.android.gms.ads.MobileAds", (String) false, (boolean) "Internal Error.", (String) ((int) (q.j().b() - this.f3480a.f2808c)));
            this.f3480a.d.a(new Exception());
        }
    }
}
