package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cL  reason: case insensitive filesystem */
public final /* synthetic */ class C1040cL implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC1187eV f3984a = new C1040cL();

    private C1040cL() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        return ((JSONObject) obj).optString("nas");
    }
}
