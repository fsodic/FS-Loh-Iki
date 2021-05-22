package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import b.c.b.a.h.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C0146f;

/* access modifiers changed from: package-private */
public abstract class wa<T> extends AbstractC0155ja {

    /* renamed from: b  reason: collision with root package name */
    protected final f<T> f1306b;

    public wa(int i, f<T> fVar) {
        super(i);
        this.f1306b = fVar;
    }

    @Override // com.google.android.gms.common.api.internal.M
    public void a(Status status) {
        this.f1306b.b(new b(status));
    }

    @Override // com.google.android.gms.common.api.internal.M
    public final void a(C0146f.a<?> aVar) {
        try {
            d(aVar);
        } catch (DeadObjectException e) {
            a(M.b(e));
            throw e;
        } catch (RemoteException e2) {
            a(M.b(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.M
    public void a(RuntimeException runtimeException) {
        this.f1306b.b(runtimeException);
    }

    /* access modifiers changed from: protected */
    public abstract void d(C0146f.a<?> aVar);
}
