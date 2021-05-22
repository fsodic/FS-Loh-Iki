package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.oo  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC1909oo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f5171a;

    RunnableC1909oo(String str) {
        this.f5171a = str;
    }

    public final void run() {
        q.g().c().b(this.f5171a.substring(1));
    }
}
