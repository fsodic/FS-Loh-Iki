package a.c;

import java.util.Map;

/* access modifiers changed from: package-private */
public class c extends f<E, E> {
    final /* synthetic */ d d;

    c(d dVar) {
        this.d = dVar;
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public int a(Object obj) {
        return this.d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public Object a(int i, int i2) {
        return this.d.h[i];
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public E a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public void a() {
        this.d.clear();
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public void a(int i) {
        this.d.i(i);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public void a(E e, E e2) {
        this.d.add(e);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public int b(Object obj) {
        return this.d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    @Override // a.c.f
    public int c() {
        return this.d.i;
    }
}
