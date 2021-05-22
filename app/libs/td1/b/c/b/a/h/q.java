package b.c.b.a.h;

import java.util.concurrent.Callable;

final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p f559a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Callable f560b;

    q(p pVar, Callable callable) {
        this.f559a = pVar;
        this.f560b = callable;
    }

    public final void run() {
        try {
            this.f559a.a(this.f560b.call());
        } catch (Exception e) {
            this.f559a.a(e);
        }
    }
}
