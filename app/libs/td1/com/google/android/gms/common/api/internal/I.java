package com.google.android.gms.common.api.internal;

abstract class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0173y f1217a;

    private I(C0173y yVar) {
        this.f1217a = yVar;
    }

    /* synthetic */ I(C0173y yVar, RunnableC0174z zVar) {
        this(yVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void run() {
        this.f1217a.f1310b.lock();
        try {
            if (!Thread.interrupted()) {
                a();
            }
        } catch (RuntimeException e) {
            this.f1217a.f1309a.a(e);
        } catch (Throwable th) {
            this.f1217a.f1310b.unlock();
            throw th;
        }
        this.f1217a.f1310b.unlock();
    }
}
