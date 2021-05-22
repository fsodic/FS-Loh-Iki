package com.google.android.gms.common.api.internal;

/* access modifiers changed from: package-private */
public abstract class S {

    /* renamed from: a  reason: collision with root package name */
    private final P f1234a;

    protected S(P p) {
        this.f1234a = p;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void a(Q q) {
        q.f1231a.lock();
        try {
            if (q.k == this.f1234a) {
                a();
            }
        } finally {
            q.f1231a.unlock();
        }
    }
}
