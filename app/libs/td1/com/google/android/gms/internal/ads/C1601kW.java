package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.kW  reason: case insensitive filesystem */
public final class C1601kW<I, O> extends AbstractRunnableC1395hW<I, O, AbstractC2221tW<? super I, ? extends O>, SW<? extends O>> {
    C1601kW(SW<? extends I> sw, AbstractC2221tW<? super I, ? extends O> tWVar) {
        super(sw, tWVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1395hW
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        AbstractC2221tW tWVar = (AbstractC2221tW) obj;
        SW<O> b2 = tWVar.b(obj2);
        C1945pV.a(b2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", tWVar);
        return b2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1395hW
    public final /* synthetic */ void b(Object obj) {
        a((SW) ((SW) obj));
    }
}
