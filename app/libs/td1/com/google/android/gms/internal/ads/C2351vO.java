package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vO  reason: case insensitive filesystem */
public final class C2351vO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final String f5804a;

    public C2351vO(String str) {
        this.f5804a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.f5804a);
        } catch (JSONException e) {
            C1763mk.e("Failed putting Ad ID.", e);
        }
    }
}
