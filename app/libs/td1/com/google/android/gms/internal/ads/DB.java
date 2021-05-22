package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class DB implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final EB f1750a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f1751b;

    DB(EB eb, JSONObject jSONObject) {
        this.f1750a = eb;
        this.f1751b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return this.f1750a.a(this.f1751b, (AbstractC1564jo) obj);
    }
}
