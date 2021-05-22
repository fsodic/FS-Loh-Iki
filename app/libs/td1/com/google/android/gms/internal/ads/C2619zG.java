package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.zG  reason: case insensitive filesystem */
public final /* synthetic */ class C2619zG implements AbstractC1461iT {

    /* renamed from: a  reason: collision with root package name */
    static final AbstractC1461iT f6165a = new C2619zG();

    private C2619zG() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1461iT
    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        C1763mk.f("Ad request signals:");
        C1763mk.f(jSONObject.toString(2));
        return jSONObject;
    }
}
