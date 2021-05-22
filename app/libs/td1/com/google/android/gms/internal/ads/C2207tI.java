package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.tI  reason: case insensitive filesystem */
public final /* synthetic */ class C2207tI implements AbstractC2221tW {

    /* renamed from: a  reason: collision with root package name */
    private final C2138sI f5592a;

    /* renamed from: b  reason: collision with root package name */
    private final C1306gC f5593b;

    C2207tI(C2138sI sIVar, C1306gC gCVar) {
        this.f5592a = sIVar;
        this.f5593b = gCVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2221tW
    public final SW b(Object obj) {
        return this.f5592a.a(this.f5593b, (JSONObject) obj);
    }
}
