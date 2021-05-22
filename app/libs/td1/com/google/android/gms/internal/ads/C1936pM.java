package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.pM  reason: case insensitive filesystem */
public final class C1936pM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final double f5221a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5222b;

    public C1936pM(double d, boolean z) {
        this.f5221a = d;
        this.f5222b = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a2 = LR.a(bundle2, "device");
        bundle2.putBundle("device", a2);
        Bundle a3 = LR.a(a2, "battery");
        a2.putBundle("battery", a3);
        a3.putBoolean("is_charging", this.f5222b);
        a3.putDouble("battery_level", this.f5221a);
    }
}
