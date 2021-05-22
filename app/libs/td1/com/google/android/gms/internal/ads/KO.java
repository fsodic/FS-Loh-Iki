package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

public final class KO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f2395a;

    public KO(JSONObject jSONObject) {
        this.f2395a = jSONObject;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.f2395a);
        } catch (JSONException unused) {
            C1763mk.f("Unable to get cache_state");
        }
    }
}
