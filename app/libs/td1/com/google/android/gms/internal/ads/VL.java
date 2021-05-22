package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class VL implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final C1496ioa f3329a;

    public VL(C1496ioa ioa) {
        this.f3329a = ioa;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        C1496ioa ioa = this.f3329a;
        if (ioa != null) {
            int i = ioa.f4608a;
            if (i == 1) {
                bundle2.putString("avo", "p");
            } else if (i == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
