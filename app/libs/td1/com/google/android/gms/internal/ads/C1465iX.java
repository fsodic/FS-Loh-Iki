package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.iX  reason: case insensitive filesystem */
public final class C1465iX extends RW<SW<V>> {
    private final AbstractC2083rW<V> d;
    private final /* synthetic */ RunnableFutureC1258fX e;

    C1465iX(RunnableFutureC1258fX fXVar, AbstractC2083rW<V> rWVar) {
        this.e = fXVar;
        C1945pV.a(rWVar);
        this.d = rWVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final /* synthetic */ void a(Object obj, Throwable th) {
        SW sw = (SW) obj;
        if (th == null) {
            this.e.a(sw);
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
    public final /* synthetic */ Object c() {
        SW<V> a2 = this.d.a();
        C1945pV.a(a2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.d);
        return a2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.RW
    public final String d() {
        return this.d.toString();
    }
}
