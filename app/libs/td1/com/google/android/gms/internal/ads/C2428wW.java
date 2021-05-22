package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.wW  reason: case insensitive filesystem */
public final class C2428wW extends AbstractC2635zW<V> {
    private final Callable<V> g;
    private final /* synthetic */ C2497xW h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2428wW(C2497xW xWVar, Callable<V> callable, Executor executor) {
        super(xWVar, executor);
        this.h = xWVar;
        C1945pV.a(callable);
        this.g = callable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2635zW
    public final void a(V v) {
        this.h.a((Object) v);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final V c() {
        this.e = false;
        return this.g.call();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final String d() {
        return this.g.toString();
    }
}
