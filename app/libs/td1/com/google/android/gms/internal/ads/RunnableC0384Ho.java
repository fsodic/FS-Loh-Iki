package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Ho  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0384Ho implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final BinderC0306Eo f2177a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f2178b;

    RunnableC0384Ho(BinderC0306Eo eo, Map map) {
        this.f2177a = eo;
        this.f2178b = map;
    }

    public final void run() {
        this.f2177a.a(this.f2178b);
    }
}
