package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class TM implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f3167a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3168b;

    public TM(String str, boolean z) {
        this.f3167a = str;
        this.f3168b = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f3167a);
        if (this.f3168b) {
            bundle2.putString("de", "1");
        }
    }
}
