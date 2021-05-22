package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;

/* renamed from: com.google.android.gms.common.api.internal.c  reason: case insensitive filesystem */
public abstract class AbstractC0140c<R extends i, A extends a.b> extends BasePendingResult<R> implements AbstractC0142d<R> {
    private final a.c<A> q;
    private final a<?> r = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated
    protected AbstractC0140c(a.c<A> cVar, f fVar) {
        super(fVar);
        r.a(fVar, "GoogleApiClient must not be null");
        r.a(cVar);
        this.q = cVar;
    }

    private void a(RemoteException remoteException) {
        a(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0142d
    public final void a(Status status) {
        r.a(!status.N(), "Failed result must not be success");
        R b2 = b(status);
        a((i) b2);
        c(b2);
    }

    /* access modifiers changed from: protected */
    public abstract void a(A a2);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.gms.common.api.internal.c<R extends com.google.android.gms.common.api.i, A extends com.google.android.gms.common.api.a$b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC0142d
    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.a((i) obj);
    }

    public final void b(A a2) {
        if (a2 instanceof u) {
            a2 = ((u) a2).A();
        }
        try {
            a((a.b) a2);
        } catch (DeadObjectException e) {
            a((RemoteException) e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    /* access modifiers changed from: protected */
    public void c(R r2) {
    }

    public final a<?> g() {
        return this.r;
    }

    public final a.c<A> h() {
        return this.q;
    }
}
