package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iC  reason: case insensitive filesystem */
public final /* synthetic */ class C1444iC implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final C1306gC f4543a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4544b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f4545c;

    C1444iC(C1306gC gCVar, String str, JSONObject jSONObject) {
        this.f4543a = gCVar;
        this.f4544b = str;
        this.f4545c = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return this.f4543a.a(this.f4544b, this.f4545c, (AbstractC1564jo) obj);
    }
}
