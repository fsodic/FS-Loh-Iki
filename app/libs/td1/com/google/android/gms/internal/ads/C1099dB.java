package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dB  reason: case insensitive filesystem */
public final class C1099dB {

    /* renamed from: a  reason: collision with root package name */
    private final VW f4047a;

    /* renamed from: b  reason: collision with root package name */
    private final C1374hB f4048b;

    /* renamed from: c  reason: collision with root package name */
    private final C2476xB f4049c;

    public C1099dB(VW vw, C1374hB hBVar, C2476xB xBVar) {
        this.f4047a = vw;
        this.f4048b = hBVar;
        this.f4049c = xBVar;
    }

    public final SW<C0707Tz> a(BR br, C1941pR pRVar, JSONObject jSONObject) {
        JSONObject optJSONObject;
        SW a2;
        SW a3 = this.f4047a.a(new CallableC1305gB(this, br, pRVar, jSONObject));
        SW<List<BinderC0474La>> b2 = this.f4048b.b(jSONObject, "images");
        SW<BinderC0474La> a4 = this.f4048b.a(jSONObject, "secondary_image");
        SW<BinderC0474La> a5 = this.f4048b.a(jSONObject, "app_icon");
        SW<BinderC0344Ga> c2 = this.f4048b.c(jSONObject, "attribution");
        SW<AbstractC1564jo> c3 = this.f4048b.c(jSONObject);
        C1374hB hBVar = this.f4048b;
        if (jSONObject.optBoolean("enable_omid") && (optJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            String optString = optJSONObject.optString("omid_html");
            if (!TextUtils.isEmpty(optString)) {
                a2 = JW.a(JW.a((Object) null), new C2062rB(hBVar, optString), C0875_l.e);
                SW<List<CB>> a6 = this.f4049c.a(jSONObject, "custom_assets");
                return JW.a(a3, b2, a4, a5, c2, c3, a2, a6).a(new CallableC1236fB(this, a3, b2, a5, a4, c2, jSONObject, c3, a2, a6), this.f4047a);
            }
        }
        a2 = JW.a((Object) null);
        SW<List<CB>> a62 = this.f4049c.a(jSONObject, "custom_assets");
        return JW.a(a3, b2, a4, a5, c2, c3, a2, a62).a(new CallableC1236fB(this, a3, b2, a5, a4, c2, jSONObject, c3, a2, a62), this.f4047a);
    }
}
