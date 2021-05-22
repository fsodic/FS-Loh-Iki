package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.gW  reason: case insensitive filesystem */
public final class C1326gW<V, X extends Throwable> extends AbstractRunnableC0982bW<V, X, AbstractC1187eV<? super X, ? extends V>, V> {
    C1326gW(SW<? extends V> sw, Class<X> cls, AbstractC1187eV<? super X, ? extends V> eVVar) {
        super(sw, cls, eVVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC0982bW
    public final /* synthetic */ Object a(Object obj, Throwable th) {
        return ((AbstractC1187eV) obj).apply(th);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC0982bW
    public final void b(V v) {
        a((Object) v);
    }
}
