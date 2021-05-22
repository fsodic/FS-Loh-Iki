package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import b.c.b.a.b.b;

final class Ia implements AbstractC0149ga {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Ga f1218a;

    private Ia(Ga ga) {
        this.f1218a = ga;
    }

    /* synthetic */ Ia(Ga ga, Ha ha) {
        this(ga);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(int i, boolean z) {
        Ga.a(this.f1218a).lock();
        try {
            if (!Ga.c(this.f1218a) && Ga.d(this.f1218a) != null) {
                if (Ga.d(this.f1218a).P()) {
                    Ga.a(this.f1218a, true);
                    Ga.e(this.f1218a).onConnectionSuspended(i);
                }
            }
            Ga.a(this.f1218a, false);
            Ga.a(this.f1218a, i, z);
        } finally {
            Ga.a(this.f1218a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(Bundle bundle) {
        Ga.a(this.f1218a).lock();
        try {
            Ga.a(this.f1218a, bundle);
            Ga.a(this.f1218a, b.f260a);
            Ga.b(this.f1218a);
        } finally {
            Ga.a(this.f1218a).unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0149ga
    public final void a(b bVar) {
        Ga.a(this.f1218a).lock();
        try {
            Ga.a(this.f1218a, bVar);
            Ga.b(this.f1218a);
        } finally {
            Ga.a(this.f1218a).unlock();
        }
    }
}
