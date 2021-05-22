package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.xC  reason: case insensitive filesystem */
public final class C2477xC implements AbstractC0528Nc {

    /* renamed from: a  reason: collision with root package name */
    private final C1780mv f5950a;

    /* renamed from: b  reason: collision with root package name */
    private final C0456Ki f5951b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5952c;
    private final String d;

    public C2477xC(C1780mv mvVar, C1941pR pRVar) {
        this.f5950a = mvVar;
        this.f5951b = pRVar.l;
        this.f5952c = pRVar.j;
        this.d = pRVar.k;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0528Nc
    public final void M() {
        this.f5950a.T();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0528Nc
    public final void N() {
        this.f5950a.U();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0528Nc
    public final void a(C0456Ki ki) {
        int i;
        String str;
        C0456Ki ki2 = this.f5951b;
        if (ki2 != null) {
            ki = ki2;
        }
        if (ki != null) {
            str = ki.f2422a;
            i = ki.f2423b;
        } else {
            str = BuildConfig.FLAVOR;
            i = 1;
        }
        this.f5950a.a(new BinderC1759mi(str, i), this.f5952c, this.d);
    }
}
