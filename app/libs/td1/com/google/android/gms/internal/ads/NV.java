package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class NV<K, V> extends HV<Map.Entry<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final transient EV<K, V> f2670c;
    private final transient Object[] d;
    private final transient int e = 0;
    private final transient int f;

    NV(EV<K, V> ev, Object[] objArr, int i, int i2) {
        this.f2670c = ev;
        this.d = objArr;
        this.f = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final int a(Object[] objArr, int i) {
        return m().a(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    /* renamed from: a */
    public final WV<Map.Entry<K, V>> iterator() {
        return (WV) m().iterator();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f2670c.get(key));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2634zV
    public final boolean n() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.HV
    public final AV<Map.Entry<K, V>> p() {
        return new QV(this);
    }

    public final int size() {
        return this.f;
    }
}
