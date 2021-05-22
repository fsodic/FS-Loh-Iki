package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Qn  reason: case insensitive filesystem */
public final class RunnableC0617Qn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2966a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2967b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f2968c;
    private final /* synthetic */ long d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ int f;
    private final /* synthetic */ int g;
    private final /* synthetic */ AbstractC0565On h;

    RunnableC0617Qn(AbstractC0565On on, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.h = on;
        this.f2966a = str;
        this.f2967b = str2;
        this.f2968c = j;
        this.d = j2;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f2966a);
        hashMap.put("cachedSrc", this.f2967b);
        hashMap.put("bufferedDuration", Long.toString(this.f2968c));
        hashMap.put("totalDuration", Long.toString(this.d));
        hashMap.put("cacheReady", this.e ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f));
        hashMap.put("playerPreparedCount", Integer.toString(this.g));
        this.h.a((AbstractC0565On) "onPrecacheEvent", (String) hashMap);
    }
}
