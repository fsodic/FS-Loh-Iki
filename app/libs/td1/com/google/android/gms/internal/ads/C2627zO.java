package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zO  reason: case insensitive filesystem */
public final class C2627zO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f6175a;

    public C2627zO(JSONObject jSONObject) {
        this.f6175a = jSONObject;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = C2041ql.a(jSONObject, "content_info");
            JSONObject jSONObject2 = this.f6175a;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a2.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            C1763mk.f("Failed putting app indexing json.");
        }
    }
}
