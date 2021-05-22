package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class XM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f3494a;

    public XM(Bundle bundle) {
        this.f3494a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a2 = LR.a(bundle2, "device");
        a2.putBundle("android_mem_info", this.f3494a);
        bundle2.putBundle("device", a2);
    }
}
