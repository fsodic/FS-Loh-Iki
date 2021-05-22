package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.jW  reason: case insensitive filesystem */
public final class C1532jW<I, O> extends AbstractRunnableC1395hW<I, O, AbstractC1187eV<? super I, ? extends O>, O> {
    C1532jW(SW<? extends I> sw, AbstractC1187eV<? super I, ? extends O> eVVar) {
        super(sw, eVVar);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1395hW
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((AbstractC1187eV) obj).apply(obj2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC1395hW
    public final void b(O o) {
        a((Object) o);
    }
}
