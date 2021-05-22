package b.c.b.a.d.d;

import java.util.Map;

/* access modifiers changed from: package-private */
public final class Pa implements Comparable<Pa>, Map.Entry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final K f383a;

    /* renamed from: b  reason: collision with root package name */
    private V f384b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Ia f385c;

    Pa(Ia ia, K k, V v) {
        this.f385c = ia;
        this.f383a = k;
        this.f384b = v;
    }

    Pa(Ia ia, Map.Entry<K, V> entry) {
        this(ia, entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Pa pa) {
        return ((Comparable) getKey()).compareTo((Comparable) pa.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a(this.f383a, entry.getKey()) && a(this.f384b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f383a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f384b;
    }

    public final int hashCode() {
        K k = this.f383a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.f384b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.f385c.f();
        V v2 = this.f384b;
        this.f384b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f383a);
        String valueOf2 = String.valueOf(this.f384b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
