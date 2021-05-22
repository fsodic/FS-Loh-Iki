package c.a.a.a.i.f;

import c.a.a.a.AbstractC0124h;
import c.a.a.a.j.d;
import c.a.a.a.j.g;
import c.a.a.a.k.j;
import c.a.a.a.k.u;
import c.a.a.a.p.a;
import c.a.a.a.q;

public abstract class b<T extends q> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    protected final g f878a;

    /* renamed from: b  reason: collision with root package name */
    protected final c.a.a.a.p.d f879b = new c.a.a.a.p.d(128);

    /* renamed from: c  reason: collision with root package name */
    protected final u f880c;

    @Deprecated
    public b(g gVar, u uVar, c.a.a.a.l.g gVar2) {
        a.a(gVar, "Session input buffer");
        this.f878a = gVar;
        this.f880c = uVar == null ? j.f926b : uVar;
    }

    @Override // c.a.a.a.j.d
    public void a(T t) {
        a.a(t, "HTTP message");
        b(t);
        AbstractC0124h headerIterator = t.headerIterator();
        while (headerIterator.hasNext()) {
            this.f878a.a(this.f880c.a(this.f879b, headerIterator.nextHeader()));
        }
        this.f879b.clear();
        this.f878a.a(this.f879b);
    }

    /* access modifiers changed from: protected */
    public abstract void b(T t);
}
