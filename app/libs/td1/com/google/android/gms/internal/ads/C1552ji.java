package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ji  reason: case insensitive filesystem */
public final class C1552ji implements AbstractC0819Yh {

    /* renamed from: a  reason: collision with root package name */
    private AbstractC0348Ge<JSONObject, JSONObject> f4706a;

    /* renamed from: b  reason: collision with root package name */
    private AbstractC0348Ge<JSONObject, JSONObject> f4707b;

    public C1552ji(Context context) {
        C0556Oe a2 = q.p().a(context, C0823Yl.L());
        AbstractC0452Ke<JSONObject> ke = C0426Je.f2334b;
        this.f4706a = a2.a("google.afma.request.getAdDictionary", ke, ke);
        C0556Oe a3 = q.p().a(context, C0823Yl.L());
        AbstractC0452Ke<JSONObject> ke2 = C0426Je.f2334b;
        this.f4707b = a3.a("google.afma.sdkConstants.getSdkConstants", ke2, ke2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0819Yh
    public final AbstractC0348Ge<JSONObject, JSONObject> a() {
        return this.f4707b;
    }
}
