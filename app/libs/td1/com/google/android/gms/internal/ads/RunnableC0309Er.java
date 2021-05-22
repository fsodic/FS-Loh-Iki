package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Er  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0309Er implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C0335Fr f1914a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f1915b;

    RunnableC0309Er(C0335Fr fr, JSONObject jSONObject) {
        this.f1914a = fr;
        this.f1915b = jSONObject;
    }

    public final void run() {
        this.f1914a.a(this.f1915b);
    }
}
