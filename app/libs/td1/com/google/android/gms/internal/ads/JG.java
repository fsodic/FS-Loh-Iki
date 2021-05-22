package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

final class JG implements AbstractC0374He<GG> {
    JG() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0374He
    public final /* synthetic */ JSONObject a(GG gg) {
        GG gg2 = gg;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", gg2.d.d());
        jSONObject2.put("signals", gg2.f2017c);
        jSONObject3.put("body", gg2.f2016b.f2644c);
        jSONObject3.put("headers", q.c().a(gg2.f2016b.f2643b));
        jSONObject3.put("response_code", gg2.f2016b.f2642a);
        jSONObject3.put("latency", gg2.f2016b.d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", gg2.d.g());
        return jSONObject;
    }
}
