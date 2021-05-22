package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class DN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f1762a;

    public DN(String str) {
        this.f1762a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("rtb", this.f1762a);
    }
}
