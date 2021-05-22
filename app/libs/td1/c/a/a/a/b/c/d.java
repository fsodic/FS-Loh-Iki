package c.a.a.a.b.c;

import c.a.a.a.e.e;
import c.a.a.a.e.i;
import c.a.a.a.k.a;
import c.a.a.a.l.g;
import c.a.a.a.r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d extends a implements h, a, Cloneable, r {

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f623c = new AtomicBoolean(false);
    private final AtomicReference<c.a.a.a.c.a> d = new AtomicReference<>(null);

    protected d() {
    }

    public void a(c.a.a.a.c.a aVar) {
        if (!this.f623c.get()) {
            this.d.set(aVar);
        }
    }

    @Override // c.a.a.a.b.c.a
    @Deprecated
    public void a(e eVar) {
        a(new b(this, eVar));
    }

    @Override // c.a.a.a.b.c.a
    @Deprecated
    public void a(i iVar) {
        a(new c(this, iVar));
    }

    public void abort() {
        c.a.a.a.c.a andSet;
        if (this.f623c.compareAndSet(false, true) && (andSet = this.d.getAndSet(null)) != null) {
            andSet.cancel();
        }
    }

    @Override // java.lang.Object
    public Object clone() {
        d dVar = (d) super.clone();
        dVar.f905a = (c.a.a.a.k.r) c.a.a.a.b.f.a.a(this.f905a);
        dVar.f906b = (g) c.a.a.a.b.f.a.a(this.f906b);
        return dVar;
    }

    public boolean isAborted() {
        return this.f623c.get();
    }
}
