package b.c.b.a.d.e;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private final Object f465a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, AtomicInteger> f466b;

    public final void a() {
        synchronized (this.f465a) {
            for (Map.Entry<String, AtomicInteger> entry : this.f466b.entrySet()) {
                a(entry.getKey(), entry.getValue().get());
            }
            this.f466b.clear();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(String str, int i);
}
