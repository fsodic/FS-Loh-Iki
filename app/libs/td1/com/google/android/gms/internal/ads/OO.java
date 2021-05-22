package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class OO implements AbstractC1180eO<AbstractC0905aO<JSONObject>> {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f2741a;

    OO(Context context) {
        this.f2741a = C1277fi.a(context);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1180eO
    public final SW<AbstractC0905aO<JSONObject>> a() {
        return JW.a(new RO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.f2741a);
        } catch (JSONException unused) {
            C1763mk.f("Failed putting version constants.");
        }
    }
}
