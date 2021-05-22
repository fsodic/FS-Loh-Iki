package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* access modifiers changed from: package-private */
public abstract class RW<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static final Runnable f3016a = new TW();

    /* renamed from: b  reason: collision with root package name */
    private static final Runnable f3017b = new TW();

    /* renamed from: c  reason: collision with root package name */
    private static final Runnable f3018c = new TW();

    RW() {
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Runnable runnable = (Runnable) get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f3017b)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (((Runnable) getAndSet(f3016a)) == f3018c) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a(T t, Throwable th);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract T c();

    /* access modifiers changed from: package-private */
    public abstract String d();

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IfNode.isSame(IfNode.java:122)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.RW.run():void");
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f3016a) {
            str = "running=[DONE]";
        } else if (runnable == f3017b) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            str = sb.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String d = d();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(d).length());
        sb2.append(str);
        sb2.append(", ");
        sb2.append(d);
        return sb2.toString();
    }
}
