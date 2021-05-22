package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Pn  reason: case insensitive filesystem */
public final class RunnableC0591Pn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2884a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2885b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f2886c;
    private final /* synthetic */ int d;
    private final /* synthetic */ long e;
    private final /* synthetic */ long f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ int h;
    private final /* synthetic */ int i;
    private final /* synthetic */ AbstractC0565On j;

    RunnableC0591Pn(AbstractC0565On on, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.j = on;
        this.f2884a = str;
        this.f2885b = str2;
        this.f2886c = i2;
        this.d = i3;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = i4;
        this.i = i5;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f2884a);
        hashMap.put("cachedSrc", this.f2885b);
        hashMap.put("bytesLoaded", Integer.toString(this.f2886c));
        hashMap.put("totalBytes", Integer.toString(this.d));
        hashMap.put("bufferedDuration", Long.toString(this.e));
        hashMap.put("totalDuration", Long.toString(this.f));
        hashMap.put("cacheReady", this.g ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.h));
        hashMap.put("playerPreparedCount", Integer.toString(this.i));
        this.j.a((AbstractC0565On) "onPrecacheEvent", (String) hashMap);
    }
}
