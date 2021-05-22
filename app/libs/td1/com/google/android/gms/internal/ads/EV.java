package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class EV<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map.Entry<?, ?>[] f1866a = new Map.Entry[0];

    /* renamed from: b  reason: collision with root package name */
    private transient HV<Map.Entry<K, V>> f1867b;

    /* renamed from: c  reason: collision with root package name */
    private transient HV<K> f1868c;
    private transient AbstractC2634zV<V> d;

    EV() {
    }

    public static <K, V> EV<K, V> a(K k, V v) {
        C2289uV.a(k, v);
        return OV.a(1, new Object[]{k, v});
    }

    public static <K, V> EV<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C2289uV.a(k, v);
        C2289uV.a(k2, v2);
        C2289uV.a(k3, v3);
        C2289uV.a(k4, v4);
        C2289uV.a(k5, v5);
        return OV.a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    /* access modifiers changed from: package-private */
    public abstract HV<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract HV<K> b();

    /* access modifiers changed from: package-private */
    public abstract AbstractC2634zV<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return ((AbstractC2634zV) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        HV<Map.Entry<K, V>> hv = this.f1867b;
        if (hv != null) {
            return hv;
        }
        HV<Map.Entry<K, V>> a2 = a();
        this.f1867b = a2;
        return a2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public int hashCode() {
        return UV.a((HV) entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        HV<K> hv = this.f1868c;
        if (hv != null) {
            return hv;
        }
        HV<K> b2 = b();
        this.f1868c = b2;
        return b2;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        C2289uV.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append((Object) entry.getKey());
            sb.append('=');
            sb.append((Object) entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        AbstractC2634zV<V> zVVar = this.d;
        if (zVVar != null) {
            return zVVar;
        }
        AbstractC2634zV<V> c2 = c();
        this.d = c2;
        return c2;
    }
}
