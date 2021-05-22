package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class EO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private String f1859a;

    public EO(String str) {
        this.f1859a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = C2041ql.a(jSONObject, "pii");
            if (!TextUtils.isEmpty(this.f1859a)) {
                a2.put("attok", this.f1859a);
            }
        } catch (JSONException e) {
            C1763mk.e("Failed putting attestation token.", e);
        }
    }
}
