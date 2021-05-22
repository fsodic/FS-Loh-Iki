package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

final class QV extends AV<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ NV f2940c;

    QV(NV nv) {
        this.f2940c = nv;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        C1945pV.a(i, NV.a(this.f2940c));
        Object[] b2 = NV.b(this.f2940c);
        int i2 = i * 2;
        NV nv = this.f2940c;
        Object obj = b2[i2];
        Object[] b3 = NV.b(nv);
        NV nv2 = this.f2940c;
        return new AbstractMap.SimpleImmutableEntry(obj, b3[i2 + 1]);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return true;
    }

    public final int size() {
        return NV.a(this.f2940c);
    }
}
