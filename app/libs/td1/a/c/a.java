package a.c;

import java.util.Map;

/* access modifiers changed from: package-private */
public class a extends f<K, V> {
    final /* synthetic */ b d;

    a(b bVar) {
        this.d = bVar;
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public int a(Object obj) {
        return this.d.a(obj);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public Object a(int i, int i2) {
        return this.d.f[(i << 1) + i2];
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public V a(int i, V v) {
        return (V) this.d.a(i, v);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public void a() {
        this.d.clear();
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public void a(int i) {
        this.d.c(i);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public void a(K k, V v) {
        this.d.put(k, v);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public int b(Object obj) {
        return this.d.b(obj);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public Map<K, V> b() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public int c() {
        return this.d.g;
    }
}
