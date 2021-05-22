package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.cocos2dx.lib.BuildConfig;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.bW  reason: case insensitive filesystem */
public abstract class AbstractRunnableC0982bW<V, X extends Throwable, F, T> extends DW<V> implements Runnable {
    private SW<? extends V> h;
    private Class<X> i;
    private F j;

    AbstractRunnableC0982bW(SW<? extends V> sw, Class<X> cls, F f) {
        C1945pV.a(sw);
        this.h = sw;
        C1945pV.a(cls);
        this.i = cls;
        C1945pV.a(f);
        this.j = f;
    }

    static <X extends Throwable, V> SW<V> a(SW<? extends V> sw, Class<X> cls, AbstractC2221tW<? super X, ? extends V> tWVar, Executor executor) {
        C0913aW aWVar = new C0913aW(sw, cls, tWVar);
        sw.a(aWVar, UW.a(executor, aWVar));
        return aWVar;
    }

    /* access modifiers changed from: package-private */
    public abstract T a(F f, X x);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final void b() {
        a((Future<?>) this.h);
        this.h = null;
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void b(T t);

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.C1120dW
    public final String d() {
        String str;
        SW<? extends V> sw = this.h;
        Class<X> cls = this.i;
        F f = this.j;
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
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (d == null) {
            return null;
        } else {
            String valueOf4 = String.valueOf(str);
            String valueOf5 = String.valueOf(d);
            return valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.google.android.gms.internal.ads.bW<V, X extends java.lang.Throwable, F, T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractRunnableC0982bW.run():void");
    }
}
