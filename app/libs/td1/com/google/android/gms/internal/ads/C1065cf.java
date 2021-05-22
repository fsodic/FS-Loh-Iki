package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.cf  reason: case insensitive filesystem */
public final class C1065cf implements AbstractC0476Lc {

    /* renamed from: a  reason: collision with root package name */
    private final C1423hm<O> f4009a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C0927af f4010b;

    public C1065cf(C0927af afVar, C1423hm<O> hmVar) {
        this.f4010b = afVar;
        this.f4009a = hmVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0476Lc
    public final void a(String str) {
        if (str == null) {
            try {
                this.f4009a.a(new C0270De());
            } catch (IllegalStateException unused) {
            }
        } else {
            this.f4009a.a(new C0270De(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0476Lc
    public final void a(JSONObject jSONObject) {
        try {
            this.f4009a.b((O) this.f4010b.f3821a.a(jSONObject));
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f4009a.a(e);
        }
    }
}
