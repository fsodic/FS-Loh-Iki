package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.dW  reason: case insensitive filesystem */
public class C1120dW<V> extends AbstractC1809nX implements SW<V> {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f4084a;

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f4085b = Logger.getLogger(C1120dW.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final a f4086c;
    private static final Object d = new Object();
    private volatile Object e;
    private volatile d f;
    private volatile k g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$a */
    public static abstract class a {
        private a() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(k kVar, k kVar2);

        /* access modifiers changed from: package-private */
        public abstract void a(k kVar, Thread thread);

        /* access modifiers changed from: package-private */
        public abstract boolean a(C1120dW<?> dWVar, d dVar, d dVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(C1120dW<?> dWVar, k kVar, k kVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean a(C1120dW<?> dWVar, Object obj, Object obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final b f4087a = new b(new C1188eW("Failure occurred while trying to finish a future."));

        /* renamed from: b  reason: collision with root package name */
        final Throwable f4088b;

        b(Throwable th) {
            C1945pV.a(th);
            this.f4088b = th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final c f4089a;

        /* renamed from: b  reason: collision with root package name */
        static final c f4090b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f4091c;
        final Throwable d;

        static {
            if (C1120dW.f4084a) {
                f4090b = null;
                f4089a = null;
                return;
            }
            f4090b = new c(false, null);
            f4089a = new c(true, null);
        }

        c(boolean z, Throwable th) {
            this.f4091c = z;
            this.d = th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        static final d f4092a = new d(null, null);

        /* renamed from: b  reason: collision with root package name */
        final Runnable f4093b;

        /* renamed from: c  reason: collision with root package name */
        final Executor f4094c;
        d d;

        d(Runnable runnable, Executor executor) {
            this.f4093b = runnable;
            this.f4094c = executor;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$e */
    public static final class e<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final C1120dW<V> f4095a;

        /* renamed from: b  reason: collision with root package name */
        final SW<? extends V> f4096b;

        e(C1120dW<V> dWVar, SW<? extends V> sw) {
            this.f4095a = dWVar;
            this.f4096b = sw;
        }

        public final void run() {
            if (((C1120dW) this.f4095a).e == this) {
                if (C1120dW.f4086c.a((C1120dW<?>) this.f4095a, (Object) this, C1120dW.c(this.f4096b))) {
                    C1120dW.e(this.f4095a);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.dW$f */
    static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, Thread> f4097a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f4098b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<C1120dW, k> f4099c;
        final AtomicReferenceFieldUpdater<C1120dW, d> d;
        final AtomicReferenceFieldUpdater<C1120dW, Object> e;

        f(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1120dW, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1120dW, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1120dW, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4097a = atomicReferenceFieldUpdater;
            this.f4098b = atomicReferenceFieldUpdater2;
            this.f4099c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final void a(k kVar, k kVar2) {
            this.f4098b.lazySet(kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final void a(k kVar, Thread thread) {
            this.f4097a.lazySet(kVar, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, d dVar, d dVar2) {
            return this.d.compareAndSet(dWVar, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, k kVar, k kVar2) {
            return this.f4099c.compareAndSet(dWVar, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, Object obj, Object obj2) {
            return this.e.compareAndSet(dWVar, obj, obj2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$g */
    public interface g<V> extends SW<V> {
    }

    /* renamed from: com.google.android.gms.internal.ads.dW$h */
    static final class h extends a {
        private h() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final void a(k kVar, k kVar2) {
            kVar.f4105c = kVar2;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final void a(k kVar, Thread thread) {
            kVar.f4104b = thread;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, d dVar, d dVar2) {
            synchronized (dWVar) {
                if (((C1120dW) dWVar).f != dVar) {
                    return false;
                }
                ((C1120dW) dWVar).f = dVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, k kVar, k kVar2) {
            synchronized (dWVar) {
                if (((C1120dW) dWVar).g != kVar) {
                    return false;
                }
                ((C1120dW) dWVar).g = kVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, Object obj, Object obj2) {
            synchronized (dWVar) {
                if (((C1120dW) dWVar).e != obj) {
                    return false;
                }
                ((C1120dW) dWVar).e = obj2;
                return true;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.dW$i */
    static final class i extends a {

        /* renamed from: a  reason: collision with root package name */
        static final Unsafe f4100a;

        /* renamed from: b  reason: collision with root package name */
        static final long f4101b;

        /* renamed from: c  reason: collision with root package name */
        static final long f4102c;
        static final long d;
        static final long e;
        static final long f;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
        static {
            /*
            // Method dump skipped, instructions count: 108
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1120dW.i.<clinit>():void");
        }

        private i() {
            super();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final void a(k kVar, k kVar2) {
            f4100a.putObject(kVar, f, kVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final void a(k kVar, Thread thread) {
            f4100a.putObject(kVar, e, thread);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, d dVar, d dVar2) {
            return f4100a.compareAndSwapObject(dWVar, f4101b, dVar, dVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, k kVar, k kVar2) {
            return f4100a.compareAndSwapObject(dWVar, f4102c, kVar, kVar2);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.ads.C1120dW.a
        public final boolean a(C1120dW<?> dWVar, Object obj, Object obj2) {
            return f4100a.compareAndSwapObject(dWVar, d, obj, obj2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.dW$j */
    static abstract class j<V> extends C1120dW<V> implements g<V> {
        j() {
        }

        @Override // java.util.concurrent.Future, com.google.android.gms.internal.ads.C1120dW
        public final V get(long j, TimeUnit timeUnit) {
            return (V) C1120dW.super.get(j, timeUnit);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.internal.ads.dW$k */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        static final k f4103a = new k(false);

        /* renamed from: b  reason: collision with root package name */
        volatile Thread f4104b;

        /* renamed from: c  reason: collision with root package name */
        volatile k f4105c;

        k() {
            C1120dW.f4086c.a(this, Thread.currentThread());
        }

        private k(boolean z) {
        }

        /* access modifiers changed from: package-private */
        public final void a(k kVar) {
            C1120dW.f4086c.a(this, kVar);
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        a aVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f4084a = z;
        try {
            aVar = new i();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            th = th;
            th2 = th3;
            aVar = new h();
        }
        f4086c = aVar;
        if (th2 != null) {
            f4085b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th);
            f4085b.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
    }

    protected C1120dW() {
    }

    private final void a(k kVar) {
        kVar.f4104b = null;
        while (true) {
            k kVar2 = this.g;
            if (kVar2 != k.f4103a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.f4105c;
                    if (kVar2.f4104b != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.f4105c = kVar4;
                        if (kVar3.f4104b == null) {
                        }
                    } else if (f4086c.a((C1120dW<?>) this, kVar2, kVar4)) {
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    private final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object b2 = b((Future) this);
            sb.append("SUCCESS, result=[");
            a(sb, b2);
            sb.append(str);
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            str = " thrown from get()]";
            sb.append(str);
        }
    }

    private final void a(StringBuilder sb, Object obj) {
        if (obj == this) {
            try {
                sb.append("this future");
            } catch (RuntimeException | StackOverflowError e2) {
                sb.append("Exception thrown from implementation: ");
                sb.append(e2.getClass());
            }
        } else {
            sb.append(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    private static V b(Object obj) {
        if (obj instanceof c) {
            Throwable th = ((c) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f4088b);
        } else if (obj == d) {
            return null;
        } else {
            return obj;
        }
    }

    private static <V> V b(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f4085b;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57 + String.valueOf(valueOf2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb.toString(), (Throwable) e2);
        }
    }

    /* access modifiers changed from: private */
    public static Object c(SW<?> sw) {
        Throwable a2;
        if (sw instanceof g) {
            Object obj = ((C1120dW) sw).e;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.f4091c) {
                return obj;
            }
            Throwable th = cVar.d;
            return th != null ? new c(false, th) : c.f4090b;
        } else if ((sw instanceof AbstractC1809nX) && (a2 = C1671lX.a((AbstractC1809nX) sw)) != null) {
            return new b(a2);
        } else {
            boolean isCancelled = sw.isCancelled();
            if ((!f4084a) && isCancelled) {
                return c.f4090b;
            }
            try {
                Object b2 = b((Future) sw);
                if (!isCancelled) {
                    return b2 == null ? d : b2;
                }
                String valueOf = String.valueOf(sw);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new c(false, new IllegalArgumentException(sb.toString()));
            } catch (ExecutionException e2) {
                if (!isCancelled) {
                    return new b(e2.getCause());
                }
                String valueOf2 = String.valueOf(sw);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
                sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb2.append(valueOf2);
                return new c(false, new IllegalArgumentException(sb2.toString(), e2));
            } catch (CancellationException e3) {
                if (isCancelled) {
                    return new c(false, e3);
                }
                String valueOf3 = String.valueOf(sw);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 77);
                sb3.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb3.append(valueOf3);
                return new b(new IllegalArgumentException(sb3.toString(), e3));
            } catch (Throwable th2) {
                return new b(th2);
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0002 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0002 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.dW<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.dW] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.dW, com.google.android.gms.internal.ads.dW<V>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.internal.ads.dW$a] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(com.google.android.gms.internal.ads.C1120dW<?> r5) {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            com.google.android.gms.internal.ads.dW$k r2 = r5.g
            com.google.android.gms.internal.ads.dW$a r3 = com.google.android.gms.internal.ads.C1120dW.f4086c
            com.google.android.gms.internal.ads.dW$k r4 = com.google.android.gms.internal.ads.C1120dW.k.f4103a
            boolean r3 = r3.a(r5, r2, r4)
            if (r3 == 0) goto L_0x0002
        L_0x000e:
            if (r2 == 0) goto L_0x001c
            java.lang.Thread r3 = r2.f4104b
            if (r3 == 0) goto L_0x0019
            r2.f4104b = r0
            java.util.concurrent.locks.LockSupport.unpark(r3)
        L_0x0019:
            com.google.android.gms.internal.ads.dW$k r2 = r2.f4105c
            goto L_0x000e
        L_0x001c:
            r5.b()
        L_0x001f:
            com.google.android.gms.internal.ads.dW$d r2 = r5.f
            com.google.android.gms.internal.ads.dW$a r3 = com.google.android.gms.internal.ads.C1120dW.f4086c
            com.google.android.gms.internal.ads.dW$d r4 = com.google.android.gms.internal.ads.C1120dW.d.f4092a
            boolean r3 = r3.a(r5, r2, r4)
            if (r3 == 0) goto L_0x001f
        L_0x002b:
            r5 = r1
            r1 = r2
            if (r1 == 0) goto L_0x0034
            com.google.android.gms.internal.ads.dW$d r2 = r1.d
            r1.d = r5
            goto L_0x002b
        L_0x0034:
            if (r5 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.dW$d r1 = r5.d
            java.lang.Runnable r2 = r5.f4093b
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C1120dW.e
            if (r3 == 0) goto L_0x0055
            com.google.android.gms.internal.ads.dW$e r2 = (com.google.android.gms.internal.ads.C1120dW.e) r2
            com.google.android.gms.internal.ads.dW<V> r5 = r2.f4095a
            java.lang.Object r3 = r5.e
            if (r3 != r2) goto L_0x005a
            com.google.android.gms.internal.ads.SW<? extends V> r3 = r2.f4096b
            java.lang.Object r3 = c(r3)
            com.google.android.gms.internal.ads.dW$a r4 = com.google.android.gms.internal.ads.C1120dW.f4086c
            boolean r2 = r4.a(r5, r2, r3)
            if (r2 != 0) goto L_0x0002
            goto L_0x005a
        L_0x0055:
            java.util.concurrent.Executor r5 = r5.f4094c
            b(r2, r5)
        L_0x005a:
            r5 = r1
            goto L_0x0034
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1120dW.e(com.google.android.gms.internal.ads.dW):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC1809nX
    public final Throwable a() {
        if (!(this instanceof g)) {
            return null;
        }
        Object obj = this.e;
        if (obj instanceof b) {
            return ((b) obj).f4088b;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.SW
    public void a(Runnable runnable, Executor executor) {
        d dVar;
        C1945pV.a(runnable, "Runnable was null.");
        C1945pV.a(executor, "Executor was null.");
        if (isDone() || (dVar = this.f) == d.f4092a) {
            b(runnable, executor);
        }
        d dVar2 = new d(runnable, executor);
        do {
            dVar2.d = dVar;
            if (!f4086c.a((C1120dW<?>) this, dVar, dVar2)) {
                dVar = this.f;
            } else {
                return;
            }
        } while (dVar != d.f4092a);
        b(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    public final void a(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(e());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(SW<? extends V> sw) {
        e eVar;
        b bVar;
        C1945pV.a(sw);
        Object obj = this.e;
        if (obj == null) {
            if (sw.isDone()) {
                if (!f4086c.a((C1120dW<?>) this, (Object) null, c(sw))) {
                    return false;
                }
                e(this);
                return true;
            }
            eVar = new e(this, sw);
            if (f4086c.a((C1120dW<?>) this, (Object) null, (Object) eVar)) {
                try {
                    sw.a(eVar, EnumC2566yW.INSTANCE);
                } catch (Throwable unused) {
                    bVar = b.f4087a;
                }
                return true;
            }
            obj = this.e;
        }
        if (obj instanceof c) {
            sw.cancel(((c) obj).f4091c);
        }
        return false;
        f4086c.a((C1120dW<?>) this, (Object) eVar, (Object) bVar);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(V v) {
        if (v == null) {
            v = (V) d;
        }
        if (!f4086c.a((C1120dW<?>) this, (Object) null, (Object) v)) {
            return false;
        }
        e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        C1945pV.a(th);
        if (!f4086c.a((C1120dW<?>) this, (Object) null, (Object) new b(th))) {
            return false;
        }
        e(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    /* access modifiers changed from: protected */
    public void c() {
    }

    public boolean cancel(boolean z) {
        Object obj = this.e;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        c cVar = f4084a ? new c(z, new CancellationException("Future.cancel() was called.")) : z ? c.f4089a : c.f4090b;
        boolean z2 = false;
        Object obj2 = obj;
        C1120dW<V> dWVar = this;
        while (true) {
            if (f4086c.a((C1120dW<?>) dWVar, obj2, (Object) cVar)) {
                if (z) {
                    dWVar.c();
                }
                e(dWVar);
                if (!(obj2 instanceof e)) {
                    return true;
                }
                SW<? extends V> sw = ((e) obj2).f4096b;
                if (sw instanceof g) {
                    dWVar = (C1120dW) sw;
                    obj2 = dWVar.e;
                    if (!(obj2 == null) && !(obj2 instanceof e)) {
                        return true;
                    }
                    z2 = true;
                } else {
                    sw.cancel(z);
                    return true;
                }
            } else {
                obj2 = dWVar.e;
                if (!(obj2 instanceof e)) {
                    return z2;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean e() {
        Object obj = this.e;
        return (obj instanceof c) && ((c) obj).f4091c;
    }

    @Override // java.util.concurrent.Future
    public V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.e;
            if ((obj2 != null) && (!(obj2 instanceof e))) {
                return (V) b(obj2);
            }
            k kVar = this.g;
            if (kVar != k.f4103a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (f4086c.a((C1120dW<?>) this, kVar, kVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.e;
                            } else {
                                a(kVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return (V) b(obj);
                    }
                    kVar = this.g;
                } while (kVar != k.f4103a);
            }
            return (V) b(this.e);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.e;
            if ((obj != null) && (!(obj instanceof e))) {
                return (V) b(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                k kVar = this.g;
                if (kVar != k.f4103a) {
                    k kVar2 = new k();
                    do {
                        kVar2.a(kVar);
                        if (f4086c.a((C1120dW<?>) this, kVar, kVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.e;
                                    if ((obj2 != null) && (!(obj2 instanceof e))) {
                                        return (V) b(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    a(kVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            a(kVar2);
                        } else {
                            kVar = this.g;
                        }
                    } while (kVar != k.f4103a);
                }
                return (V) b(this.e);
            }
            while (nanos > 0) {
                Object obj3 = this.e;
                if ((obj3 != null) && (!(obj3 instanceof e))) {
                    return (V) b(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String dWVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String lowerCase2 = timeUnit.toString().toLowerCase(Locale.ROOT);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            sb.append("Waited ");
            sb.append(j2);
            sb.append(" ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < 0) {
                String concat = String.valueOf(sb2).concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                boolean z = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String valueOf = String.valueOf(concat);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(lowerCase).length());
                    sb3.append(valueOf);
                    sb3.append(convert);
                    sb3.append(" ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = String.valueOf(sb4).concat(",");
                    }
                    concat = String.valueOf(sb4).concat(" ");
                }
                if (z) {
                    String valueOf2 = String.valueOf(concat);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                    sb5.append(valueOf2);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = String.valueOf(concat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(sb2).concat(" but future completed as timeout expired"));
            }
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb2).length() + 5 + String.valueOf(dWVar).length());
            sb6.append(sb2);
            sb6.append(" for ");
            sb6.append(dWVar);
            throw new TimeoutException(sb6.toString());
        }
        throw new InterruptedException();
    }

    public boolean isCancelled() {
        return this.e instanceof c;
    }

    public boolean isDone() {
        Object obj = this.e;
        boolean z = true;
        boolean z2 = obj != null;
        if (obj instanceof e) {
            z = false;
        }
        return z2 & z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1120dW.toString():java.lang.String");
    }
}
