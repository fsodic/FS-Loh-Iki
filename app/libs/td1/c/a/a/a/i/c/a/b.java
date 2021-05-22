package c.a.a.a.i.c.a;

import c.a.a.a.e.d;
import c.a.a.a.e.q;
import c.a.a.a.p.a;
import java.util.concurrent.TimeUnit;

@Deprecated
public class b extends c.a.a.a.i.c.b {
    private final long f = System.currentTimeMillis();
    private long g;
    private final long h;
    private long i;

    public b(d dVar, c.a.a.a.e.b.b bVar, long j, TimeUnit timeUnit) {
        super(dVar, bVar);
        a.a(bVar, "HTTP route");
        this.h = j > 0 ? this.f + timeUnit.toMillis(j) : Long.MAX_VALUE;
        this.i = this.h;
    }

    public void a(long j, TimeUnit timeUnit) {
        this.g = System.currentTimeMillis();
        this.i = Math.min(this.h, j > 0 ? this.g + timeUnit.toMillis(j) : Long.MAX_VALUE);
    }

    public boolean a(long j) {
        return j >= this.i;
    }

    /* access modifiers changed from: protected */
    @Override // c.a.a.a.i.c.b
    public void b() {
        super.b();
    }

    /* access modifiers changed from: protected */
    public final q c() {
        return this.f814b;
    }

    /* access modifiers changed from: protected */
    public final c.a.a.a.e.b.b d() {
        return this.f815c;
    }
}
