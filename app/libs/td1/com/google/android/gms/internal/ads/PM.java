package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class PM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f2821a;

    public PM(Bundle bundle) {
        this.f2821a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putBundle("content_info", this.f2821a);
    }
}
