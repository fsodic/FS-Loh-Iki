package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.wN  reason: case insensitive filesystem */
public final class C2419wN implements AbstractC0905aO<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private String f5883a;

    public C2419wN(String str) {
        this.f5883a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("request_id", this.f5883a);
    }
}
