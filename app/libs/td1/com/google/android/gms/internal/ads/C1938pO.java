package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.c.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.pO  reason: case insensitive filesystem */
public final class C1938pO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0023a f5226a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5227b;

    public C1938pO(a.C0023a aVar, String str) {
        this.f5226a = aVar;
        this.f5227b = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            JSONObject a2 = C2041ql.a(jSONObject, "pii");
            if (this.f5226a == null || TextUtils.isEmpty(this.f5226a.a())) {
                a2.put("pdid", this.f5227b);
                a2.put("pdidtype", "ssaid");
                return;
            }
            a2.put("rdid", this.f5226a.a());
            a2.put("is_lat", this.f5226a.b());
            a2.put("idtype", "adid");
        } catch (JSONException e) {
            C1763mk.e("Failed putting Ad ID.", e);
        }
    }
}
