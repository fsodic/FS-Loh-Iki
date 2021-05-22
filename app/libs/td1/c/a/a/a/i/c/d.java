package c.a.a.a.i.c;

import c.a.a.a.e.b.b;
import c.a.a.a.e.e;
import c.a.a.a.e.o;
import java.util.concurrent.TimeUnit;

class d implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f817b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f818c;

    d(e eVar, b bVar, Object obj) {
        this.f818c = eVar;
        this.f816a = bVar;
        this.f817b = obj;
    }

    @Override // c.a.a.a.e.e
    public void abortRequest() {
    }

    @Override // c.a.a.a.e.e
    public o getConnection(long j, TimeUnit timeUnit) {
        return this.f818c.b(this.f816a, this.f817b);
    }
}
