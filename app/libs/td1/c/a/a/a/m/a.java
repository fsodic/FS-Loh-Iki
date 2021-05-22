package c.a.a.a.m;

import java.util.concurrent.TimeUnit;

public abstract class a<T, C> {

    /* renamed from: a  reason: collision with root package name */
    private final String f954a;

    /* renamed from: b  reason: collision with root package name */
    private final T f955b;

    /* renamed from: c  reason: collision with root package name */
    private final C f956c;
    private final long d = System.currentTimeMillis();
    private final long e;
    private long f;
    private long g;
    private volatile Object h;

    public a(String str, T t, C c2, long j, TimeUnit timeUnit) {
        c.a.a.a.p.a.a((Object) t, "Route");
        c.a.a.a.p.a.a((Object) c2, "Connection");
        c.a.a.a.p.a.a(timeUnit, "Time unit");
        this.f954a = str;
        this.f955b = t;
        this.f956c = c2;
        this.e = j > 0 ? this.d + timeUnit.toMillis(j) : Long.MAX_VALUE;
        this.g = this.e;
    }

    public C a() {
        return this.f956c;
    }

    public synchronized void a(long j, TimeUnit timeUnit) {
        c.a.a.a.p.a.a(timeUnit, "Time unit");
        this.f = System.currentTimeMillis();
        this.g = Math.min(j > 0 ? this.f + timeUnit.toMillis(j) : Long.MAX_VALUE, this.e);
    }

    public void a(Object obj) {
        this.h = obj;
    }

    public synchronized boolean a(long j) {
        return j >= this.g;
    }

    public synchronized long b() {
        return this.g;
    }

    public T c() {
        return this.f955b;
    }

    public String toString() {
        return "[id:" + this.f954a + "][route:" + ((Object) this.f955b) + "][state:" + this.h + "]";
    }
}
