package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ng  reason: case insensitive filesystem */
public final class C0532Ng {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f2679a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2680b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2681c;
    private final boolean d;
    private final boolean e;

    private C0532Ng(C0610Qg qg) {
        this.f2679a = qg.f2953a;
        this.f2680b = qg.f2954b;
        this.f2681c = qg.f2955c;
        this.d = qg.d;
        this.e = qg.e;
    }

    public final JSONObject a() {
        try {
            return new JSONObject().put("sms", this.f2679a).put("tel", this.f2680b).put("calendar", this.f2681c).put("storePicture", this.d).put("inlineVideo", this.e);
        } catch (JSONException e2) {
            C0745Vl.b("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
