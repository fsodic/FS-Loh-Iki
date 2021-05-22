package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

public class Nea<K, V, V2> {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<K, _ea<V>> f2676a;

    Nea(int i) {
        this.f2676a = Mea.c(i);
    }

    /* access modifiers changed from: package-private */
    public Nea<K, V, V2> a(K k, _ea<V> _ea) {
        LinkedHashMap<K, _ea<V>> linkedHashMap = this.f2676a;
        Xea.a(k, "key");
        Xea.a(_ea, "provider");
        linkedHashMap.put(k, _ea);
        return this;
    }
}
