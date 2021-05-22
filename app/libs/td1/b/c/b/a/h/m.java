package b.c.b.a.h;

final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f551a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ l f552b;

    m(l lVar, e eVar) {
        this.f552b = lVar;
        this.f551a = eVar;
    }

    public final void run() {
        synchronized (l.a(this.f552b)) {
            if (l.b(this.f552b) != null) {
                l.b(this.f552b).a(this.f551a.a());
            }
        }
    }
}
