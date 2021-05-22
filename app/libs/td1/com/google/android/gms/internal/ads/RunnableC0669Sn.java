package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Sn  reason: case insensitive filesystem */
public final class RunnableC0669Sn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3125a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3126b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ int f3127c;
    private final /* synthetic */ AbstractC0565On d;

    RunnableC0669Sn(AbstractC0565On on, String str, String str2, int i) {
        this.d = on;
        this.f3125a = str;
        this.f3126b = str2;
        this.f3127c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f3125a);
        hashMap.put("cachedSrc", this.f3126b);
        hashMap.put("totalBytes", Integer.toString(this.f3127c));
        this.d.a((AbstractC0565On) "onPrecacheEvent", (String) hashMap);
    }
}
