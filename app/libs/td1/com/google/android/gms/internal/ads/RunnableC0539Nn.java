package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Nn  reason: case insensitive filesystem */
final class RunnableC0539Nn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f2700a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2701b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f2702c;
    private final /* synthetic */ int d;
    private final /* synthetic */ boolean e = false;
    private final /* synthetic */ AbstractC0565On f;

    RunnableC0539Nn(AbstractC0565On on, String str, String str2, int i, int i2, boolean z) {
        this.f = on;
        this.f2700a = str;
        this.f2701b = str2;
        this.f2702c = i;
        this.d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f2700a);
        hashMap.put("cachedSrc", this.f2701b);
        hashMap.put("bytesLoaded", Integer.toString(this.f2702c));
        hashMap.put("totalBytes", Integer.toString(this.d));
        hashMap.put("cacheReady", this.e ? "1" : "0");
        this.f.a((AbstractC0565On) "onPrecacheEvent", (String) hashMap);
    }
}
