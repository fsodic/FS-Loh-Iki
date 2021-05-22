package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Rn  reason: case insensitive filesystem */
public final class RunnableC0643Rn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3042a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3043b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f3044c;
    private final /* synthetic */ AbstractC0565On d;

    RunnableC0643Rn(AbstractC0565On on, String str, String str2, long j) {
        this.d = on;
        this.f3042a = str;
        this.f3043b = str2;
        this.f3044c = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f3042a);
        hashMap.put("cachedSrc", this.f3043b);
        hashMap.put("totalDuration", Long.toString(this.f3044c));
        this.d.a((AbstractC0565On) "onPrecacheEvent", (String) hashMap);
    }
}
