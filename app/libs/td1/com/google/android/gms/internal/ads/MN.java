package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class MN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2578a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2579b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2580c;
    private final String d;
    private final Long e;

    public MN(String str, String str2, String str3, String str4, Long l) {
        this.f2578a = str;
        this.f2579b = str2;
        this.f2580c = str3;
        this.d = str4;
        this.e = l;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        LR.a(bundle2, "gmp_app_id", this.f2578a);
        LR.a(bundle2, "fbs_aiid", this.f2579b);
        LR.a(bundle2, "fbs_aeid", this.f2580c);
        LR.a(bundle2, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
