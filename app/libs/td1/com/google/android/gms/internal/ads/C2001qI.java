package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.qI  reason: case insensitive filesystem */
public final class C2001qI implements AbstractC1862oH<SR, ZH> {

    /* renamed from: a  reason: collision with root package name */
    private final C1789nD f5302a;

    public C2001qI(C1789nD nDVar) {
        this.f5302a = nDVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1862oH
    public final C1931pH<SR, ZH> a(String str, JSONObject jSONObject) {
        SR a2 = this.f5302a.a(str, jSONObject);
        if (a2 == null) {
            return null;
        }
        return new C1931pH<>(a2, new ZH(), str);
    }
}
