package b.c.b.a.h;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class l<TResult> implements n<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f548a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f549b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private c f550c;

    public l(Executor executor, c cVar) {
        this.f548a = executor;
        this.f550c = cVar;
    }

    @Override // b.c.b.a.h.n
    public final void a(e<TResult> eVar) {
        if (!eVar.d() && !eVar.c()) {
            synchronized (this.f549b) {
                if (this.f550c != null) {
                    this.f548a.execute(new m(this, eVar));
                }
            }
        }
    }
}
