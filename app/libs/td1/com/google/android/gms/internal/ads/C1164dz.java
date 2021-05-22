package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dz  reason: case insensitive filesystem */
final class C1164dz implements AbstractC1021bt<C1365gt> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AbstractC1793nH<C1365gt>> f4169a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, AbstractC1793nH<C0525Mz>> f4170b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, AbstractC1932pI<C0525Mz>> f4171c;
    private final _ea<AbstractC1021bt<AbstractC0951as>> d;
    private final C1098dA e;

    C1164dz(Map<String, AbstractC1793nH<C1365gt>> map, Map<String, AbstractC1793nH<C0525Mz>> map2, Map<String, AbstractC1932pI<C0525Mz>> map3, _ea<AbstractC1021bt<AbstractC0951as>> _ea, C1098dA dAVar) {
        this.f4169a = map;
        this.f4170b = map2;
        this.f4171c = map3;
        this.d = _ea;
        this.e = dAVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1021bt
    public final AbstractC1793nH<C1365gt> a(int i, String str) {
        AbstractC1793nH<AbstractC0951as> a2;
        AbstractC1793nH<C1365gt> nHVar = this.f4169a.get(str);
        if (nHVar != null) {
            return nHVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            AbstractC1932pI<C0525Mz> pIVar = this.f4171c.get(str);
            if (pIVar != null) {
                return C1365gt.a((AbstractC1932pI<? extends C0952at>) pIVar);
            }
            AbstractC1793nH<C0525Mz> nHVar2 = this.f4170b.get(str);
            if (nHVar2 != null) {
                return C1365gt.a(nHVar2);
            }
            return null;
        } else if (this.e.d() == null || (a2 = this.d.get().a(i, str)) == null) {
            return null;
        } else {
            return C1365gt.a(a2);
        }
    }
}
