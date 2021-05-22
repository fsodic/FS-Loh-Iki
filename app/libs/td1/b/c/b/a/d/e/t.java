package b.c.b.a.d.e;

import java.util.concurrent.atomic.AtomicReference;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<s> f467a = new AtomicReference<>();

    public final void a() {
        s sVar = this.f467a.get();
        if (sVar != null) {
            sVar.a();
        }
    }
}
