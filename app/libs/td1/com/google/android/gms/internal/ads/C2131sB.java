package com.google.android.gms.internal.ads;

import java.util.List;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.sB  reason: case insensitive filesystem */
public final /* synthetic */ class C2131sB implements AbstractC1187eV {

    /* renamed from: a  reason: collision with root package name */
    private final C1374hB f5480a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f5481b;

    C2131sB(C1374hB hBVar, JSONObject jSONObject) {
        this.f5480a = hBVar;
        this.f5481b = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1187eV
    public final Object apply(Object obj) {
        return this.f5480a.a(this.f5481b, (List) obj);
    }
}
