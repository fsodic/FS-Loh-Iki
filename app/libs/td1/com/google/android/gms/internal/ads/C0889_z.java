package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads._z  reason: case insensitive filesystem */
public final class C0889_z extends C0811Xz {

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f3777b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f3778c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public C0889_z(C1941pR pRVar, JSONObject jSONObject) {
        super(pRVar);
        boolean z = false;
        this.f3777b = C2041ql.a(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f3778c = C2041ql.a(false, jSONObject, "allow_pub_owned_ad_view");
        this.d = C2041ql.a(false, jSONObject, "attribution", "allow_pub_rendering");
        this.e = C2041ql.a(false, jSONObject, "enable_omid");
        if (!(jSONObject == null || jSONObject.optJSONObject("overlay") == null)) {
            z = true;
        }
        this.f = z;
    }

    @Override // com.google.android.gms.internal.ads.C0811Xz
    public final boolean a() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.C0811Xz
    public final JSONObject b() {
        JSONObject jSONObject = this.f3777b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f3531a.w);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.C0811Xz
    public final boolean c() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.C0811Xz
    public final boolean d() {
        return this.f3778c;
    }

    @Override // com.google.android.gms.internal.ads.C0811Xz
    public final boolean e() {
        return this.d;
    }
}
