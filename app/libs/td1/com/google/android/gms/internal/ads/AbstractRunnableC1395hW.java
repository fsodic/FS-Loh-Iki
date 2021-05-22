package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.hW  reason: case insensitive filesystem */
public abstract class AbstractRunnableC1395hW<I, O, F, T> extends DW<O> implements Runnable {
    private SW<? extends I> h;
    private F i;

    AbstractRunnableC1395hW(SW<? extends I> sw, F f) {
        C1945pV.a(sw);
        this.h = sw;
        C1945pV.a(f);
        this.i = f;
    }

    static <I, O> SW<O> a(SW<I> sw, AbstractC1187eV<? super I, ? extends O> eVVar, Executor executor) {
        C1945pV.a(eVVar);
        C1532jW jWVar = new C1532jW(sw, eVVar);
        sw.a(jWVar, UW.a(executor, jWVar));
        return jWVar;
    }

    static <I, O> SW<O> a(SW<I> sw, AbstractC2221tW<? super I, ? extends O> tWVar, Executor executor) {
        C1945pV.a(executor);
        C1601kW kWVar = new C1601kW(sw, tWVar);
        sw.a(kWVar, UW.a(executor, kWVar));
        return kWVar;
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f, I i2);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final void b() {
        a((Future<?>) this.h);
        this.h = null;
        this.i = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(T t);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final String d() {
        String str;
        SW<? extends I> sw = this.h;
        F f = this.i;
        String d = super.d();
        if (sw != null) {
            String valueOf = String.valueOf(sw);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        if (f != null) {
            String valueOf2 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(valueOf2).length());
            sb2.append(str);
            sb2.append("function=[");
            sb2.append(valueOf2);
            sb2.append("]");
            return sb2.toString();
        } else if (d == null) {
            return null;
        } else {
            String valueOf3 = String.valueOf(str);
            String valueOf4 = String.valueOf(d);
            return valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.google.android.gms.internal.ads.hW<I, O, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void run() {
        SW<? extends I> sw = this.h;
        F f = this.i;
        boolean z = true;
        boolean isCancelled = isCancelled() | (sw == null);
        if (f != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.h = null;
            if (sw.isCancelled()) {
                a((SW) sw);
                return;
            }
            try {
                try {
                    Object a2 = a((Object) f, JW.a((Future) sw));
                    this.i = null;
                    b(a2);
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                a(e.getCause());
            } catch (RuntimeException e2) {
                a((Throwable) e2);
            } catch (Error e3) {
                a((Throwable) e3);
            }
        }
    }
}
