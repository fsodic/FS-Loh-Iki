package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.mW  reason: case insensitive filesystem */
public final class RunnableC1739mW implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SW f4951a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f4952b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ AbstractC1808nW f4953c;

    RunnableC1739mW(AbstractC1808nW nWVar, SW sw, int i) {
        this.f4953c = nWVar;
        this.f4951a = sw;
        this.f4952b = i;
    }

    public final void run() {
        try {
            if (this.f4951a.isCancelled()) {
                this.f4953c.m = null;
                this.f4953c.cancel(false);
            } else {
                this.f4953c.a((AbstractC1808nW) this.f4952b, (int) this.f4951a);
            }
        } finally {
            this.f4953c.a((AbstractC1808nW) null);
        }
    }
}
