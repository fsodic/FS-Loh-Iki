package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class Gda implements Comparable<Gda>, Map.Entry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f2051a;

    /* renamed from: b  reason: collision with root package name */
    private V f2052b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bda f2053c;

    Gda(Bda bda, K k, V v) {
        this.f2053c = bda;
        this.f2051a = k;
        this.f2052b = v;
    }

    Gda(Bda bda, Map.Entry<K, V> entry) {
        this(bda, entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Gda gda) {
        return ((Comparable) getKey()).compareTo((Comparable) gda.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f2051a, entry.getKey()) && a(this.f2052b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f2051a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f2052b;
    }

    public final int hashCode() {
        K k = this.f2051a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f2052b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f2053c.f();
        V v2 = this.f2052b;
        this.f2052b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2051a);
        String valueOf2 = String.valueOf(this.f2052b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
