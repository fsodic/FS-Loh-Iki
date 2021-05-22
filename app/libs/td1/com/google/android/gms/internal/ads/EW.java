package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public abstract class EW<V> extends FW<V> implements SW<V> {
    protected EW() {
    }

    @Override // com.google.android.gms.internal.ads.SW
    public void a(Runnable runnable, Executor executor) {
        c().a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public abstract SW<? extends V> c();
}
