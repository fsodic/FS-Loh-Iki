package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.lO  reason: case insensitive filesystem */
public final class C1662lO implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4848a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4849b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4850c;
    private final int d;
    private final boolean e;
    private final int f;

    public C1662lO(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f4848a = str;
        this.f4849b = i;
        this.f4850c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f4848a;
        boolean z = true;
        LR.a(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f4849b);
        if (this.f4849b == -2) {
            z = false;
        }
        LR.a(bundle2, "cnt", valueOf, z);
        bundle2.putInt("gnt", this.f4850c);
        bundle2.putInt("pt", this.d);
        Bundle a2 = LR.a(bundle2, "device");
        bundle2.putBundle("device", a2);
        Bundle a3 = LR.a(a2, "network");
        a2.putBundle("network", a3);
        a3.putInt("active_network_state", this.f);
        a3.putBoolean("active_network_metered", this.e);
    }
}
