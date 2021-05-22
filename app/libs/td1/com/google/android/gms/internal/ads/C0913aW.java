package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.aW  reason: case insensitive filesystem */
public final class C0913aW<V, X extends Throwable> extends AbstractRunnableC0982bW<V, X, AbstractC2221tW<? super X, ? extends V>, SW<? extends V>> {
    C0913aW(SW<? extends V> sw, Class<X> cls, AbstractC2221tW<? super X, ? extends V> tWVar) {
        super(sw, cls, tWVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC0982bW
    public final /* synthetic */ Object a(Object obj, Throwable th) {
        AbstractC2221tW tWVar = (AbstractC2221tW) obj;
        SW b2 = tWVar.b(th);
        C1945pV.a(b2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", tWVar);
        return b2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC0982bW
    public final /* synthetic */ void b(Object obj) {
        a((SW) ((SW) obj));
    }
}
