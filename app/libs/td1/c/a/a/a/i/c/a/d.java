package c.a.a.a.i.c.a;

import c.a.a.a.e.b.b;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class d implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k f796a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f797b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f798c;
    final /* synthetic */ e d;

    d(e eVar, k kVar, b bVar, Object obj) {
        this.d = eVar;
        this.f796a = kVar;
        this.f797b = bVar;
        this.f798c = obj;
    }

    @Override // c.a.a.a.i.c.a.f
    public void abortRequest() {
        this.d.f.lock();
        try {
            this.f796a.a();
        } finally {
            this.d.f.unlock();
        }
    }

    @Override // c.a.a.a.i.c.a.f
    public b getPoolEntry(long j, TimeUnit timeUnit) {
        return this.d.a(this.f797b, this.f798c, j, timeUnit, this.f796a);
    }
}
