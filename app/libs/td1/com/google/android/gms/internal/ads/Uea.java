package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class Uea<K, V> extends Kea<K, V, V> {

    /* renamed from: b  reason: collision with root package name */
    private static final _ea<Map<Object, Object>> f3260b = Qea.a(Collections.emptyMap());

    private Uea(Map<K, _ea<V>> map) {
        super(map);
    }

    public static <K, V> Vea<K, V> a(int i) {
        return new Vea<>(i);
    }

    @Override // com.google.android.gms.internal.ads._ea
    public final /* synthetic */ Object get() {
        LinkedHashMap c2 = Mea.c(a().size());
        for (Map.Entry<K, _ea<V>> entry : a().entrySet()) {
            c2.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(c2);
    }
}
