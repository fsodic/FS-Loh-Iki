package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gO  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC1318gO implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC1180eO f4385a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4386b;

    RunnableC1318gO(AbstractC1180eO eOVar, long j) {
        this.f4385a = eOVar;
        this.f4386b = j;
    }

    public final void run() {
        AbstractC1180eO eOVar = this.f4385a;
        long j = this.f4386b;
        String canonicalName = eOVar.getClass().getCanonicalName();
        long b2 = q.j().b() - j;
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 40);
        sb.append("Signal runtime : ");
        sb.append(canonicalName);
        sb.append(" = ");
        sb.append(b2);
        C1763mk.f(sb.toString());
    }
}
