package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;

public final class YO implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final Location f3555a;

    public YO(Location location) {
        this.f3555a = location;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.f3555a != null) {
                JSONObject jSONObject3 = new JSONObject();
                Float valueOf = Float.valueOf(this.f3555a.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.f3555a.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.f3555a.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.f3555a.getLongitude() * 1.0E7d));
                jSONObject3.put("radius", valueOf);
                jSONObject3.put("lat", valueOf3);
                jSONObject3.put("long", valueOf4);
                jSONObject3.put("time", valueOf2);
                jSONObject2.put("uule", jSONObject3);
            }
        } catch (JSONException e) {
            C1763mk.e("Failed adding location to the request JSON.", e);
        }
    }
}
