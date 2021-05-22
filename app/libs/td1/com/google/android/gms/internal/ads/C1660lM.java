package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.lM  reason: case insensitive filesystem */
public final class C1660lM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4842a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4843b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4844c;
    private final int d;
    private final int e;
    private final int f;
    private final float g;
    private final boolean h;

    public C1660lM(int i, boolean z, boolean z2, int i2, int i3, int i4, float f2, boolean z3) {
        this.f4842a = i;
        this.f4843b = z;
        this.f4844c = z2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f2;
        this.h = z3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.f4842a);
        bundle2.putBoolean("ma", this.f4843b);
        bundle2.putBoolean("sp", this.f4844c);
        bundle2.putInt("muv", this.d);
        bundle2.putInt("rm", this.e);
        bundle2.putInt("riv", this.f);
        bundle2.putFloat("android_app_volume", this.g);
        bundle2.putBoolean("android_app_muted", this.h);
    }
}
