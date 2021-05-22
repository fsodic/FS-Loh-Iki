package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.r;
import java.lang.ref.WeakReference;

public final class pa<R extends i> extends m<R> implements j<R> {

    /* renamed from: a  reason: collision with root package name */
    private l<? super R, ? extends i> f1284a;

    /* renamed from: b  reason: collision with root package name */
    private pa<? extends i> f1285b;

    /* renamed from: c  reason: collision with root package name */
    private volatile k<? super R> f1286c;
    private final Object d;
    private Status e;
    private final WeakReference<f> f;
    private final ra g;

    private final void a(Status status) {
        synchronized (this.d) {
            this.e = status;
            b(this.e);
        }
    }

    private final void b(Status status) {
        synchronized (this.d) {
            if (this.f1284a != null) {
                Status a2 = this.f1284a.a(status);
                r.a(a2, "onFailure must not return null");
                this.f1285b.a(a2);
            } else if (b()) {
                this.f1286c.a(status);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void b(i iVar) {
        if (iVar instanceof h) {
            try {
                ((h) iVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(iVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e2);
            }
        }
    }

    private final boolean b() {
        return (this.f1286c == null || this.f.get() == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f1286c = null;
    }

    @Override // com.google.android.gms.common.api.j
    public final void a(R r) {
        synchronized (this.d) {
            if (!r.E().N()) {
                a(r.E());
                b(r);
            } else if (this.f1284a != null) {
                C0157ka.a().submit(new qa(this, r));
            } else if (b()) {
                this.f1286c.b(r);
            }
        }
    }
}
