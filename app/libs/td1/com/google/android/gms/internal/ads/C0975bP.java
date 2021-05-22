package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bP  reason: case insensitive filesystem */
public final class C0975bP implements AbstractC0905aO<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private Bundle f3891a;

    public C0975bP(Bundle bundle) {
        this.f3891a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.AbstractC0905aO
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.f3891a != null) {
            try {
                C2041ql.a(C2041ql.a(jSONObject2, "device"), "play_store").put("parental_controls", q.c().a(this.f3891a));
            } catch (JSONException unused) {
                C1763mk.f("Failed putting parental controls bundle.");
            }
        }
    }
}
