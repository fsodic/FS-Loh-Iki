package a.a.a.a;

import java.util.concurrent.Executor;

public class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f0a;

    /* renamed from: b  reason: collision with root package name */
    private static final Executor f1b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final Executor f2c = new b();
    private f d = this.e;
    private f e = new e();

    private c() {
    }

    public static c b() {
        if (f0a != null) {
            return f0a;
        }
        synchronized (c.class) {
            if (f0a == null) {
                f0a = new c();
            }
        }
        return f0a;
    }

    @Override // a.a.a.a.f
    public void a(Runnable runnable) {
        this.d.a(runnable);
    }

    @Override // a.a.a.a.f
    public boolean a() {
        return this.d.a();
    }

    @Override // a.a.a.a.f
    public void b(Runnable runnable) {
        this.d.b(runnable);
    }
}
