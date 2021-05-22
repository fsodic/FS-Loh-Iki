package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1120dW;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
public class PW<V> implements SW<V> {

    /* renamed from: a  reason: collision with root package name */
    static final SW<?> f2833a = new PW(null);

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f2834b = Logger.getLogger(PW.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private final V f2835c;

    /* access modifiers changed from: package-private */
    public static final class a<V> extends C1120dW.j<V> {
        a(Throwable th) {
            a(th);
        }
    }

    PW(V v) {
        this.f2835c = v;
    }

    @Override // com.google.android.gms.internal.ads.SW
    public void a(Runnable runnable, Executor executor) {
        C1945pV.a(runnable, "Runnable was null.");
        C1945pV.a(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f2834b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f2835c;
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) {
        C1945pV.a(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f2835c);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }
}
