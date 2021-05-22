package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Un  reason: case insensitive filesystem */
public final class RunnableC0721Un implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f3290a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f3291b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3292c;
    private final /* synthetic */ String d;
    private final /* synthetic */ AbstractC0565On e;

    RunnableC0721Un(AbstractC0565On on, String str, String str2, String str3, String str4) {
        this.e = on;
        this.f3290a = str;
        this.f3291b = str2;
        this.f3292c = str3;
        this.d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f3290a);
        if (!TextUtils.isEmpty(this.f3291b)) {
            hashMap.put("cachedSrc", this.f3291b);
        }
        AbstractC0565On on = this.e;
        hashMap.put("type", AbstractC0565On.c(this.f3292c));
        hashMap.put("reason", this.f3292c);
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put("message", this.d);
        }
        this.e.a((AbstractC0565On) "onPrecacheEvent", (String) hashMap);
    }
}
