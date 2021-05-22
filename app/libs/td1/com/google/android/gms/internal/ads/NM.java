package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final class NM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2655a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2656b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f2657c;

    private NM(String str, String str2, Bundle bundle) {
        this.f2655a = str;
        this.f2656b = str2;
        this.f2657c = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f2655a);
        bundle2.putString("fc_consent", this.f2656b);
        bundle2.putBundle("iab_consent_info", this.f2657c);
    }
}
