package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class QN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2930a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2931b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2932c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;

    public QN(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f2930a = z;
        this.f2931b = z2;
        this.f2932c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f2932c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) C2392voa.e().a(C2474x.Vb));
        bundle2.putInt("target_api", this.e);
        bundle2.putInt("dv", this.f);
        bundle2.putInt("lv", this.g);
        Bundle a2 = LR.a(bundle2, "sdk_env");
        a2.putBoolean("mf", C2019qa.f5323a.a().booleanValue());
        a2.putBoolean("instant_app", this.f2930a);
        a2.putBoolean("lite", this.f2931b);
        a2.putBoolean("is_privileged_process", this.d);
        bundle2.putBundle("sdk_env", a2);
        Bundle a3 = LR.a(a2, "build_meta");
        a3.putString("cl", "312401170");
        a3.putString("rapid_rc", "dev");
        a3.putString("rapid_rollup", "HEAD");
        a2.putBundle("build_meta", a3);
    }
}
