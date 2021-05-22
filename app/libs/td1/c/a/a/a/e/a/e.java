package c.a.a.a.e.a;

import c.a.a.a.e.b.b;
import c.a.a.a.p.a;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<b, Integer> f656a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f657b;

    public e() {
        this(2);
    }

    public e(int i) {
        this.f656a = new ConcurrentHashMap<>();
        a(i);
    }

    @Override // c.a.a.a.e.a.d
    public int a(b bVar) {
        a.a(bVar, "HTTP route");
        Integer num = this.f656a.get(bVar);
        return num != null ? num.intValue() : this.f657b;
    }

    public void a(int i) {
        a.b(i, "Default max per route");
        this.f657b = i;
    }

    public String toString() {
        return this.f656a.toString();
    }
}
