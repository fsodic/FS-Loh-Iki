package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Hu  reason: case insensitive filesystem */
public final class BinderC0390Hu extends AbstractBinderC2394vpa {

    /* renamed from: a  reason: collision with root package name */
    private final String f2186a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2187b;

    public BinderC0390Hu(C1941pR pRVar, String str) {
        this.f2187b = pRVar == null ? null : pRVar.T;
        String a2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? a(pRVar) : null;
        this.f2186a = a2 == null ? str : a2;
    }

    private static String a(C1941pR pRVar) {
        try {
            return pRVar.s.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2187spa
    public final String k() {
        return this.f2186a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2187spa
    public final String lb() {
        return this.f2187b;
    }
}
