package b.c.b.a.h;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class p<TResult> extends e<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f556a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final o<TResult> f557b = new o<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f558c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    p() {
    }

    private final void f() {
        r.b(this.f558c, "Task is not yet complete");
    }

    private final void g() {
        r.b(!this.f558c, "Task is already complete");
    }

    private final void h() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void i() {
        synchronized (this.f556a) {
            if (this.f558c) {
                this.f557b.a(this);
            }
        }
    }

    @Override // b.c.b.a.h.e
    public final <TContinuationResult> e<TContinuationResult> a(Executor executor, a<TResult, TContinuationResult> aVar) {
        p pVar = new p();
        this.f557b.a(new h(executor, aVar, pVar));
        i();
        return pVar;
    }

    @Override // b.c.b.a.h.e
    public final e<TResult> a(Executor executor, b<TResult> bVar) {
        this.f557b.a(new j(executor, bVar));
        i();
        return this;
    }

    @Override // b.c.b.a.h.e
    public final e<TResult> a(Executor executor, c cVar) {
        this.f557b.a(new l(executor, cVar));
        i();
        return this;
    }

    @Override // b.c.b.a.h.e
    public final Exception a() {
        Exception exc;
        synchronized (this.f556a) {
            exc = this.f;
        }
        return exc;
    }

    public final void a(Exception exc) {
        r.a(exc, "Exception must not be null");
        synchronized (this.f556a) {
            g();
            this.f558c = true;
            this.f = exc;
        }
        this.f557b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.f556a) {
            g();
            this.f558c = true;
            this.e = tresult;
        }
        this.f557b.a(this);
    }

    @Override // b.c.b.a.h.e
    public final TResult b() {
        TResult tresult;
        synchronized (this.f556a) {
            f();
            h();
            if (this.f == null) {
                tresult = this.e;
            } else {
                throw new d(this.f);
            }
        }
        return tresult;
    }

    public final boolean b(Exception exc) {
        r.a(exc, "Exception must not be null");
        synchronized (this.f556a) {
            if (this.f558c) {
                return false;
            }
            this.f558c = true;
            this.f = exc;
            this.f557b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.f556a) {
            if (this.f558c) {
                return false;
            }
            this.f558c = true;
            this.e = tresult;
            this.f557b.a(this);
            return true;
        }
    }

    @Override // b.c.b.a.h.e
    public final boolean c() {
        return this.d;
    }

    @Override // b.c.b.a.h.e
    public final boolean d() {
        boolean z;
        synchronized (this.f556a) {
            z = this.f558c && !this.d && this.f == null;
        }
        return z;
    }

    public final boolean e() {
        synchronized (this.f556a) {
            if (this.f558c) {
                return false;
            }
            this.f558c = true;
            this.d = true;
            this.f557b.a(this);
            return true;
        }
    }
}
