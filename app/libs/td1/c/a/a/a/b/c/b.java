package c.a.a.a.b.c;

import c.a.a.a.c.a;
import c.a.a.a.e.e;

class b implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f619a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f620b;

    b(d dVar, e eVar) {
        this.f620b = dVar;
        this.f619a = eVar;
    }

    @Override // c.a.a.a.c.a
    public boolean cancel() {
        this.f619a.abortRequest();
        return true;
    }
}
