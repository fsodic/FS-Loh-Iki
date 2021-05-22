package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hX  reason: case insensitive filesystem */
public final class C1396hX extends RW<V> {
    private final Callable<V> d;
    private final /* synthetic */ RunnableFutureC1258fX e;

    C1396hX(RunnableFutureC1258fX fXVar, Callable<V> callable) {
        this.e = fXVar;
        C1945pV.a(callable);
        this.d = callable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final void a(V v, Throwable th) {
        if (th == null) {
            this.e.a((Object) v);
        } else {
            this.e.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final boolean b() {
        return this.e.isDone();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final V c() {
        return this.d.call();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final String d() {
        return this.d.toString();
    }
}
