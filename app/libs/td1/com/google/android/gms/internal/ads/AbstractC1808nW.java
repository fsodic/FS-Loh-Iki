package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.nW  reason: case insensitive filesystem */
public abstract class AbstractC1808nW<InputT, OutputT> extends AbstractC2015qW<OutputT> {
    private static final Logger l = Logger.getLogger(AbstractC1808nW.class.getName());
    private AbstractC2634zV<? extends SW<? extends InputT>> m;
    private final boolean n;
    private final boolean o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.nW$a */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    AbstractC1808nW(AbstractC2634zV<? extends SW<? extends InputT>> zVVar, boolean z, boolean z2) {
        super(zVVar.size());
        C1945pV.a(zVVar);
        this.m = zVVar;
        this.n = z;
        this.o = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.internal.ads.nW<InputT, OutputT> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    public final void a(int i, Future<? extends InputT> future) {
        try {
            a(i, JW.a((Future) future));
        } catch (ExecutionException e) {
            b(e.getCause());
        } catch (Throwable th) {
            b(th);
        }
    }

    /* access modifiers changed from: private */
    public final void a(AbstractC2634zV<? extends Future<? extends InputT>> zVVar) {
        int i = i();
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalStateException("Less than 0 remaining futures");
        } else if (i == 0) {
            if (zVVar != null) {
                WV wv = (WV) zVVar.iterator();
                while (wv.hasNext()) {
                    Future<? extends InputT> future = (Future) wv.next();
                    if (!future.isCancelled()) {
                        a(i2, (Future) future);
                    }
                    i2++;
                }
            }
            j();
            l();
            a(a.ALL_INPUT_FUTURES_PROCESSED);
        }
    }

    private static boolean a(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    private final void b(Throwable th) {
        C1945pV.a(th);
        if (this.n && !a(th) && a(h(), th)) {
            c(th);
        } else if (th instanceof Error) {
            c(th);
        }
    }

    private static void c(Throwable th) {
        l.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
    }

    /* access modifiers changed from: package-private */
    public abstract void a(int i, InputT inputt);

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        C1945pV.a(aVar);
        this.m = null;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.AbstractC2015qW
    public final void a(Set<Throwable> set) {
        C1945pV.a(set);
        if (!isCancelled()) {
            a(set, a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final void b() {
        super.b();
        AbstractC2634zV<? extends SW<? extends InputT>> zVVar = this.m;
        a(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (zVVar != null)) {
            boolean e = e();
            WV wv = (WV) zVVar.iterator();
            while (wv.hasNext()) {
                ((Future) wv.next()).cancel(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final String d() {
        AbstractC2634zV<? extends SW<? extends InputT>> zVVar = this.m;
        if (zVVar == null) {
            return super.d();
        }
        String valueOf = String.valueOf(zVVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("futures=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        if (this.m.isEmpty()) {
            l();
        } else if (this.n) {
            int i = 0;
            WV wv = (WV) this.m.iterator();
            while (wv.hasNext()) {
                SW sw = (SW) wv.next();
                sw.a(new RunnableC1739mW(this, sw, i), EnumC2566yW.INSTANCE);
                i++;
            }
        } else {
            RunnableC1877oW oWVar = new RunnableC1877oW(this, this.o ? this.m : null);
            WV wv2 = (WV) this.m.iterator();
            while (wv2.hasNext()) {
                ((SW) wv2.next()).a(oWVar, EnumC2566yW.INSTANCE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void l();
}
