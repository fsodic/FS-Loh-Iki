package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.Vv  reason: case insensitive filesystem */
public final class RunnableC0755Vv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<C0729Uv> f3383a;

    private RunnableC0755Vv(C0729Uv uv) {
        this.f3383a = new WeakReference<>(uv);
    }

    public final void run() {
        C0729Uv uv = this.f3383a.get();
        if (uv != null) {
            uv.R();
        }
    }
}
