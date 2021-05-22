package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Mc  reason: case insensitive filesystem */
public final class C0502Mc implements AbstractC0476Lc {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C1423hm f2602a;

    C0502Mc(C0424Jc jc, C1423hm hmVar) {
        this.f2602a = hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0476Lc
    public final void a(String str) {
        this.f2602a.a(new C0270De(str));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0476Lc
    public final void a(JSONObject jSONObject) {
        this.f2602a.b(jSONObject);
    }
}
