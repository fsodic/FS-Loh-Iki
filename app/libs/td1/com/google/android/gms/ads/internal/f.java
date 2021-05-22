package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.AbstractC2221tW;
import com.google.android.gms.internal.ads.JW;
import com.google.android.gms.internal.ads.SW;
import org.json.JSONObject;

final /* synthetic */ class f implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC2221tW f1080a = new f();

    private f() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            q.g().i().d(jSONObject.getString("appSettingsJson"));
        }
        return JW.a((Object) null);
    }
}
