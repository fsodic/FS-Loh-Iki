package com.google.android.gms.internal.ads;

import org.cocos2dx.lib.BuildConfig;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class OF implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final LF f2727a;

    /* renamed from: b  reason: collision with root package name */
    private final Qna f2728b;

    OF(LF lf, Qna qna) {
        this.f2727a = lf;
        this.f2728b = qna;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        Qna qna = this.f2728b;
        String str = (String) obj;
        String str2 = qna.f2969a;
        String str3 = qna.f2970b;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str2);
        jSONObject2.put("base_url", BuildConfig.FLAVOR);
        jSONObject2.put("signals", new JSONObject(str3));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return JW.a(jSONObject);
    }
}
