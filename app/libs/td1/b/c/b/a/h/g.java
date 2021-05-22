package b.c.b.a.h;

import com.google.android.gms.common.internal.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class g {
    public static <TResult> e<TResult> a(TResult tresult) {
        p pVar = new p();
        pVar.a((Object) tresult);
        return pVar;
    }

    public static <TResult> e<TResult> a(Executor executor, Callable<TResult> callable) {
        r.a(executor, "Executor must not be null");
        r.a(callable, "Callback must not be null");
        p pVar = new p();
        executor.execute(new q(pVar, callable));
        return pVar;
    }
}
