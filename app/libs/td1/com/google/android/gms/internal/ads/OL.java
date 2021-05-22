package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class OL implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f2737a;

    private OL(Bundle bundle) {
        this.f2737a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!this.f2737a.isEmpty()) {
            bundle2.putBundle("installed_adapter_data", this.f2737a);
        }
    }
}
