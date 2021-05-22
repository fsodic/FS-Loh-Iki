package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.sN  reason: case insensitive filesystem */
public final class C2143sN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f5507a;

    public C2143sN(Bundle bundle) {
        this.f5507a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.f5507a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
