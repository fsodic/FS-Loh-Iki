package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xJ  reason: case insensitive filesystem */
public final class C2484xJ implements AbstractC1862oH<AbstractC1755mg, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final C1176eK f5966a;

    public C2484xJ(C1176eK eKVar) {
        this.f5966a = eKVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1862oH
    public final C1931pH<AbstractC1755mg, ZH> a(String str, JSONObject jSONObject) {
        AbstractC1755mg b2 = this.f5966a.b(str);
        if (b2 == null) {
            return null;
        }
        return new C1931pH<>(b2, new ZH(), str);
    }
}
