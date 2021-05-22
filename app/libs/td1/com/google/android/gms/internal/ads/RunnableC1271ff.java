package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ff  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC1271ff implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C1340gf f4310a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4311b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4312c;

    RunnableC1271ff(C1340gf gfVar, Context context, String str) {
        this.f4310a = gfVar;
        this.f4311b = context;
        this.f4312c = str;
    }

    public final void run() {
        C1340gf.b(this.f4311b, this.f4312c);
    }
}
