package b.c.b.a.h;

final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f541a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ h f542b;

    i(h hVar, e eVar) {
        this.f542b = hVar;
        this.f541a = eVar;
    }

    public final void run() {
        if (this.f541a.c()) {
            h.a(this.f542b).e();
            return;
        }
        try {
            h.a(this.f542b).a(h.b(this.f542b).a(this.f541a));
        } catch (d e) {
            if (e.getCause() instanceof Exception) {
                h.a(this.f542b).a((Exception) e.getCause());
            } else {
                h.a(this.f542b).a((Exception) e);
            }
        } catch (Exception e2) {
            h.a(this.f542b).a(e2);
        }
    }
}
