package b.c.b.a.h;

import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class h<TResult, TContinuationResult> implements n<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f538a;

    /* renamed from: b  reason: collision with root package name */
    private final a<TResult, TContinuationResult> f539b;

    /* renamed from: c  reason: collision with root package name */
    private final p<TContinuationResult> f540c;

    public h(Executor executor, a<TResult, TContinuationResult> aVar, p<TContinuationResult> pVar) {
        this.f538a = executor;
        this.f539b = aVar;
        this.f540c = pVar;
    }

    @Override // b.c.b.a.h.n
    public final void a(e<TResult> eVar) {
        this.f538a.execute(new i(this, eVar));
    }
}
