package b.c.b.a.d.d;

import java.util.Map;

final class X<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, V> f396a;

    private X(Map.Entry<K, V> entry) {
        this.f396a = entry;
    }

    public final V a() {
        return this.f396a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f396a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f396a.getValue() == null) {
            return null;
        }
        V.c();
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof AbstractC0089ra) {
            return this.f396a.getValue().a((AbstractC0089ra) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
