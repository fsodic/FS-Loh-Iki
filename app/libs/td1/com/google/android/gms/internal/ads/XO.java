package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class XO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f3496a;

    public XO(List<String> list) {
        this.f3496a = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("eid", TextUtils.join(",", this.f3496a));
        } catch (JSONException unused) {
            C1763mk.f("Failed putting experiment ids.");
        }
    }
}
