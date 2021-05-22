package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

abstract class Kea<K, V, V2> implements Sea<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, _ea<V>> f2419a;

    Kea(Map<K, _ea<V>> map) {
        this.f2419a = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map<K, _ea<V>> a() {
        return this.f2419a;
    }
}
