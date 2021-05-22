package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gB  reason: case insensitive filesystem */
public final /* synthetic */ class CallableC1305gB implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C1099dB f4359a;

    /* renamed from: b  reason: collision with root package name */
    private final BR f4360b;

    /* renamed from: c  reason: collision with root package name */
    private final C1941pR f4361c;
    private final JSONObject d;

    CallableC1305gB(C1099dB dBVar, BR br, C1941pR pRVar, JSONObject jSONObject) {
        this.f4359a = dBVar;
        this.f4360b = br;
        this.f4361c = pRVar;
        this.d = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1099dB dBVar = this.f4359a;
        BR br = this.f4360b;
        C1941pR pRVar = this.f4361c;
        JSONObject jSONObject = this.d;
        C0707Tz tz = new C0707Tz();
        tz.a(jSONObject.optInt("template_id", -1));
        tz.a(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        tz.b(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        GR gr = br.f1610a.f5888a;
        if (gr.g.contains(Integer.toString(tz.o()))) {
            if (tz.o() == 3) {
                if (tz.e() == null) {
                    throw new SI(YR.f3560a, "No custom template id for custom template ad response.");
                } else if (!gr.h.contains(tz.e())) {
                    throw new SI(YR.f3560a, "Unexpected custom template id in the response.");
                }
            }
            tz.a(jSONObject.optDouble("rating", -1.0d));
            String optString = jSONObject.optString("headline", null);
            if (pRVar.E) {
                q.c();
                String c2 = C2452wk.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 3 + String.valueOf(optString).length());
                sb.append(c2);
                sb.append(" : ");
                sb.append(optString);
                optString = sb.toString();
            }
            tz.a("headline", optString);
            tz.a("body", jSONObject.optString("body", null));
            tz.a("call_to_action", jSONObject.optString("call_to_action", null));
            tz.a("store", jSONObject.optString("store", null));
            tz.a("price", jSONObject.optString("price", null));
            tz.a("advertiser", jSONObject.optString("advertiser", null));
            return tz;
        }
        int i = YR.f3560a;
        int o = tz.o();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid template ID: ");
        sb2.append(o);
        throw new SI(i, sb2.toString());
    }
}
