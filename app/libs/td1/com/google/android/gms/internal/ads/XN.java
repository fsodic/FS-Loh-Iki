package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final /* synthetic */ class XN implements AbstractC0905aO {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f3495a;

    XN(Bundle bundle) {
        this.f3495a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final void a(Object obj) {
        ((Bundle) obj).putBundle("shared_pref", this.f3495a);
    }
}
