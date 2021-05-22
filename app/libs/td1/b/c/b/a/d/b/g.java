package b.c.b.a.d.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class g implements d {
    private g() {
    }

    @Override // b.c.b.a.d.b.d
    public final ExecutorService a(int i, ThreadFactory threadFactory, int i2) {
        return Executors.newFixedThreadPool(2, threadFactory);
    }
}
