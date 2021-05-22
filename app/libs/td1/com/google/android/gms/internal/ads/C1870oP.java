package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.oP  reason: case insensitive filesystem */
final /* synthetic */ class C1870oP implements AbstractC0905aO {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC0905aO f5121a = new C1870oP();

    private C1870oP() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final void a(Object obj) {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
