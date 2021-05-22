package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.u;

/* renamed from: com.google.android.gms.common.api.internal.v  reason: case insensitive filesystem */
public final class C0170v implements P {

    /* renamed from: a  reason: collision with root package name */
    private final Q f1303a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1304b = false;

    public C0170v(Q q) {
        this.f1303a = q;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T extends com.google.android.gms.common.api.internal.c<? extends com.google.android.gms.common.api.i, A> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.P
    public final <A extends a.b, T extends AbstractC0140c<? extends i, A>> T a(T t) {
        try {
            this.f1303a.n.y.a(t);
            K k = this.f1303a.n;
            a.f fVar = k.p.get(t.h());
            r.a(fVar, "Appropriate Api was not requested.");
            if (fVar.isConnected() || !this.f1303a.g.containsKey(t.h())) {
                boolean z = fVar instanceof u;
                a.b bVar = fVar;
                if (z) {
                    bVar = ((u) fVar).A();
                }
                t.b(bVar == 1 ? 1 : 0);
                return t;
            }
            t.a(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.f1303a.a(new C0171w(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void a(b bVar, a<?> aVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final boolean a() {
        if (this.f1304b) {
            return false;
        }
        if (this.f1303a.n.h()) {
            this.f1304b = true;
            for (pa paVar : this.f1303a.n.x) {
                paVar.a();
            }
            return false;
        }
        this.f1303a.a((b) null);
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void b() {
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f1304b) {
            this.f1304b = false;
            this.f1303a.n.y.a();
            a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void connect() {
        if (this.f1304b) {
            this.f1304b = false;
            this.f1303a.a(new C0172x(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void onConnected(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.P
    public final void onConnectionSuspended(int i) {
        this.f1303a.a((b) null);
        this.f1303a.o.a(i, this.f1304b);
    }
}
