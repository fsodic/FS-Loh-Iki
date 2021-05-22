package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ax  reason: case insensitive filesystem */
public final /* synthetic */ class RunnableC0956ax implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final AbstractC0886_w f3854a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3855b;

    RunnableC0956ax(AbstractC0886_w _wVar, Object obj) {
        this.f3854a = _wVar;
        this.f3855b = obj;
    }

    public final void run() {
        try {
            this.f3854a.a(this.f3855b);
        } catch (Throwable th) {
            q.g().b(th, "EventEmitter.notify");
            C1763mk.e("Event emitter exception.", th);
        }
    }
}
