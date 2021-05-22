package b.c.b.a.h;

final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f546a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ j f547b;

    k(j jVar, e eVar) {
        this.f547b = jVar;
        this.f546a = eVar;
    }

    public final void run() {
        synchronized (j.a(this.f547b)) {
            if (j.b(this.f547b) != null) {
                j.b(this.f547b).a(this.f546a);
            }
        }
    }
}
