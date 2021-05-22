package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.qk  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC2039qk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C2176sk f5347a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5348b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5349c;

    RunnableC2039qk(C2176sk skVar, Context context, String str) {
        this.f5347a = skVar;
        this.f5348b = context;
        this.f5349c = str;
    }

    public final void run() {
        this.f5347a.a(this.f5348b, this.f5349c);
    }
}
