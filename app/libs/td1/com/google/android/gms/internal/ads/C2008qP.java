package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qP  reason: case insensitive filesystem */
public final class C2008qP implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f5314a;

    public C2008qP(Map<String, Object> map) {
        this.f5314a = map;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", q.c().a(this.f5314a));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            C1763mk.f(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
