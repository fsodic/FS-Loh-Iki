package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ur  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC2327ur implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1564jo f5766a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f5767b;

    RunnableC2327ur(AbstractC1564jo joVar, JSONObject jSONObject) {
        this.f5766a = joVar;
        this.f5767b = jSONObject;
    }

    public final void run() {
        this.f5766a.b("AFMA_updateActiveView", this.f5767b);
    }
}
