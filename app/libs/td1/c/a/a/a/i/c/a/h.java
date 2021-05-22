package c.a.a.a.i.c.a;

import c.a.a.a.e.b.b;
import c.a.a.a.e.e;
import c.a.a.a.e.o;
import c.a.a.a.p.a;
import java.util.concurrent.TimeUnit;

class h implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f802a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f803b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f804c;

    h(i iVar, f fVar, b bVar) {
        this.f804c = iVar;
        this.f802a = fVar;
        this.f803b = bVar;
    }

    @Override // c.a.a.a.e.e
    public void abortRequest() {
        this.f802a.abortRequest();
    }

    @Override // c.a.a.a.e.e
    public o getConnection(long j, TimeUnit timeUnit) {
        a.a(this.f803b, "Route");
        if (this.f804c.f805a.a()) {
            c.a.a.a.h.b bVar = this.f804c.f805a;
            bVar.a("Get connection: " + this.f803b + ", timeout = " + j);
        }
        return new c(this.f804c, this.f802a.getPoolEntry(j, timeUnit));
    }
}
