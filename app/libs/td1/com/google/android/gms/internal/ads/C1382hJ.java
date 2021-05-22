package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hJ  reason: case insensitive filesystem */
public final class C1382hJ implements AbstractC1862oH<SR, YH> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, C1931pH<SR, YH>> f4465a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final C1789nD f4466b;

    public C1382hJ(C1789nD nDVar) {
        this.f4466b = nDVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1862oH
    public final C1931pH<SR, YH> a(String str, JSONObject jSONObject) {
        synchronized (this) {
            C1931pH<SR, YH> pHVar = this.f4465a.get(str);
            if (pHVar == null) {
                SR a2 = this.f4466b.a(str, jSONObject);
                if (a2 == null) {
                    return null;
                }
                pHVar = new C1931pH<>(a2, new YH(), str);
                this.f4465a.put(str, pHVar);
            }
            return pHVar;
        }
    }
}
