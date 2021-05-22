package com.google.android.gms.internal.ads;

import java.util.Map;

final class Ica<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, Gca> f2242a;

    private Ica(Map.Entry<K, Gca> entry) {
        this.f2242a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f2242a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f2242a.getValue() == null) {
            return null;
        }
        Gca.c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof AbstractC0993bda) {
            return this.f2242a.getValue().a((AbstractC0993bda) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
