package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import b.c.b.a.b.b;
import com.google.android.gms.common.api.f;

final class H implements f.b, f.c {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C0173y f1216a;

    private H(C0173y yVar) {
        this.f1216a = yVar;
    }

    /* synthetic */ H(C0173y yVar, RunnableC0174z zVar) {
        this(yVar);
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnected(Bundle bundle) {
        if (this.f1216a.r.l()) {
            this.f1216a.f1310b.lock();
            try {
                if (this.f1216a.k != null) {
                    this.f1216a.k.a(new F(this.f1216a));
                    this.f1216a.f1310b.unlock();
                }
            } finally {
                this.f1216a.f1310b.unlock();
            }
        } else {
            this.f1216a.k.a(new F(this.f1216a));
        }
    }

    @Override // com.google.android.gms.common.api.f.c
    public final void onConnectionFailed(b bVar) {
        this.f1216a.f1310b.lock();
        try {
            if (this.f1216a.a(bVar)) {
                this.f1216a.f();
                this.f1216a.d();
            } else {
                this.f1216a.b((C0173y) bVar);
            }
        } finally {
            this.f1216a.f1310b.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.f.b
    public final void onConnectionSuspended(int i) {
    }
}
