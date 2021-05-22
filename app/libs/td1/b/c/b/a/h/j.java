package b.c.b.a.h;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class j<TResult> implements n<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f543a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f544b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b<TResult> f545c;

    public j(Executor executor, b<TResult> bVar) {
        this.f543a = executor;
        this.f545c = bVar;
    }

    @Override // b.c.b.a.h.n
    public final void a(e<TResult> eVar) {
        synchronized (this.f544b) {
            if (this.f545c != null) {
                this.f543a.execute(new k(this, eVar));
            }
        }
    }
}
