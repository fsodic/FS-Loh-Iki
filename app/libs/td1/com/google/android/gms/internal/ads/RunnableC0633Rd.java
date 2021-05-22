package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Rd  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0633Rd implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f3026a;

    RunnableC0633Rd(String str) {
        this.f3026a = str;
    }

    public final void run() {
        q.g().c().b(this.f3026a.substring(1));
    }
}
