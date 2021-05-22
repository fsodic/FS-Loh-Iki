package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
public final class ZE extends AbstractBinderC1474id {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Object f3618a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3619b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3620c;
    private final /* synthetic */ C1423hm d;
    private final /* synthetic */ PE e;

    ZE(PE pe, Object obj, String str, long j, C1423hm hmVar) {
        this.e = pe;
        this.f3618a = obj;
        this.f3619b = str;
        this.f3620c = j;
        this.d = hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1267fd
    public final void Q() {
        synchronized (this.f3618a) {
            this.e.a((PE) this.f3619b, (String) true, (boolean) BuildConfig.FLAVOR, (String) ((int) (q.j().b() - this.f3620c)));
            this.e.k.b(this.f3619b);
            this.d.b(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1267fd
    public final void i(String str) {
        synchronized (this.f3618a) {
            this.e.a((PE) this.f3619b, (String) false, (boolean) str, (String) ((int) (q.j().b() - this.f3620c)));
            this.e.k.a(this.f3619b, "error");
            this.d.b(false);
        }
    }
}
